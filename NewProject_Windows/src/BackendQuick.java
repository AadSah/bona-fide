
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayush
 */
public class BackendQuick {
    public static String main() throws IOException {
	// set up the command and parameter
		String pythonScriptPath = "C:\\Users\\Ayush\\Desktop\\bona-fide-master\\bona-fide-master\\BackEnd\\main.py";
		String[] cmd = new String[2];
		cmd[0] = "py"; // check version of installed python: python -V
		cmd[1] = pythonScriptPath;
		 
		// create runtime to execute external command
		Runtime rt = Runtime.getRuntime();
		Process pr = rt.exec(cmd);
		 
		// retrieve output from python script
		BufferedReader bfr = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		String line = "";
		String result = "Null";
		while((line = bfr.readLine()) != null) {
		// display each output line form python script
			System.out.println(line);
			if(line!=null)	result = line;
		}

		System.out.println("The Plagiarism Percentage = "+result);
                return result;
	}
    
}
