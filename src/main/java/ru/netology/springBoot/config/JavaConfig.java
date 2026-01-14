package ru.netology.springBoot.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springBoot.profile.DevProfile;
import ru.netology.springBoot.profile.ProductionProfile;
import ru.netology.springBoot.profile.SystemProfile;

@Configuration
public class JavaConfig {

    @Bean
    @ConditionalOnProperty(
            name = "netology.profile.dev",
            havingValue = "true"
    )
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(
            name = "netology.profile.dev",
            havingValue = "false"
    )
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }


}
