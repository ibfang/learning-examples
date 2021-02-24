package org.example.common.exception;

/**
 * 自定义异常类
 * Created by <a href="https://blog.csdn.net/myme95">翻墙看妹子</a> on 2021/2/4.
 */
public class GeneralException extends Exception{

    public GeneralException() {
    }

    public GeneralException(String message) {
        super(message);
    }

    public GeneralException(String message, Throwable cause) {
        super(message, cause);
    }
}
