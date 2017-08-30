import com.listener.ApplicationEnvironmentPreparedEventListener;
import com.listener.ApplicationFailedEventListener;
import com.listener.ApplicationPreparedEventListener;
import com.listener.ApplicationStartedEventListener;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Desciption
 * Create By  li.bo
 * CreateTime 2017/7/22 13:09
 * UpdateTime 2017/7/22 13:09
 */

@ComponentScan(basePackages={"com.*"})// 必须加上，告知基础包扫描路径
@SpringBootApplication
public class Application extends SpringBootServletInitializer{

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        setRegisterErrorPageFilter(false);
        return builder.sources(Application.class);
    }

    public static void main(String[] args){
        logger.debug("系统启动！");
//        SpringApplication app = new SpringApplication(Application.class);
//        app.addListeners(new ApplicationStartedEventListener());
//        app.addListeners(new ApplicationEnvironmentPreparedEventListener());
//        app.addListeners(new ApplicationFailedEventListener());
//        app.addListeners(new ApplicationPreparedEventListener());
//        app.run(args);

        SpringApplication.run(Application.class, args);

    }
}
