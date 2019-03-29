//This is a program searches the sentence searched in the text parsed from the corresponding webpage url
import java.io.*;
import java.util.*;

public class findMatch{

	public static void main(String[] args){

	try{
		FileInputStream fin = new FileInputStream("sentenceExtractedNew.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fin));
		String sentence=null;
		int flag=0;
		String urlname=null;

		PrintWriter out = new PrintWriter("matchedSources.txt");	

		while((sentence = br.readLine())!=null){
			// out.print(sentence);
			// final File folder = new File("/home/aadsah/Open_Soft_LLR/2019/OpenSoft-Data/All_FT");
			// for(final File file : folder.listFiles()){
				// if(file.isFile()){
				
			Scanner scanner = new Scanner(new FileInputStream("extractedWeb.txt"));
				
			while(scanner.hasNextLine()){
				if(flag==0){
					urlname = scanner.nextLine();
					flag=1;
					continue;
				}
				if(scanner.nextLine().contains(sentence)){
					// out.print("");
					flag=101;
					break;
				}
			}
			if(flag==101){
				out.print(urlname+"\n");
			}				
		// }
		}
			// out.print("\n");
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
