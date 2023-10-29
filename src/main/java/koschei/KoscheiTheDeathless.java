package koschei;

import koschei.models.Ocean1;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.logging.Logger;

@Component
public class KoscheiTheDeathless implements DisposableBean, BeanNameAware {

    private Ocean1 ocean;
    private String name;

    @Autowired
    @Qualifier("koscheysAge")
    private BigInteger age;

    public String getRulesByDeath() {
        return "На свете есть океан , " + ocean.toString();
    }

    Logger logger = Logger.getLogger(KoscheiTheDeathless.class.getName());

    @Autowired
    public void setOcean(Ocean1 ocean) {
        this.ocean = ocean;
    }

    @Override
    public void destroy() {
        logger.info("Кощей по прозвищу " + name + " почил в возрасте " + age + " небесных циклов.");
    }

    @Override
    public void setBeanName(String s) {
        name = s;
    }
}
