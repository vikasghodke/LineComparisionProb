
import java.util.*;

public class UseCases {
	public static void main(String[] args) {

		System.out.println("Welcome to lince comparision competition program On Master Branch");

		Scanner in = new Scanner(System.in);

		System.out.println("Enter a x1");
		double x1 = in.nextInt();
		System.out.println("Enter a y1");
		double y1 = in.nextInt();

		System.out.println("Enter a x2");
		double x2 = in.nextInt();

		System.out.println("Enter a y2");
		double y2 = in.nextInt();

		double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("distance=" + distance);

		String str = " Hello BridgeLabz";
		String str1 = "HELLO BRIDGELABZ";

		String str2 = "hello bridgelabz";

		String str3 = "Hello";

		String str4 = " ";

		System.out.println(str.equals(str1));
		System.out.println(str1.equals(str4));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));

		String s1 = "Vikas";
		String s2 = "vikas";
		System.out.println(s1.compareTo(s2));

		String st = "THis is a Vikas";
		String stt = "Hello sir";

		TOSolveWithObjec ojj1 = new TOSolveWithObjec();
		ojj1.Searching(st, stt);

	}

}

class TOSolveWithObjec {

	public static void Searching(String st, String stt) {

		System.out.println(st.equals(stt));
		System.out.println(st.compareTo(stt));

	}

}
