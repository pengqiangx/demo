package com.github.pengqiangx.demo.dp.proxy.one;

import java.util.Collection;

/**
 * Created by pengqiang on 16/9/22.
 */
public class Client {
    public static void main(String[] args) throws Exception {
        UserManager userManager = new UserManager();
        Collection<UserModel> col = userManager.getUserByDepId("0101");
        System.out.println(col);
    }
}
