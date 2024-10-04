package demo;
class dhanush{
	int a;
	int b;
	public int add(int a, int b) {
		int result= a+ b;
		return result;
	}
}
public class Demo {
    public static void main(String[] arg) {
    	dhanush obj=new dhanush();
    	int add=obj.add(2, 5);
    	
    	System.out.println(add);
    }
}
