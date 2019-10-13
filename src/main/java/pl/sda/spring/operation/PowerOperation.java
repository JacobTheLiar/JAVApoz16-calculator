package pl.sda.spring.operation;


/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 2019-10-13 10:29
 * *
 * @className: PowerOperation
 * *
 * *
 ******************************************************/
public class PowerOperation implements Operation{
    
    @Override
    public double calculate(double arg1, double arg2){
        return Math.pow(arg1, arg2);
    }
    
    
    @Override
    public OperationType getSupportedOperationType(){
        return OperationType.POWER;
    }
}
