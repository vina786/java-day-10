//used the pass as an argument
import java.util.*;
public class argument {
    String name;
    argument(String name)
    {
        this.name=name;
    }
    void dis1()
    {
        System.out.println(name);
    }
    void agt()
    {
        teacher s=new teacher();
        s.teach(this);
    }
    public static void main(String args[])
    {
        argument o=new argument("vinay");
        o.agt();
    }
}
class teacher{
    public void teach(argument s)
    {
        s.dis1();
    }
}