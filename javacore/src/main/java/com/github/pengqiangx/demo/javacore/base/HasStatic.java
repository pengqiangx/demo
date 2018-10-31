package com.github.pengqiangx.demo.javacore.base;

/**
 * Created by pengqiang on 2017/7/10.
 */
public class HasStatic {
    private static int x=100;
    public static  void  main(String  args[]){
        HasStatic hs1 = new HasStatic();
        hs1.x++;
        HasStatic  hs2=new  HasStatic(  );
        hs2.x++;
        hs1=new  HasStatic( );
        hs1.x++;
        HasStatic.x--;
        System.out .println("x="+x);

        System.out.print("1".equals(null));
    }


}
