package com.dms.java.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(simpleDateFormat.format(calendar.getTime()));
        calendar.add(Calendar.MONTH,3);

        System.out.println(simpleDateFormat.format(calendar.getTime()));

    }
}
