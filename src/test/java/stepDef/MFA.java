package stepDef;

import de.taimos.totp.TOTP;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Hex;
import org.testng.annotations.Test;
import pages.MFAPage;
import utilities.TestBase;

public class MFA extends TestBase {
    MFAPage mfaPage = new MFAPage();
    static String secretKey = "GAXG2MTEOR3DMMDG";
    //Stackoverflow steps
    //https://stackoverflow.com/questions/75834547/how-to-automate-microsoft-authenticator-using-selenium-and-java
    private static String getTOTPCode(String secretKey) {
        Base32 base32 = new Base32();
        byte[] bytes = base32.decode(secretKey);
        String hexKey = Hex.encodeHexString(bytes);
        return TOTP.getOTP(hexKey);
    }
    @Test
    public void testMFA()
    {
        driver.get("https://seleniumbase.io/realworld/login");
        mfaPage.typeUsername("demo_user");
        mfaPage.typePassword("secret_pass");
        mfaPage.typeOTP(getTOTPCode(secretKey));
        mfaPage.clickLogin();
    }

    public static void main(String[] args)
    {
        System.out.println(getTOTPCode(secretKey));
    }

}
