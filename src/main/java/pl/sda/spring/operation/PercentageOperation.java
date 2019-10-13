package pl.sda.spring.operation;


/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 2019-10-13 10:20
 * *
 * @className: PercentageOperation
 * *
 * *
 ******************************************************/
public class PercentageOperation implements Operation{
    
    @Override
    public double calculate(double arg1, double arg2){
        return arg1 * arg2 / 100.0;
    }
    
    
    @Override
    public OperationType getSupportedOperationType(){
        return OperationType.PERCENTAGE;
    }
}
