package platform.codingnomads.co.corespring.lab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath*:xml-config/houses.xml"})
public class MyCoreLabConfig {
    @Bean
    public Office office() {
        return new Office("Merritt-Properties", 100, 5);
    }
}
