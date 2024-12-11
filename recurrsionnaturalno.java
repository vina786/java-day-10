// sum of n natural numbers using recurrsion
//backtracking code will be executed in recurrsion
//ex 5 5+4+3+2+1+0=15
public class recurrsionnaturalno {
    int sum(int n)
    {
        if(n==0) return 0;
        return n+sum(n-1);
    }
    public static void main(String args[])
    {
        recurrsionnaturalno obj=new recurrsionnaturalno();
        int res=obj.sum(10);
        System.out.println(res);
    }
    }

