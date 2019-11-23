import com.userRegister.UserRegistration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PasswordTest {
    private String userPassword;
    private boolean isCorrectOrNot;
    private static UserRegistration registration;

    public void PasswordTest(String userPassword, boolean isCorrectOrNot){
        this.userPassword = userPassword;
        this.isCorrectOrNot=isCorrectOrNot;
    }
    @Before
    public void initialize(){
        registration = new UserRegistration();
    }
    @Parameterized.Parameters
    public static Collection<Object[]>passwords(){
        Object[][] passwords=new Object[][]{
                {"Password@123",true},
                {"pass",false},
                {"@passWord123",true},
                {"pass@123Word",true},
                {"@123Password",true},
                {"123Password@",true},
                {"jan",false},
                {"janhaviparte",false},
                {"JANHAVI@123",false},
                {"Janhaviiiii",false},
                {"123456789",false},
        };
        return Arrays.asList(passwords);
    }
   @Test
    public void givenMobileNumber_ShouldBeOf_GivenFormat(){
        boolean actualResult= registration.checkPassword(userPassword);
       Assert.assertEquals(isCorrectOrNot,actualResult);

    }


}
