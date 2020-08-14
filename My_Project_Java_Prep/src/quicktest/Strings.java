package quicktest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Strings {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*String sentence="I am Debajyoti Sikdar";
		//substring 
		String s1=sentence.substring(2);//shoolu print from am
		String s2=sentence.substring(4,13);//Debajyoti
		System.out.println(s1);
		System.out.println(s2);
		
		char c=sentence.charAt(0);
		System.out.println(c);//I
		String[] words=sentence.split(" ");
		for(int i=0;i<words.length;i++) {
			System.out.print(words[i]);
		}
		System.out.println("\n");
		StringBuilder b=new StringBuilder(sentence);
		b.setCharAt(0, 'H');
		System.out.println(b);
		
		System.out.println(sentence.indexOf("am"));
		System.out.println(sentence.indexOf('a'));
		System.out.println(sentence.indexOf('a',10));
		
		System.out.println(sentence.lastIndexOf('a'));//similar with index of
		
		File f=new File("E://test.txt");
		FileInputStream inp=new FileInputStream(f);
		while(inp.available()>0) {
			int data=inp.read();
			System.out.print((char)data);
		}
		System.out.println("%%%%%%%%%%%%%%%%%");
		BufferedReader br=new BufferedReader(new FileReader(f));
		while(true) {
			String sentenceFromFile=br.readLine();
			System.out.println(sentenceFromFile);
			if(sentenceFromFile==null)
				break;
		}
		System.out.println("Debu".contains("e"));
		*/
		String sentence2="Debu 1234 		kk";
		//String newsentence2=sentence2.replace('D', 's');
		//System.out.println(newsentence2);
		
		//String newsentence3=sentence2.replaceAll("\\s+", "");
		//System.out.println(newsentence3);
		
		StringBuilder two=new StringBuilder(sentence2);
		two.reverse();
		System.out.println(two);
	}

}
