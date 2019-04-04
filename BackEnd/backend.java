import java.io.*;
 
public class backend {
 
	public static void main(String[] args) throws IOException {
	// set up the command and parameter
		String pythonScriptPath = "/home/aadsah/Desktop/main.py";
		String[] cmd = new String[2];
		cmd[0] = "python"; // check version of installed python: python -V
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
	}
}