package org.java.web;


import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;

public class MD5Test {
    private String pwd="123";
    private String salt="accp";

    @Test
    public void one(){
        Md5Hash md5 = new Md5Hash(pwd,salt,3);

        System.out.println(md5.toString());
    }

}
