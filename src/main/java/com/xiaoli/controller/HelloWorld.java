package com.xiaoli.controller;

import com.sun.xml.internal.txw2.annotation.XmlElement;
import com.xiaoli.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: [描述该类概要功能介绍]
 * Created on 2016/9/21
 *
 * @author <a href="mailto: liruifeng@camelotchina.com">中文名字</a>
 * @version 1.0
 *          Copyright (c) 2016年 北京柯莱特科技有限公司 交付部
 */
@RestController
public class HelloWorld {
    @Autowired
    private User user;
    @RequestMapping("/")
    User home() {
        return user;
    }
}
