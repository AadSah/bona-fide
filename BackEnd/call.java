import java.lang.*;

public class call{
	public static void main(String args[]) throws Exception{
		String res[] = new String[2];
		res = backend.callbackend(3);
		System.out.println(res[0]+"  "+res[1]);
	}
}