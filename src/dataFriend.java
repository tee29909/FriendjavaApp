
public class dataFriend {
	private String name;
	private String lasname;
	private String gender; 
	private String username;
	private String password;
	public dataFriend(String name, String lasname,String gender,String username,String password) {
		this.name = name;
		this.lasname = lasname;
		this.gender = gender; 
		this.username = username;
		this.password = password;
    }
	public String getname() {
		return name;
	}
	public String getlasname() {
		return lasname;
	}
	public String getgender() {
		return gender;
	}
	public String getusername() {
		return username;
	}
	public String getpassword() {
		return password;
	}
	

}
