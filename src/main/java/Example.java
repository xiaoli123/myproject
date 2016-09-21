import com.xiaoli.util.MyApplicationStartedEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/9/20 0020.
 */
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World";
    }

    public static void main(String[] args) {
//        SpringApplication.run(Example.class, args);
        SpringApplication application = new SpringApplication(Example.class,args);
        //增加启动监听器
        application.addListeners(new MyApplicationStartedEvent());
        application.run(args);
    }

}
