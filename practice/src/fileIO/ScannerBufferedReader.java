package fileIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerBufferedReader {

	public static void main(String[] arg) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//int data=br.read();
		//System.out.println(data);
		String strData=br.readLine();
		System.out.println(strData);
		
		System.out.println("Buffered reader done");
		Scanner sc=new Scanner(System.in);
		int data2=sc.nextInt();
		System.out.println(data2);
	}
}
