package com.macro.mall.portal.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author zhangzixin
 * @date 2024/2/10 18:28
 */

public class PasswordEncoderUtil {

    public static void main(String[] args) {

        String password = "zhangzixin666"; // 输入用户的密码

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(password);

        System.out.println("Encoded Password: " + encodedPassword);
    }
}