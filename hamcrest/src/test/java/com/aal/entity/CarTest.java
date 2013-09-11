package com.aal.entity;


import com.all.matchers.CarMatcher;
import org.junit.Before;
import org.junit.Test;

import static com.all.matchers.CarMatcher.hasNumberPlate;
import static org.junit.Assert.assertThat;

public class CarTest {

    private Car car;

    @Before
    public void setup(){
        car = new Car();
        car.setMake("Audi");
        car.setModel("A6");
        car.setDerivative("A6");
        car.setEngineSizeInCC(2000);
        car.setNumberPlate("EF07RZV");

    }

    @Test
    public void shouldHaveNumberPlate(){
        assertThat(car, hasNumberPlate("EF07RZV"));
    }


}
