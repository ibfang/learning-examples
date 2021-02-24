package org.example.common.handler;

import org.example.common.exception.GeneralException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 拦截异常统一处理
 * 如果全部异常处理返回json，那么可以使用 @RestControllerAdvice代替 @ControllerAdvice，这样在方法上就可以不需要添加 @ResponseBody。
 * 注解@ExceptionHandler可以用来指定处理某类异常的控制器方法，从而在这些异常发生时，会有相应的控制器方法来处理此类异常
 * Created by <a href="https://blog.csdn.net/myme95">翻墙看妹子</a> on 2021/2/4.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 统一处理某一类异常，如业务异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(GeneralException.class)
    public Object handleException(GeneralException e) {
        //返回错误信息
        return e.getMessage();
    }

    /**
     * 其他异常处理（如非业务异常等）
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public Object handleException(Exception e) {
        //返回错误信息
        return "未知异常";
    }
}
