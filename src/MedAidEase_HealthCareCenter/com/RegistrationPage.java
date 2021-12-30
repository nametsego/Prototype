package MedAidEase_HealthCareCenter.com;

import java.util.HashMap;

public class RegistrationPage {
 /*
    private String name;
    private String surname;
    private String emailAddress;
    private String Id;
*/


    HashMap<String,String> regInfo = new HashMap<String,String>();

    RegistrationPage(){
        regInfo.put("Nametsego","abc123");
        regInfo.put("Cecillia","whack100");
        regInfo.put("Alexis","flower900");
    }
    protected HashMap getRegInfo(){
        return regInfo;
    }

}
