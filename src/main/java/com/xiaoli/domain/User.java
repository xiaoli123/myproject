package com.xiaoli.domain;

import com.sun.istack.internal.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Description: [描述该类概要功能介绍]
 * Created on 2016/9/21
 *
 * @author <a href="mailto: liruifeng@camelotchina.com">中文名字</a>
 * @version 1.0
 *          Copyright (c) 2016年 北京柯莱特科技有限公司 交付部
 */
@Component
@XmlRootElement(name = "xml")
@ConfigurationProperties(prefix = "person")
public class User {
    //    @Value("${xiaoli.wife.name}")
    private String name;
    private String age;
    @NotNull
    private Integer sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
