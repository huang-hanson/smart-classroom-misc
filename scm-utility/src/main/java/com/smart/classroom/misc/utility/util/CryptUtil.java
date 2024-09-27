package com.smart.classroom.misc.utility.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 17:43
 **/
public class CryptUtil {

    static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();


    public static String bCryptEncode(CharSequence rawPassword) {
        return bCryptPasswordEncoder.encode(rawPassword);
    }

    public static boolean bCryptMatches(CharSequence rawPassword, String encodedPassword) {
        return bCryptPasswordEncoder.matches(rawPassword, encodedPassword);
    }
}