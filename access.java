// used to access member
public class access {
    void display()
    {
        System.out.println("hello vinay");
    }
    void dis1()
    {
        this.display();
    }
    public static void main(String args[])
    {
        access o=new access();
        o.dis1();
    }
    
    
}
