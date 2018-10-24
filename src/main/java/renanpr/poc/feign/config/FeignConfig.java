package renanpr.poc.feign.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
}
