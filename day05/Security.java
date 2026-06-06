package day05;
final class SecurityModule {
    public void encryptData() {
        System.out.println("Encrypting data...");
    }
}
class AdvancedSecurity extends SecurityModule {
}
public class Security {
	 public static void main(String[] args) {
	        SecurityModule sm = new SecurityModule();
	        sm.encryptData();
	    }

}
