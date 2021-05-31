package com.dms.java.util;

import org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch;
import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;

public class DiffTest {

    @Test
    public void test1(){
        String error = "ORA-00001: 违反唯一约束条件 (usr_zjs.SYS20210330104728)";
        String errorTemp = "ORA-00001: 违反唯一约束条件 (*.$)";

//        String error = "ORA-00904: \"BY3\": 标识符无效";
//        String errorTemp = "ORA-00904: \"${key}\": 标识符无效";

        DiffMatchPatch dmp = new DiffMatchPatch();
        LinkedList<DiffMatchPatch.Diff> diffs = dmp.diffMain(errorTemp,error);

        for (Iterator<DiffMatchPatch.Diff> it =diffs.iterator(); it.hasNext();){
            DiffMatchPatch.Diff diff = it.next();
            if (diff.text.equals("*")){
                System.out.println(it.next().text);
            }
            if (diff.text.equals("$")){
                System.out.println(it.next().text);
            }
        }
    }
}
