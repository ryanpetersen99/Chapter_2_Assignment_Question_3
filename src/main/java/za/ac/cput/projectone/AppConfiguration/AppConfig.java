package za.ac.cput.projectone.AppConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.projectone.MyInterface;


@Configuration
public class AppConfig {
    @Bean(name = "mi")
    public MyInterface getAgeCalculator(){
        return new MyInterface() {
            @Override
            public int age(int currentyear, int birthyear) {
                return 0;
            }
        };
    }
}
