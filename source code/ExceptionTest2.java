// ArrayIndexOutOfBoundsException 

import java.io.*;

class ExceptionTest2 {

	public static void main (String args[]) {

	//System.out.println (args [0]);
	//System.out.println (args [1]);

	//File f = new File ("input.txt");
	//f.canRead();

	try {
	FileInputStream f = new FileInputStream ("input.txt");
	f.read ();

	}

	/*catch (FileNotFoundException fe) {
		System.out.println (fe);

	} */
		
	catch (IOException ie) {
		System.out.println (ie);
	}

    }

}