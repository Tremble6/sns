package com.dyz.until;

import java.util.Random;

public class Make {

    private static String[] src = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
            "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "0", "2", "3", "4", "5", "6", "7", "8", "9"};

    private static Random random = new Random();

    /**
     * 生成验证码
     *
     * @params
     * @returns java.lang.String
     * @Author zhanglianwei
     * @Date 2019/10/29
     */
    public static String makeCode() {
        String rs = ""; // 生成验证码结果值
        for (int i = 0; i < 6; i++) {
            rs += src[random.nextInt(src.length)];
        }
        return rs;

    }
}
