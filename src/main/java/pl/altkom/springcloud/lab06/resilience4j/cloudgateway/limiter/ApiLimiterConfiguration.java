package pl.altkom.springcloud.lab06.resilience4j.cloudgateway.limiter;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import reactor.core.publisher.Mono;

@Configuration
public class ApiLimiterConfiguration {

    @Bean
    public KeyResolver keyResolver() {
        return exchange -> Mono.just("1");
    }
}
