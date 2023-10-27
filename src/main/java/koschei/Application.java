package koschei;

import koschei.config.AppConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
//        ApplicationContext applicationContext =
        ConfigurableApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        KoscheiTheDeathless koscheiTheDeathless =
                applicationContext.getBean(KoscheiTheDeathless.class);
        System.out.println(koscheiTheDeathless.getRulesByDeath());

        applicationContext.close();
    }
}
