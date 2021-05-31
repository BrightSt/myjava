package com.dms.java;

import org.apache.commons.lang3.StringUtils;
import org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch;
import org.junit.Test;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class CommonTest {

    @Test
    public void test1(){
        String error = "ORA-12899: 列 \"USR_ZSJ\".\"T_TEST35\".\"BY2\" 的值太大 (实际值: 44, 最大值: 4)";
        String errorTemp = "ORA-12899: 列 \"${AA}\".\"${BB}\".\"${key}\" 的值太大 (实际值: 44, 最大值: 4)";

//        String error = "ORA-00904: \"BY3\": 标识符无效";
//        String errorTemp = "ORA-00904: \"${key}\": 标识符无效";

        DiffMatchPatch dmp = new DiffMatchPatch();
        LinkedList<DiffMatchPatch.Diff> diffs = dmp.diffMain(errorTemp,error,false);

        for (Iterator<DiffMatchPatch.Diff> it =diffs.iterator(); it.hasNext();){
            DiffMatchPatch.Diff diff = it.next();
            if (diff.text.equals("${key}")){
                System.out.println(it.next().text);
            }
        }
    }
}
