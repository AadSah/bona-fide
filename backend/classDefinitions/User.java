package classDefinitions;	//Package Name to be entered here

import java.util.*;

public class User{			//class name and defn

	public String UserName;
	private String Password;
	private String EmailID;
	public String PresentSessionID;
	public boolean LoggedInCheck;

	public User(){	//To be changed //Add Database
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the UserName: ");	//Username entered
		UserName = inp.nextLine();
		System.out.print("Enter the Password: ");	//Password entered
		Password = inp.nextLine();
		System.out.print("Enter the Email-ID: ");
		EmailID = inp.nextLine();
		System.out.print("Enter the Session-ID: ");
		PresentSessionID = inp.nextLine();
		LoggedInCheck = true;
	}

	public boolean LogIn(){
		return true;
	}

	public boolean TextInput(){
		return true;
	}

	public boolean FileInput(){
		return true;
	}

	public boolean ReportRequest(){
		return true;
	}

	public boolean LogOut(){
		return true;
	}
}