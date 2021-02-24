package org.ex;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by <a href="https://blog.csdn.net/myme95">翻墙看妹子</a> on 2021/2/4.
 */
@Service
@Primary
public class TestService {

    public String hello(){
        return "hello";
    }
}
