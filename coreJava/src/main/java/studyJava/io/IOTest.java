package studyJava.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

public class IOTest {
	
	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("");
		in = new LineInputStream(in);
		in.read();
			
		
		
		
	}
	
}
