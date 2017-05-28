package user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

/**
 * 功能：spring boot 启动入口
 * Created by cgl on 2017/5/10 0010.
 */
@SpringBootApplication
public class Application  {
    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

  
}
