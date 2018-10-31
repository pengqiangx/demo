package com.github.pengqiangx.demo.javacore.base;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author xiaoniu 2018/5/11.
 */
@Slf4j
public class ArrayDemo {

    @Test
    public void test1(){
        String provinceStrs = ",,,,,,,,";
        String[] aras = provinceStrs.split(",");
        log.info("len = {}",aras.length);
        List list = Arrays.asList(aras);
        log.info("list = {},",list.size());
    }
}
