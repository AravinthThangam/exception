package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	public static void main(String[] args)throws IOException {
		try {
			File f=new File("C:\\Users\\Aravinth\\Desktop\\new.txt");
			FileReader fn=new FileReader(f);
			int temp=0;
			while((temp=fn.read())!=-1) {
				System.out.print((char)(temp));
			}
		}
		catch(FileNotFoundException f) {
			System.out.println("Not Found");
		}
	}
}
