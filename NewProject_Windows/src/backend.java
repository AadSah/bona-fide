/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayush
 */
import java.io.*;
 
public class backend {
 
	public static String[] callbackend(int number) throws IOException {
	// set up the command and parameter
                String working = System.getProperty("user.dir");
		String pythonScriptPath = working+"\\main"+number+".py";
                //System.out.println(pythonScriptPath);
		String[] cmd = new String[2];
		cmd[0] = "python"; // check version of installed python: python -V
		cmd[1] = pythonScriptPath;
		 
		// create runtime to execute external command
		Runtime rt = Runtime.getRuntime();
		Process pr = rt.exec(cmd);
		 
		// retrieve output from python script
		BufferedReader bfr = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		String line = "";
		String result[] = new String[2];
		result[0] = result[1] = null;
		int i=0;
		while((line = bfr.readLine()) != null) {
		// display each output line form python script
			// System.out.println(line);
			if(line!=null)	result[i++] = line;
		}
                //System.out.println("The Plagiarism Percentage = "+result[0]);
                
		return result;
		// System.out.println("The Plagiarism Percentage = "+result);
	}
}
