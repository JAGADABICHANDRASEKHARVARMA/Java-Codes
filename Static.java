
/*

Here in this how to use the "Static" keyword and If I want any varible that doesn't be object specfic then I can give "static" Keyword . 

If I make any varible static, then it doesn't belong to any particular varible.

when you give "static" keyword to any varible , it's memory will be created in class memory , not in heap memory as normal.

*/

class Emp1{
    int eid;
    int salary;
    static String ceo;

    public void show(){
        System.out.println(eid+":" + salary+":"+ ceo);
    }

}

public class Static {
    public static void main(String[] args){
        Emp1 navin = new Emp1();
        navin.eid=9;
        navin.salary=1000;

        Emp1 chandu2 = new Emp1();
        chandu2.eid= 10;
        chandu2.salary = 2000;
        
        navin.ceo= "chain";

        chandu2.show();
        navin.show();

    }
}
