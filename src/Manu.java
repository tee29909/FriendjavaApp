import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.text.View;

public class Manu {
	
	
	public void selectManu(ArrayList<DataFriend> friends ,String user) {
		System.out.println("---Manu---");
		Manu();
		selectInput(friends,user);
	}
	public void selectAdd(ArrayList<DataFriend> friends,String user) {
		System.out.println("Add friend");
		Scanner kb = new Scanner(System.in);
		System.out.print("name");
		String name=kb.next();
		System.out.print("lasname");
		String lasname=kb.next();
		System.out.print("gender");
		String gender=kb.next();
		System.out.print("username");
		String username=kb.next();
		System.out.print("username");
		String password=kb.next();
		if (name == "" || lasname == "" || gender == "" || username == "" || password == "") {
			System.out.println("error input");
			selectAdd(friends,user);
			
		} else {
			System.out.println("add fin");
			friends.add(new DataFriend(name, lasname, gender, username, password));
			selectManu(friends,user);
			

		}
	
	}
	public void selectShowUser(ArrayList<DataFriend> friends,String user) {
		int i=1;
		while (i<friends.size()) {
			System.out.println(i+")"+friends.get(i).getName());
			i++;
			
		}
		Scanner kb = new Scanner(System.in);
		System.out.println("0)back");
		System.out.println("select :");
		try {
		int point = kb.nextInt();
		if(point>=friends.size()&&point!=0) {
			showUser(friends,point,user);
			
			
			
		}else if (point==0) {
			selectManu(friends,user);
		}
		} catch (Exception e) {
			System.out.println("Choose the correct menu!!(error)");
			selectShowUser(friends,user);
		}
		
		
			
	}
	public void showUser(ArrayList<DataFriend> friends,int point,String user) {
		System.out.println("name :"+friends.get(point).getName());
		System.out.println("lasname :"+friends.get(point).getLasname());
		System.out.println("gender :"+friends.get(point).getGender());
		System.out.println("username :"+friends.get(point).getUsername());
		System.out.println("password :"+friends.get(point).getPassword());
		System.out.println("0) back");
		try {
			Scanner kb = new Scanner(System.in);
			System.out.println("Select manu :");
			if(kb.nextInt()==0) {
				selectShowUser(friends,user);
			}
			else {
				System.out.println("Choose the correct menu!!(error)");
				showUser(friends,point,user);
				
			}
			
		} catch (Exception e) {
			System.out.println("Choose the correct menu!!(error)");
			showUser(friends,point,user);
		}
		
		
	}
	
	
	
	
	
	public void showEdit(ArrayList<DataFriend> friends,int user) {
		System.out.println("1) "+friends.get(user).getName());
		System.out.println("2) "+friends.get(user).getLasname());
		System.out.println("3) "+friends.get(user).getGender());
		System.out.println("4) "+friends.get(user).getUsername());
		System.out.println("5) "+friends.get(user).getPassword());
		System.out.println("0) "+"back");
		System.out.print("select :");
		Scanner kb = new Scanner(System.in);
		try {
			int manu = kb.nextInt();
			switch (manu) {
			case 1 :
				System.out.print("name: ");
				String name = kb.next();
				friends.get(user).setName(name);
				showEdit(friends,user);
				break;
			case 2 :
				System.out.print("lastname: ");
				String lastname = kb.next();
				friends.get(user).setLasname(lastname);
				showEdit(friends,user);
				break;
			case 3 :
				System.out.print("gender: ");
				String gender = kb.next();
				friends.get(user).setGender(gender);
				showEdit(friends,user);
				break;
			case 4 :
				System.out.print("username: ");
				String username = kb.next();
				friends.get(user).setUsername(username);
				showEdit(friends,user);
				break;
			case 5 :
				System.out.print("password: ");
				String password = kb.next();
				friends.get(user).setPassword(password);
				showEdit(friends,user);
				break;
			case 0 :
				showEdit(friends,user);
				break;
			default:
				System.out.println("Choose the correct menu!!");
				selectManu(friends,friends.get(user).getUsername());
				break;
			}
		} catch (Exception e) {
			System.out.println("Choose the correct menu!!(error)");
			showEdit(friends,user);
		}
		
	}
	
	
	public boolean checkUser(ArrayList<DataFriend> friends,int user) {
		System.out.println("input password");
		Scanner kb = new Scanner(System.in);
		if(kb.next().equals(friends.get(user).getPassword())) {
			return true;
		}
		
		return checkUser(friends,user);
		
	}
	
	
	public void selectEdit(ArrayList<DataFriend> friends,String user) {
		System.out.println("Edit friend");
		int i = 0;
		while (user.equals(friends.get(i).getUsername())) {
			
			if(checkUser(friends, i)) {
				showEdit(friends,i);
			}
			break;
			
		}
	}
	
	public void selectLogout() {
		System.out.println("Logout");
	}
	public void Manu() {
		System.out.println("(1)Add friend.");
		System.out.println("(2)Edit user.");
		System.out.println("(3)Show friend.");
		System.out.println("(4)Logout.");
	}
	public void selectInput(ArrayList<DataFriend> friends,String user) {
		System.out.print("Select manu :");
		Scanner kb = new Scanner(System.in);
		try {
			int manu = kb.nextInt();
			switch (manu) {
			case 1 :
				selectAdd(friends,user);
				break;
			case 2 :
				selectEdit(friends,user);
				
				break;
			case 3 :
				selectShowUser(friends,user);
				break;
			case 4 :
				selectLogout();
				break;
			default:
				System.out.println("Choose the correct menu!!");
				selectManu(friends,user);
				break;
			}
				
		} catch (Exception e) {
			System.out.println("Choose the correct menu!!(error)");
			selectManu(friends,user);
		}
	
	}
}

