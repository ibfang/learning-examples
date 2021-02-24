package org.example.common.io;

import java.io.Serializable;

/**
 * Created by <a href="https://blog.csdn.net/myme95">翻墙看妹子</a> on 2021/2/4.
 * 这是一个封装的输出类，主要是为了统一输出的格式。
 * 其中message主要存储一些抛出的信息，resul则存储一些返回的结果
 * 根据可能遇到的业务场景，写了2个带参构造方法
 */
public class Output implements Serializable {
    //序列化
    private static final long serialVersionUID = 5746847569981904913L;
    private int status=200;
    private int code=0;
    private String message;
    private Object result;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    /**
     * 空构造方法
     */
    public Output() {
    }

    /**
     * 带参构造方法
     * @param result
     */
    public Output(Object result) {
        this.result = result;
    }

    /**
     * 带参构造方法
     * @param code
     * @param message
     */
    public Output(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
