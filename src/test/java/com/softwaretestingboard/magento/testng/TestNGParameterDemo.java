package com.softwaretestingboard.magento.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class TestNGParameterDemo {

    @Test
    @Parameters({"myName","surname"})
    public void test(@Optional("Vijay") String name) {
        System.out.println("My name is : " + name);
    }
}
