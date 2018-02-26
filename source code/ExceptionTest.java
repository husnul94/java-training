class ExceptionTest {

	public static void main (String args[]) {
		
		int x = 10;
		int y = 0;
		int z = 5;

		//z = x/y;

		//System.out.println ("z : " +y);

		try {

		z = x/y;
		}

		catch (ArithmeticException e) {

		//System.out.println("Dividing by zero");
		System.out.println("Cannot dividing by zero : this is the error :" +e);
		//System.out.println(e.getMessage());
		} 
		System.out.println(z);
	}
}