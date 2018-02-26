class TestingStatic {

   int x = 10;
    static int y = 20;
	
	void doit () {
	System.out.println ("hi");
	}

	static void dontDo () {
	System.out.println ("bye");
	}

    public static void main (String args[]) {
	TestingStatic t1 = new TestingStatic();	
	System.out.println("x : " +t1.x);	//object can call variable		
	//doit();      can' call because instance variable 	
	t1.doit();
	dontDo();	//can call directly bcoz static method
	}




}