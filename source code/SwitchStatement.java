// Java switch statement
class SwitchStatement {
   public static void main(String[] args) {

      int week = 4;
      String day;
	        
      switch (week) {
         case 1:
           day = "Sunday";
           break;
         case 2:
           day = "Monday";
	   break;
         case 3:
           day = "Tuesday";
           break;
         case 4:
           day = "Wednesday";
	//System.out.println("Hi");
           break;
         case 5:
           day = "Thursday";
	//System.out.println("Bye");
	   break;
         case 6:
           day = "Friday";
           break;
         case 7:
           day = "Saturday";
           break;
         default: 
           day = "Invalid day";
           break;
      }
      System.out.println(day);
   }
}