package com.androidwind.base.module.exeception;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class ApiException extends Exception {

    public int code;
    public String message;

    public ApiException(Throwable throwable, int code) {
        super(throwable);
        this.code = code;
    }

    @Override
    public String toString() {
        return "ApiException{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
