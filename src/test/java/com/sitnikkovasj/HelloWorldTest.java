package com.sitnikkovasj;

import com.sitnikovasj.HelloWorld;
import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {
    @Test
    public void hw() throws Exception {
        String hh = "Hello, World!";
        Assert.assertEquals(hh, HelloWorld.hw());
    }

}