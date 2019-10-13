package pl.sda.spring.operation;


import org.springframework.stereotype.Component;


/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 2019-10-13 09:27
 * *
 * @className: DivisionOperation
 * *
 * *
 ******************************************************/
@Component
public class DivisionOperation implements Operation{
    
    @Override
    public double calculate(double arg1, double arg2){
        
        if (arg2 == 0.0 ){
            throw new RuntimeException();
        }
        return arg1 / arg2;
    }
    
    
    @Override
    public OperationType getSupportedOperationType(){
        return OperationType.DIVISION;
    }
}
