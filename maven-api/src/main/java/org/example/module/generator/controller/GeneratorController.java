package org.example.module.generator.controller;

import org.example.common.io.Output;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 代码生成器——controller层
 * Created by <a href="https://blog.csdn.net/myme95">翻墙看妹子</a> on 2021/2/5.
 */
@RestController
@RequestMapping("/gen")
public class GeneratorController {


    /**
     * 获取数据库表列表
     * @return
     */
    @GetMapping("/table/list")
    public Output getTableList(String name,int page,int limit){
        return new Output();
    }
}
