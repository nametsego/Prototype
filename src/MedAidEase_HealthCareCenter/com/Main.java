package MedAidEase_HealthCareCenter.com;

public class Main {

    public static void main(String[] args) {
	RegistrationPage userInfo = new RegistrationPage();

	LoginPage loginPage = new LoginPage(userInfo.getRegInfo());

    }
}
