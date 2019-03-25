package classDefinitions;	//Package Name to be entered here

import java.util.*;

public class Session extends User{			//class name and defn

	public String SessionID;	//Unique Session ID for each Session
	public Date SessionDate;	//Get date of the Session
	public String ContentID;	//Identifies the content in the Database

	public Session(){

		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the SessionID: ");	//SessionID entered
		UserName = inp.nextLine();
		System.out.print("Enter the SessionDate: ");	//Date firstDate = new Date(int year, int month, int date);
		int year, month, day;
		System.out.print("Year(YYYY): ");
		year = inp.nextInt();
		System.out.print("Month(MM): ");
		month = inp.nextInt();
		System.out.print("Day(DD): ");
		day = inp.nextInt();
		SessionDate = new Date(year,month,day);
		System.out.print("Enter the Content-ID: ");
		ContentID = inp.nextLine();
	}
//All functions need to be modified along with their access specifier
	public String getSessionID(){
		return SessionID;
	}

	public String getUser(){
		return UserName;
	}

	public String getContent(){
		return "true";
	}

	public void StartAnalysis(){
		// return true;
	}

	public boolean DeleteContent(){
		return true;
	}

	public boolean EndSession(){
		return true;
	}
}