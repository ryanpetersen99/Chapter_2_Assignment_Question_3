package za.ac.cput.projectone;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import za.ac.cput.projectone.AppConfiguration.AppConfig;

import javax.xml.ws.soap.Addressing;
import java.lang.annotation.Annotation;
import java.util.*;

/**
 * Ryan Petersen
 * 217027806
 * 3G
 * Chapter 2 Question 3
 * */
public class InterfaceTest
{
    /**
     * Rigorous Test :-)
     */


    @Before
    public void setUp() throws Exception{
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MyInterface mi = (MyInterface)ctx.getBean("mi");
    }

    @After
    public void tearDown() throws Exception{

    }

    @Test
    public void age() throws Exception
    {
        MyInterface mi = new AgeCalculator();
        int currentAge = mi.age(2019,1999);
        Assert.assertEquals(20,currentAge);
        MyInterface mi2 = new FutureAgeCalculator();
        int futureAge = mi2.age(2019,1999);
        Assert.assertEquals(25,futureAge);
        MyInterface mi3 = new PastAgeCalculator();
        int pastAge = mi3.age(2019,1999);
        Assert.assertEquals(15,pastAge);

    }
}
