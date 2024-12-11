//factorail means if you take any number it backtrack multiple and give result
// ex 5 5*4*3*2*1*0=120
public class factorial {
    int sum(int n)
    {
        if(n==0) return 1;
        return n*sum(n-1);
    }
    public static void main(String args[])
    {
        factorial obj=new factorial();
        int res=obj.sum(10);
        System.out.println(res);
    }
    }



