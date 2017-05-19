import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by zd.yao on 2017/5/19.
 */
@SpringBootApplication
@ComponentScan("springboot.elk.logback.web")
public class ApplicationWeb {
    /**
     * Used when run as JAR
     */
    public static void main(String[] args) {
        SpringApplication.run(ApplicationWeb.class, args);
    }
}
