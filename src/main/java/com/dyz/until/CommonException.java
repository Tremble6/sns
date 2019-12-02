package com.dyz.until;

public class CommonException extends Exception {

    public CommonException() {
        super();
    }

    public CommonException(int codes,String info) {
        super(info);
    }
}
