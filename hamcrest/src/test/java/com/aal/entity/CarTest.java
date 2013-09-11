package com.aal.entity;


import org.junit.Before;
import org.junit.Test;

import static com.all.matchers.CarMatcher.hasMake;
import static com.all.matchers.CarMatcher.hasNumberPlate;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
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
    public void shouldHaveNumberPlateAndMakeWithCarMatcher(){
        assertThat(car, hasNumberPlate("EF07RZV"));
        assertThat(car, hasMake("Audi"));
    }

    @Test
    public void shouldHaveNumberPlateAndMake(){
        assertThat(car.getNumberPlate(), is(equalTo("EF07RZV")));
        assertThat(car.getMake(), is("Audi"));
    }


}
