package tests.entities;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.factory.FinancingFactory;

public class FinacingTests {

    @Test
    public void shouldCreateFinancingWhenInputConstructorDataIsValid(){
        Assertions.assertDoesNotThrow(() -> FinancingFactory.createValidFinancing());
    }

    @Test
    public void shouldNotCreateFinancingAndThrowExceptionWhenInputConstructorDataIsInvalid(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> FinancingFactory.createInvalidFinancing());
    }

    @Test
    public void shouldUpdateValueWhenSetTotalAmountInputDataIsValid(){
        Financing financing = FinancingFactory.createValidFinancing();
        Assertions.assertDoesNotThrow(() -> financing.setTotalAmount(50000.0));
    }

    @Test
    public void shouldThrowExceptionWhenSetTotalAmountInputDataIsInvalid(){
        Financing financing = FinancingFactory.createValidFinancing();
        Assertions.assertThrows(IllegalArgumentException.class, () -> financing.setTotalAmount(200000.0));
    }

    @Test
    public void shouldUpdateIncomeWhenSetIncomeInputDataIsValid(){
        Financing financing = FinancingFactory.createValidFinancing();
        Assertions.assertDoesNotThrow(() -> financing.setIncome(4000.0));
    }

    @Test
    public void shouldThrowExceptionWhenSetIncomeInputDataIsInvalid(){
        Financing financing = FinancingFactory.createValidFinancing();
        Assertions.assertThrows(IllegalArgumentException.class, () -> financing.setIncome(1000.0));
    }

    @Test
    public void  shouldUpdateMonthsWhenSetMonthsInputDataIsValid(){
        Financing financing = FinancingFactory.createValidFinancing();
        Assertions.assertDoesNotThrow(() -> financing.setMonths(120));
    }

    @Test
    public void shouldThrowExceptionWhenSetMonthsInputDataIsInvalid(){
        Financing financing = FinancingFactory.createValidFinancing();
        Assertions.assertThrows(IllegalArgumentException.class, () -> financing.setMonths(10));
    }

    @Test
    public void shouldCalculateEntryValueCorrectly(){
        Financing financing = FinancingFactory.createValidFinancing();
        Double expectedValue = 20000.0;

        Assertions.assertEquals(financing.entry(), expectedValue);
    }

    @Test
    public void shouldCalculateQuotaValueCorrectly(){
        Financing financing = FinancingFactory.createValidFinancing();
        Double expectedValue = 1000.0;

        Assertions.assertEquals(financing.quota(), expectedValue);
    }

}
