package classDefinitions;	//Package Name to be entered here

import java.util.*;

public class SessionFile extends User{			//class name and defn

	public String FileName;	//FileName
	public String ContentID;	//Percentage Plagiarised Value
	public int NoOfSentences;

	public SessionFile(){
		FileName = null;
		ContentID = null;
		NoOfSentences = 0;
	}
//All functions need to be modified along with their access specifier
	public boolean FileCompatible(){
		return true;
	}

	public boolean ExtractSentence(){
		return true;
	}
}