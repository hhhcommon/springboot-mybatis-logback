import com.listener.ApplicationEnvironmentPreparedEventListener;
import com.listener.ApplicationFailedEventListener;
import com.listener.ApplicationPreparedEventListener;
import com.listener.ApplicationStartedEventListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Desciption
 * Create By  li.bo
 * CreateTime 2017/7/22 13:09
 * UpdateTime 2017/7/22 13:09
 */

@SpringBootApplication
@ComponentScan("com")
@MapperScan(basePackages = "mapper")
public class Application {
    public static void main(String[] args){
        SpringApplication app = new SpringApplication(Application.class);
//        app.addListeners(new ApplicationStartedEventListener());
//        app.addListeners(new ApplicationEnvironmentPreparedEventListener());
//        app.addListeners(new ApplicationFailedEventListener());
//        app.addListeners(new ApplicationPreparedEventListener());
        app.run(args);

    }
}
