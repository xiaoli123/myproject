package com.xiaoli;

import com.xiaoli.util.MyApplicationStartedEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 应用的main类
 * Created by Administrator on 2016/9/21 0021.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
//@SpringBootApplication  注解等价于以默认属性使用 @Configuration  ， @EnableAutoConfiguration  和 @ComponentScan
public class Application {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        //增加启动监听器
        application.addListeners(new MyApplicationStartedEvent());

        //设置是否web环境启动
        // application.setWebEnvironment(true);
        //设置ApplicationContext的类型
        //application.setApplicationContextClass();
        application.run();
    }
}
