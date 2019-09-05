import java.util.ArrayList;
import java.util.Scanner;

public class friend {

	public static void main(String[] args) {
		dataFriend dataFriend;
		ArrayList<dataFriend> friends = new ArrayList<dataFriend>();
		friends.add(new dataFriend("admin","admin","admin","admin","admin"));
		System.out.println(friends.size());
		System.out.println(friends);
		login login = new login();

	}

}
