package pl.sda.spring.operation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 2019-10-13 10:23
 * *
 * @className: PercentageOperationConfiguration
 * *
 * *
 ******************************************************/
@Configuration
public class PercentageOperationConfiguration{
    
    @Bean
    PercentageOperation percentageOperation(){
        return new PercentageOperation();
    }
    
}
