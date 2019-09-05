import java.util.Scanner;

public class login {
	Scanner kb = new Scanner(System.in);
	public void messageStart() {
		System.out.println("FriendApp");
	}
	public String Username() {
		System.out.print("Username: ");
		String username = kb.next();
		System.out.println();
		return username;
	}
	public String Password() {
		System.out.print("Password: ");
		String password = kb.next();
		System.out.println();
		return password;
	}
	public boolean Check(String Username,String Password) {
		
		return true;
	}
	public boolean login() {
		messageStart();
		String Username = Username();
		String Password = Password();
		if(Check(Username,Password)) {
			return true;
		}
		System.out.println("User or Password incorrect.");
		System.out.println("Please fill in the correct information.");
		return login();	
	}

}
