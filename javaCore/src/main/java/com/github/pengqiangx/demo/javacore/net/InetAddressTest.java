package com.github.pengqiangx.demo.javacore.net;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by pengqiang on 2017/5/25.
 */
public class InetAddressTest {

    @Test
    public void getLocalHostIP () throws UnknownHostException {
        /**返回本地主机。*/
        InetAddress addr = InetAddress.getLocalHost();
        /**返回 IP 地址字符串（以文本表现形式）*/
        String ip = addr.getHostAddress();
        System.out.println("Ip="+ip);
        //去掉.号
        String ips = ip.replaceAll("\\.","");
        System.out.println("ips="+ips);
        System.out.println(ips.substring(ips.length()-3,ips.length()));

    }
    @Test
    public void test2(){
        int x = 10;
        if(x++ > 10 & x++==12){
            ++x;
        }
        System.out.print(x);

    }
}
