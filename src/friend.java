import java.util.ArrayList;
import java.util.Scanner;

public class Friend {

	public static void main(String[] args) {
		DataFriend dataFriend;
		ArrayList<DataFriend> friends = new ArrayList<DataFriend>();
		friends.add(new DataFriend("admin","admin","admin","admin","admin"));
		Login login = new Login();
		if(login.login(friends)) { 
			System.out.println("Hello "+friends.get(0).getName());
			Manu();
		}

	}

	private static void Manu() {
		Manu manu = new Manu();
		manu.selectManu();
	}
}
