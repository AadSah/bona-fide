import java.io.*;
 
public class backend {
 
	public static String[] callbackend(int number) throws IOException {
	// set up the command and parameter
		String pythonScriptPath = "main"+number+".py";
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
		return result;
		// System.out.println("The Plagiarism Percentage = "+result);
	}
}