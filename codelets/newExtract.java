//This is a program to map the acts to the case files
import java.io.*;
import java.util.*;

public class newExtract{

	public static void main(String[] args){

	try{
		FileInputStream fin = new FileInputStream("contentFile.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fin));
		String sentence=null;

		PrintWriter out = new PrintWriter("sentenceExtractedNew.txt");	

		while((sentence = br.readLine())!=null){
			// System.out.print(sentence);
			if(sentence!="\n"){
				out.print(sentence);
				out.print("\n");	
			}
			
			// final File folder = new File("/home/aadsah/Open_Soft_LLR/2019/OpenSoft-Data/All_FT");
			// for(final File file : folder.listFiles()){
			// 	if(file.isFile()){
				
			// 		Scanner scanner = new Scanner(new FileInputStream(file.getPath()));
				
			// 		while(scanner.hasNextLine()){
			// 			if(scanner.nextLine().contains(sentence)){
			// 				out.print(", "+file.getName());
			// 				break;
			// 			}
			// 		}				
			// 	}
			// }
			
		}
		fin.close();
		out.close();
		br.close();
	}catch(FileNotFoundException excep){
		System.out.println(excep);
		System.exit(-1);
	}
	catch(IOException exce){
		System.out.println(exce);
		System.exit(-1);
	}
	}
}
