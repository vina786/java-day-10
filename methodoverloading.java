// in method overloading the methods is same and parameters are different
public class methodoverloading {
    static void a()
    {
        System.out.println("hello");
    }
    static void a(int b)
    {
        System.out.println("hello"+b);
    }
    static void a(int b,int c,String h)
    {
        System.out.println("hello"+b+" "+c+" "+h);
    }
    public static void main(String args[])
    {
        a();
        a(5);
        a(4,5,"vinay");

    }
    }