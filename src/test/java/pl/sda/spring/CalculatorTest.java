package pl.sda.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.sda.spring.operation.OperationType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class CalculatorTest {

    @Autowired
    private Calculator calculator;
    
    @Test
    public void shouldReturnFiveForGivenArgumentsOnAdditionOperation() {
        //given
        double arg1 = 2.0;
        double arg2 = 3.0;
        
        //when
        double actual = calculator.calculate(OperationType.ADDITION, arg1, arg2);
        
        //then
        Assert.assertEquals(5.0, actual, 0.00000001);
    }

    @Test
    public void shouldReturnFiveForGivenArgumentsOnSubtractionOperation() {
        //given
        double arg1 = 8.0;
        double arg2 = 3.0;
        
        //when
        double actual = calculator.calculate(OperationType.SUBTRACTION, arg1, arg2);
        
        //then
        Assert.assertEquals(5.0, actual, 0.00000001);
    }
    
    
    @Test
    public void shouldReturnFiveForGivenArgumentsOnMultiplicationOperation() {
        //given
        double arg1 = 2.5;
        double arg2 = 2.0;
        
        //when
        double actual = calculator.calculate(OperationType.MULTIPLICATION, arg1, arg2);
        
        //then
        Assert.assertEquals(5.0, actual, 0.00000001);
    }
    
    @Test
    public void shouldReturnFiveForGivenArgumentsOnDivisionOperation() {
        //given
        double arg1 = 15.0;
        double arg2 = 3.0;
        
        //when
        double actual = calculator.calculate(OperationType.DIVISION, arg1, arg2);
        
        //then
        Assert.assertEquals(5.0, actual, 0.00000001);
    }
    
    
    @Test(expected = RuntimeException.class)
    public void shouldReturnRuntimeExceptionForGivenArgumentsOnDivisionOperation() {
        //given
        double arg1 = 15.0;
        double arg2 = 0.0;
        
        //when
        calculator.calculate(OperationType.DIVISION, arg1, arg2);
        
    }
    
    
    @Test
    public void shouldReturnFiveForGivenArgumentsOnPercentageOperation() {
        //given
        double arg1 = 20.0;
        double arg2 = 25.0;
        
        //when
        double actual = calculator.calculate(OperationType.PERCENTAGE, arg1, arg2);
        
        //then
        Assert.assertEquals(5.0, actual, 0.00000001);
    }
    
    @Test
    public void shouldReturn256ForGivenArgumentsOnPowerOperation() {
        //given
        double arg1 = 2.0;
        double arg2 = 8.0;
        
        //when
        double actual = calculator.calculate(OperationType.POWER, arg1, arg2);
        
        //then
        Assert.assertEquals(256.0, actual, 0.00000001);
    }
    
}
