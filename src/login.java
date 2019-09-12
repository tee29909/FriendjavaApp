import java.util.ArrayList;
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
	public boolean Check(String Username,String Password,ArrayList<dataFriend> friends) {
		int userSize = friends.size();
		for(int i=0;i<userSize;i++) {
			if(Username.equals(friends.get(i).getusername())&&Password.equals(friends.get(i).getpassword())) {
				return true;
			}
		}
		return false;
		
		
	}
	public boolean login(ArrayList<dataFriend> friends) {
		messageStart();
		String Username = Username();
		String Password = Password();
		if(Check(Username,Password,friends)) {
			return true;
		}
		System.out.println("User or Password incorrect.");
		System.out.println("Please fill in the correct information.");
		return login(friends);	
	}

}
