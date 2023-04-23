class A2{
    public static void main(String S[])
    {
        int n=1111,sum=0,a;
        int temp=n;

        while(n>0)
        {
            a=n%10;
            sum=sum+a;
            n=n/10;
        }
        System.out.println("Sum="+sum);
    }
}