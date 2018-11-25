package com.github.pengqiangx.demo.javacore.clazz;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaoniu 2018/10/31.
 */
public class FieldDemo {
    static class User {

        public static final int MAX_NAME_LEN = 255;

        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
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
    public void field1() throws IllegalAccessException {
        User obj =  new User("张三",10);
        Class<?> cls = obj.getClass();
        //getDeclaredFields 返回本类声明的所有字段、包括非public的，但不包括父类的
        for(Field f : cls.getDeclaredFields()){
            f.setAccessible(true);
            String name = f.getName();
            Object object1 = f.get(obj);
            System.out.println(name + "-" + object1);
        }
    }
    @Test
    public void fieldList() throws IllegalAccessException {
        List<User> obj = new ArrayList<User>();
        obj.add(new User("张三",10));
        obj.add(new User("李四",20));
        Class<?> cls = obj.getClass();
        //getDeclaredFields 返回本类声明的所有字段、包括非public的，但不包括父类的
        for(Field f : cls.getDeclaredFields()){
            f.setAccessible(true);
            String name = f.getName();
            Object object = f.get(obj);
            System.out.println(name + "-" + object);
        }
    }

    @Test
    public void fieldType() throws NoSuchFieldException {
        Field f = User.class.getField("MAX_NAME_LEN");
        int mod = f.getModifiers();
        System.out.println(Modifier.toString(mod));
        System.out.println("isPublic: " + Modifier.isPublic(mod));
        System.out.println("isStatic: " + Modifier.isStatic(mod));
        System.out.println("isFinal: " + Modifier.isFinal(mod));
        System.out.println("isVolatile: " + Modifier.isVolatile(mod));
    }
}
