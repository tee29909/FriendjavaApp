import java.util.Scanner;

public class Manu {
	
	public void selectManu() {
		System.out.println("---Manu---");
		Manu();
		selectInput();
	}
	public void selectAdd() {
		System.out.println("Add friend");
	}
	public void selectShowUser() {
		System.out.println("Edit friend");
	}
	public void selectEdit() {
		System.out.println("Show friend");
	}
	public void selectLogout() {
		System.out.println("Logout");
	}
	public void Manu() {
		System.out.println("(1)Add friend.");
		System.out.println("(2)Edit friend.");
		System.out.println("(3)Show friend.");
		System.out.println("(4)Logout.");
	}
	public void selectInput() {
		System.out.print("Select manu :");
		Scanner kb = new Scanner(System.in);
		try {
			int manu = kb.nextInt();
			switch (manu) {
			case 1 :
				selectAdd();
				break;
			case 2 :
				selectEdit();
				
				break;
			case 3 :
				selectShowUser();
				break;
			case 4 :
				selectLogout();
				break;
			default:
				System.out.println("Choose the correct menu!!");
				selectManu();
				break;
			}
				
		} catch (Exception e) {
			System.out.println("Choose the correct menu!!(error)");
			selectManu();
		}
		
		
		
	
	}
}

