package com.userRegister;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailAddressTest {
    private String emailId;
    private static UserRegistration userRegistration;
    private boolean isTrueOrFalseEmail;

    public EmailAddressTest(String emailId,Boolean isTrueOrFalseEmail){
        this.emailId=emailId;
        this.isTrueOrFalseEmail=isTrueOrFalseEmail;
    }
    @Before
    public void initialize() {
        userRegistration = new UserRegistration();
    }
    @Parameterized.Parameters
    public static Collection<Object[]>emailInputs(){
        Object[][] emailInputs=new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc.100@1.com", true},
                {"abc.abc@gmail.co.in", true},
                {"abc100@gmail.com", true},
                {"abc.100@abc.com.au", true},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@g.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@a.com.21a", false},
                {"abc@g.cim.au.au", false}
        };
        return Arrays.asList(emailInputs);
        }

    @Test
    public void givenEmailAddress_ShouldBeOf_GivenFormat() {
        boolean actualResult=userRegistration.checkEmailAddres(emailId);
        Assert.assertEquals(isTrueOrFalseEmail,actualResult);

    }
}
