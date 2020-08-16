package delete;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {

		File f = new File("input.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		int lineNumber = 0;
		int exceptionFoundinline = 0;
		String message = "";
		while (message != null) {
			if (message.equals("Exception")) {
				exceptionFoundinline = lineNumber;

			}
			message = br.readLine();
			lineNumber++;
			
		}
		br.close();
		br = new BufferedReader(new FileReader(f));
		System.out.println("after");
		for(int i=0;i<exceptionFoundinline+5;i++) {
			String msg=br.readLine();
			if(i>=exceptionFoundinline)
				System.out.println(msg);
		}
		br.close();
		br = new BufferedReader(new FileReader(f));
		System.out.println("before");
		for(int i=0;i<exceptionFoundinline;i++) {
			String msg=br.readLine();
			if(i>=exceptionFoundinline-5-1)
				System.out.println(msg);
		}

	}
}
