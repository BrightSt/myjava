package com.dms.java.java8.stream;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Create {

    @Test
    public void create1(){
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();
        Stream<String> parallelStream = list.parallelStream();
    }

    @Test
    public void create2(){
        Integer[] nums = new Integer[10];
        Stream<Integer> stream = Arrays.stream(nums);
    }

    @Test
    public void create3(){
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8);

        Stream<Integer> stream1 = Stream.iterate(0,x->x+2).limit(6);
        stream1.forEach(System.out::println);

        Stream<Double> stream2 = Stream.generate(Math::random).limit(2);
        stream2.forEach(System.out::println);
    }

    @Test
    public void test1(){
        Stream<Integer> stream = Stream.of(6, 4, 6, 7, 3, 9, 8, 10, 12, 14, 14);

        Stream<Integer> newStream = stream.filter(s -> s > 5) //6 6 7 9 8 10 12 14 14
                .distinct() //6 7 9 8 10 12 14
                .skip(2) //9 8 10 12 14
                .limit(2); //9 8
        newStream.forEach(System.out::println);
    }

    @Test
    public void test2(){
        List<String> list = Arrays.asList("a,b,c", "1,2,3");

        //将每个元素转成一个新的且不带逗号的元素
        Stream<String> s1 = list.stream().map(s -> s.replaceAll(",", ""));
        s1.forEach(System.out::println); // abc  123

        Stream<String> s3 = list.stream().flatMap(s -> {
            //将每个元素转换成一个stream
            String[] split = s.split(",");
            Stream<String> s2 = Arrays.stream(split);
            return s2;
        });
        s3.forEach(System.out::println); // a b c 1 2 3
    }

    @Test
    public void test3(){
        Student s1 = new Student("aa", 10,1);
        Student s2 = new Student("bb", 20,2);
        Student s3 = new Student("cc", 10,3);
        List<Student> list = Arrays.asList(s1, s2, s3);

        //装成list
        List<Integer> ageList = list.stream().map(Student::getAge).collect(Collectors.toList()); // [10, 20, 10]

        //转成set
        Set<Integer> ageSet = list.stream().map(Student::getAge).collect(Collectors.toSet()); // [20, 10]

        //转成map,注:key不能相同，否则报错
        Map<String, Integer> studentMap = list.stream().collect(Collectors.toMap(Student::getName, Student::getAge)); // {cc=10, bb=20, aa=10}

        //字符串分隔符连接
        String joinName = list.stream().map(Student::getName).collect(Collectors.joining("','", "('", "')")); // (aa,bb,cc)
        System.out.println(joinName);
//聚合操作
//1.学生总数
        Long count = list.stream().collect(Collectors.counting()); // 3
//2.最大年龄 (最小的minBy同理)
        Integer maxAge = list.stream().map(Student::getAge).collect(Collectors.maxBy(Integer::compare)).get(); // 20
//3.所有人的年龄
        Integer sumAge = list.stream().collect(Collectors.summingInt(Student::getAge)); // 40
//4.平均年龄
        Double averageAge = list.stream().collect(Collectors.averagingDouble(Student::getAge)); // 13.333333333333334
// 带上以上所有方法
        DoubleSummaryStatistics statistics = list.stream().collect(Collectors.summarizingDouble(Student::getAge));
        System.out.println("count:" + statistics.getCount() + ",max:" + statistics.getMax() + ",sum:" + statistics.getSum() + ",average:" + statistics.getAverage());

//分组
        Map<Integer, List<Student>> ageMap = list.stream().collect(Collectors.groupingBy(Student::getAge));
//多重分组,先根据类型分再根据年龄分
//        Map<Integer, Map<Integer, List<Student>>> typeAgeMap = list.stream().collect(Collectors.groupingBy(Student::getType, Collectors.groupingBy(Student::getAge)));

//分区
//分成两部分，一部分大于10岁，一部分小于等于10岁
        Map<Boolean, List<Student>> partMap = list.stream().collect(Collectors.partitioningBy(v -> v.getAge() > 10));

//规约
//        Integer allAge = list.stream().map(Student::getAge).collect(Collectors.reducing(Integer::sum)).get(); //40
    }
}



class Student {
    private String name ;
    private Integer age;
    private Integer num;
    private Integer type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Student(String name, Integer age, Integer num) {
        this.name = name;
        this.age = age;
        this.num = num;
    }
}
