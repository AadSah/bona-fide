import java.lang.*;

public class call{
	public static void main(String args[]) throws Exception{
		// String fine = System.getProperty("user.dir");
		// System.out.println(fine);
		String res[] = new String[2];
		res = backend.callbackend(3);
		System.out.println(res[0]+"  "+res[1]);
	}
}