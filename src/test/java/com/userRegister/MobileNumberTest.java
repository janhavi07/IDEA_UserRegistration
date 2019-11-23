package com.userRegister;

import org.junit.Assert;
import org.junit.Test;

public class MobileNumberTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenMobileNumber_WhenStartWithCountryCode_FollowedBy10Digits_ShouldReturn_True() {
        boolean trueOrFalseMobileNo = userRegistration.checkMobileNumber("91 9757123369");
        Assert.assertTrue(trueOrFalseMobileNo);
    }
    @Test
    public void givenMobileNumber_WhenStartWithOutCountryCode_FollowedBy10Digits_ShouldReturn_False() {
        boolean trueOrFalseMobileNo = userRegistration.checkMobileNumber(" 9757123369");
        Assert.assertFalse(trueOrFalseMobileNo);
    }
    @Test
    public void givenMobileNumber_lessThan10Digits_ShouldReturn_False() {
        boolean trueOrFalseMobileNo = userRegistration.checkMobileNumber("91 757123369");
        Assert.assertFalse(trueOrFalseMobileNo);
    }
    @Test
    public void givenMobileNumber_When_HasAlphabets_ShouldReturn_False() {
        boolean trueOrFalseMobileNo = userRegistration.checkMobileNumber("91 A757123369");
        Assert.assertFalse(trueOrFalseMobileNo);
    }
    @Test
    public void givenMobileNumber_When_StartsWithNumberLessThan7_ShouldReturn_False() {
        boolean trueOrFalseMobileNo = userRegistration.checkMobileNumber("91 4757123369");
        Assert.assertFalse(trueOrFalseMobileNo);
    }
    @Test
    public void givenMobileNumber_When_NoSpaceBetweenCountryCodeAndNumber_ShouldReturn_False() {
        boolean trueOrFalseMobileNo = userRegistration.checkMobileNumber("91 4757123369");
        Assert.assertFalse(trueOrFalseMobileNo);
    }
    @Test
    public void givenMobileNumber_When_SpecialCharactersUsed_ShouldReturn_False() {
        boolean trueOrFalseMobileNo = userRegistration.checkMobileNumber("91 4757123369");
        Assert.assertFalse(trueOrFalseMobileNo);
    }
}
