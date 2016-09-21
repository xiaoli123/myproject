package com.xiaoli.domain;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Description: [描述该类概要功能介绍]
 * Created on 2016/9/21
 *
 * @author <a href="mailto: liruifeng@camelotchina.com">中文名字</a>
 * @version 1.0
 *          Copyright (c) 2016年 北京柯莱特科技有限公司 交付部
 */
@Component
@Order(value = 2) //设置执行顺序
public class MyCommandLineRunner2 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("SpringApplication已经启动---22222222222");
        if(strings!=null&&strings.length>0){
            for (int i = 0; i <strings.length ; i++) {
                System.out.println("第"+i+"参数是："+strings[i]);
            }
        }
    }
}
