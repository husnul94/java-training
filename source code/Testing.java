class Testing {

	Testing (int x, int y){
	System.out.println("x :" +x + " " +"y :" +y);
	}

	Testing (String name, int marks){
	System.out.println("name :" +name + " " + "marks :" +marks);
	}

	public static void main (String x[]){
	Testing t1 = new Testing (7,5);
	Testing t2 = new Testing ("nol",50);
	}


}