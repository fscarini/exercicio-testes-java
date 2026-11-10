package tests.entities;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.factory.FinancingFactory;

public class FinacingTests {

    @Test
    public void shouldCreateFinancingWhenInputDataIsValid(){
        Assertions.assertDoesNotThrow(() -> FinancingFactory.createValidFinancing());
    }

    @Test
    public void shouldNotCreateFinancingAndThrowExceptionWhenInputDataIsInvalid(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> FinancingFactory.createInvalidFinancing());
    }


}
