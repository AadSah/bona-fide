import java.io.*;

public class sentenceExtractor{
	public static void main(String args[]){

		try{
			FileInputStream fin = new FileInputStream("./contentFile.txt");
			int wordCount=0, sentenceCount=0, ch, temp=0;	//temp is for reducing spaces between lines
			FileOutputStream fout = new FileOutputStream("./sentenceExtracted.txt");

			while((ch=fin.read())!=-1)
			{
				if((char)ch == '.' || (char)ch == '?' || (char)ch == '!'){
					sentenceCount++;
					fout.write(ch);
					fout.write('\n');
					temp=1;
				}
				else if(ch==' ' && temp==1){
					temp=2;
					continue;
				}

				else if(ch=='\n'){
					continue;
				}
				else{
						fout.write((char)ch);
				// 	if(temp == 2) fout.write((char)ch);
				}
			}

			fin.close();
			fout.close();

			System.out.println("Sentences Extracted Successfully!\n");
			System.out.println("The Number of Sentences in the file = "+sentenceCount+"\n");
		}catch(IOException e){
			System.out.println(e);
			System.exit(-1);
		}
	}
}