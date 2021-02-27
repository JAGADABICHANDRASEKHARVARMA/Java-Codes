//Her in the below code i have shown that how to access the inner class in outer class.
// that is done in main method as creating object of outer class first and then inner class object .
/*
Outer obj = new Outer();
Outer.inner obj1 = obj.new Inner();

Here we have 3 class files those wil;l be save as in oder of 
Outer.class
Outer$Inner.class
InnerDemo.class

*/



class Outer{                                               //Outer.class

    int a;
    public void show()
    {
        System.out.println("show in Outer class");

    }
    class Inner{                                               //Outer$Inner.class
        public void display()
        {
            System.out.println("In display");
        }
    }
}

public class InnerDemo {                                    //InnerDemo
    public static void main(String[] args){
       Outer obj = new Outer();
       obj.show();
       Outer.Inner obj1 = obj.new Inner();
       obj1.display();
    }
}
