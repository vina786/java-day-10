//printing fibonnaci series from 1 to 10
public class fibonacciseries1to10 {
    public static int fib(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String args[])
    {
        int n=10;
        for(int i=0;i<=10;i++)
        {
            int res=fib(i);
            System.out.println(i+"->"+res);
        }
    }
}