import java.io.*;

public class docInfo{
	public static void main(String args[]){

		try{
			FileInputStream fin = new FileInputStream("./contentFile.txt");
			int wordCount=0, sentenceCount=0, ch;

			while((ch=fin.read())!=-1)
			{
				if((char)ch == ' ' || (char)ch == '\n') wordCount++;
				if((char)ch == '.' || (char)ch == '?' || (char)ch == '!') sentenceCount++;
			}

			fin.close();

			System.out.println("The Number of Words in the file = "+wordCount+"\n");
			System.out.println("The Number of Sentences in the file = "+sentenceCount+"\n");
		}catch(IOException e){
			System.out.println(e);
			System.exit(-1);
		}
	}
}