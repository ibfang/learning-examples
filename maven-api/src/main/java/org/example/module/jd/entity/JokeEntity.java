package org.example.module.jd.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by <a href="https://blog.csdn.net/myme95">翻墙看妹子</a> on 2021/2/4.
 */
@Data
public class JokeEntity {
    private Date ct;
    private String id;
    private String text;
    private String title;
    private String type;

}
