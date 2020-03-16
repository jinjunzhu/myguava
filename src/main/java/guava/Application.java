package guava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jinjunzhu
 * @date 2020/3/16
 */
@SpringBootApplication(scanBasePackages = {"guava"})
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
}
