

class printer
{
    public void show(Number i)   // Number is super class of Integre, float, double, etc
    {
        System.out.println(i);
    }
}

public class AbstractDemo2
{
    public static void main(String[] args)
    {
        printer obj = new printer();
        obj.show(29);
        obj.show(88.0d);

    }
}
