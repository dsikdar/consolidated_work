package quicktest;

public class Prob1 {

	public static void main(String[] args) {
		String s="+++-+----+++-";
		String[] minustring=s.split("\\-");
		System.out.println(s.length() - minustring.length);
	}
}
