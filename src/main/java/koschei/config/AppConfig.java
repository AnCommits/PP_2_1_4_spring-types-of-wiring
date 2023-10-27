package koschei.config;

import koschei.models.Island2;
import koschei.models.Wood3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.math.BigInteger;
import java.time.LocalDate;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean("koscheysAge")
    public static BigInteger age() {
        return (new BigInteger("45000000000"))
                .add(new BigInteger(String.valueOf(LocalDate.now().getYear())));
    }
}
