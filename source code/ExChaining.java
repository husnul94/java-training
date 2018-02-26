
// Java Constructor Chaining Example

public class MyChaining {
    
    public MyChaining(){
        System.out.println("There is a school");
    }
    public MyChaining(int i){
        this();
        System.out.println("The school has four building");
    }
    public MyChaining(int i,int j){
        this(j);
        System.out.println("the school has 64 rooms");
    }
    
    public static void main(String a[]){
        MyChaining ch = new MyChaining(10,20);
    }
}