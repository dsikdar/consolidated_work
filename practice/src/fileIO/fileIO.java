package fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileIO {
	public static void main(String [] args) throws IOException {
		File inputfile=new File("E://input.txt");
		FileInputStream inp=new FileInputStream(inputfile);
		char data;
		while(inp.available()>0) {
			data=(char)inp.read();
			System.out.print(data);
		}
		inp.close();
		
		FileOutputStream outstream=new FileOutputStream(new File("E://output.txt"));
		int i=0;
		while(i < 100) {
			outstream.write(i);
			i++;
		}
		outstream.flush();
		outstream.close();
	}
}
