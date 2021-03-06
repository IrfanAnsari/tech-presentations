package com.all.matchers;

import com.aal.entity.Car;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

/**
 * User: irfanansari
 * Date: 11/09/2013
 * Time: 03:43
 */
public class CarMatcher {

    public static Matcher<Car> hasNumberPlate(final String numberPlate) {
        return new TypeSafeMatcher<Car>() {

            @Override
            protected boolean matchesSafely(Car car) {
                return numberPlate.equals(car.getNumberPlate());
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("expected result from getPlateNumber(): ")
                        .appendValue(numberPlate);
            }

            @Override
            public void describeMismatchSafely(final Car car,
                                               final Description mismatchDescription) {
                mismatchDescription.appendText("was ").appendValue(
                        car.getNumberPlate());
            }
        };
    }

    public static Matcher<Car> hasMake(final String make){
        return new TypeSafeMatcher<Car>() {
            @Override
            protected boolean matchesSafely(Car car) {
                return make.equals(car.getMake());
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("expected result from getMake() : ").appendValue(make);
            }

            @Override
            protected void describeMismatchSafely(Car car, Description mismatchDescription) {
                mismatchDescription.appendText("was ").appendValue(car.getMake());
            }
        };
    }
}
