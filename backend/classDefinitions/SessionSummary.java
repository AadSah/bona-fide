package classDefinitions;	//Package Name to be entered here

import java.util.*;

public class SessionSummary extends Session{			//class name and defn

	public String MatchedSources[] = new String[100];	//Matched Sources for a Session
	public int PercentagePlagiarised;	//Percentage Plagiarised Value

	public SessionSummary(){
		MatchedSources[0] = "End";
		PercentagePlagiarised = 0;
	}
//All functions need to be modified along with their access specifier
	public String getSummary(){
		return "true";
	}

	public boolean DownloadReport(){
		return true;
	}
}