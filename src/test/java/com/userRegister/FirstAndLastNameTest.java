package com.userRegister;

import org.junit.Assert;
import org.junit.Test;

public class FirstAndLastNameTest {
    UserRegistration registration = new UserRegistration();

    @Test
    public void givenFirstName_WhenCorrect_ShouldReturnTrue() {
        boolean isTrue=registration.checkFirstName("Janhavi");
        Assert.assertTrue(isTrue);
    }

    @Test
    public void givenFisrtName_When_Empty_ShouldReturnFalse() {
        boolean isFalse=registration.checkFirstName("");
        Assert.assertFalse(isFalse);
    }
    @Test
    public void givenFirstName_WithSmallLetters_ShouldReturnFalse() {
        boolean isFalse = registration.checkFirstName("janhavi");
        Assert.assertFalse(isFalse);
    }
    @Test
    public void givenFirstName_WithNumbers_ShouldReturnFalse() {
        boolean isFalse = registration.checkFirstName("111");
        Assert.assertFalse(isFalse);
    }
    @Test
    public void givenFirstName_When_AllCapital_ShouldReturnTrue() {
        boolean isTrue=registration.checkFirstName("JANHAVI");
        Assert.assertTrue(isTrue);
    }
    @Test
    public void givenFirstName_EndsWithCapital_ShouldReturnFalse() {
        boolean isFalse = registration.checkFirstName("janhavI");
        Assert.assertFalse(isFalse);
    }
    @Test
    public void givenLastName_When_StartsWithCapital_ShouldReturnTrue() {
        boolean isTrue=registration.checkLastName("Parte");
        Assert.assertTrue(isTrue);
    }
    @Test
    public void givenLastName_When_ContainsSpecialCharacters_ShouldReturnFalse() {
        boolean isFalse = registration.checkLastName("Part@e");
        Assert.assertFalse(isFalse);
    }
    @Test
    public void givenLastName_When_ContainsAllSmallLetters_ShouldReturnFalse() {
        boolean isFalse = registration.checkLastName("parte");
        Assert.assertFalse(isFalse);
    }
    @Test
    public void givenLastName_When_Contains_Numbers_ShouldReturnFalse() {
        boolean isFalse = registration.checkLastName("Part9e");
        Assert.assertFalse(isFalse);
    }
    @Test
    public void givenLastName_When_Empty_ShouldReturnFalse() {
        boolean isFalse=registration.checkLastName(" ");
        Assert.assertFalse(isFalse);
    }



}
