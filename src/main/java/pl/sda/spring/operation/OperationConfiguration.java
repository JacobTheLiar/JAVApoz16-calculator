package pl.sda.spring.operation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 2019-10-13 11:06
 * *
 * @className: OperationConfiguration
 * *
 * *
 ******************************************************/
@Configuration
public class OperationConfiguration{
    
    @Bean
    PercentageOperation percentageOperation(){
        return new PercentageOperation();
    }
    
    @Bean
    SubtractionOperation subtractionOperation() {
        return new SubtractionOperation();
    }
    
    
}
