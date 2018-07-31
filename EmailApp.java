/**
 * @author Rucha Nimbalkar
 * @Practice Project from Udemy :
 * 			 Scenario: You are an IT Support Administrator Specialist and are charged 
 * 						with the task of creating email accounts for new hires.
 * 
 */
package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		
		Email emailUser1 = new Email("Rucha", "Nimbalkar");
		emailUser1.setMailBoxCapacity(600);
		emailUser1.setAlternateEmail("rn@yahoo.com");
		System.out.println(emailUser1.getAlternateEmail());
		System.out.println(emailUser1.showInfo());

	}

}
