class casio1{
	int num1;
	int num2;
	String operator;
	
	
	public casio1() {
		num1= 5;
		num2= 0;
		operator= "Nothing";
		
	}
	public casio1(int num1) {
		num1= 5;
		num2= 0;
		operator= "Nothing";
		
	}
	public casio1(int num1, int num2) {
		num1 = 4;
		num2 = 9;
		operator = "Nothings";
	}
	
	public casio1(int num1, int num2, String Hello) {
		num1 = 3;
		num2 = 6;
		operator = "Hello";
	}
}	


public class ConstructorOverloading {
	
	public static void main(String[] args) {
		casio1 obj = new casio1();  // the way how you call the constructor like that the values of that will be returned.
	}

}
