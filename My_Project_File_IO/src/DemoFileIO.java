import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DemoFileIO {
	
	public static void main(String[] args) throws IOException {
		FileInputStream inputStream=null;
		try {
			File toBeRead = new File("E://inputfile.txt");

			inputStream = new FileInputStream(toBeRead);
			int data;
			while (inputStream.available() > 0) {
				data = inputStream.read();
				System.out.print((char) data);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\nNow writing on file");
		FileOutputStream toBeWritten=new FileOutputStream  (new File("E://outputfile.txt"));
		int datatobewritten=0;
		while(datatobewritten!=-1) {
			datatobewritten=System.in.read();
			toBeWritten.write(datatobewritten);
		}
		toBeWritten.flush();
		toBeWritten.close();
	}
}
