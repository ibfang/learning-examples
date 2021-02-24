package org.example.module.jd.controller;

import org.example.common.exception.GeneralException;
import org.example.common.io.Output;
import org.example.module.jd.service.JdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 京东万象免费接口调用案例——controller层
 * Created by <a href="https://blog.csdn.net/myme95">翻墙看妹子</a> on 2021/2/4.
 */
@RestController
@RequestMapping("/jd")
public class JdController {
    @Autowired
    JdService jdService;

    @GetMapping("/get/joke")
    public Output getJoke() throws GeneralException {
        return jdService.getJoke();
    }
}
