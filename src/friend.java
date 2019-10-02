import java.util.ArrayList;
import java.util.Scanner;

public class Friend {

	public static void main(String[] args) {
		DataFriend dataFriend;
		ArrayList<DataFriend> friends = new ArrayList<DataFriend>();
		friends.add(new DataFriend("admin","admin","admin","admin","admin"));
		Login login = new Login();
		Scanner kb = new Scanner(System.in);
		String user = login.login(friends);
		
		if(!user.equals("")) { 
			System.out.println("Hello "+friends.get(0).getName());
			Manu(friends,user);
		}

	}

	private static void Manu(ArrayList<DataFriend> friends,String user) {
		Manu manu = new Manu();
		manu.selectManu(friends,user);
	}
}
