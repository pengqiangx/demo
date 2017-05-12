package com.github.pengqiangx.demo.javacore.match;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pengqiang on 2017/5/8.
 */
public class ObtainDateFromText {

    @Test
    public void test(){
        String text = "TO_DATE(' 2017-04-20 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')";
        System.out.print(run(text));
    }
    @Test
    public void test2(){
        String s = "6.5100000.269925".substring(2,4);
        System.out.println(s);
    }

    /**
     *  java中正则表达式提取字符串中日期实现代码
     * @param text 待提取的字符串
     * @return 返回日期
     */
    public static String run(String text) {
        String dateStr = text.replaceAll("r?n", " ");
        try {
            List matches = null;
            Pattern p = Pattern.compile("(\\d{1,4}[-|\\/]\\d{1,2}[-|\\/]\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2})", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE);
            Matcher matcher = p.matcher(dateStr);
            if (matcher.find() && matcher.groupCount() >= 1) {
                matches = new ArrayList();
                for (int i = 1; i <= matcher.groupCount(); i++) {
                    String temp = matcher.group(i);
                    matches.add(temp);
                }
            } else {
                matches = Collections.EMPTY_LIST;
            }

            if (matches.size() > 0) {
                return ((String) matches.get(0)).trim();
            } else {
                return "";
            }

        } catch (Exception e) {
            return "";
        }
    }
}
