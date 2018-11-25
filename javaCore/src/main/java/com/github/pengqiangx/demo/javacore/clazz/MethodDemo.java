package com.github.pengqiangx.demo.javacore.clazz;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaoniu 2018/10/31.
 */
public class MethodDemo {
    static class User {

        public static final int MAX_NAME_LEN = 255;

        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String desc( String desc) {
            return "hello:" + desc;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    @Test
    public void Method1() throws IllegalAccessException {
        User user = new User("张三", 10);

        Class<?> cls1 = Integer.class;
        Class<?> cls2 = user.getClass();
        try {
            Method method1 = cls1.getMethod("parseInt", new Class[]{String.class});
            Method method2 = cls2.getMethod("desc", new Class[]{String.class});
            System.out.println(method1.invoke(null, "123"));
            System.out.println(method2.invoke(user, "world"));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}