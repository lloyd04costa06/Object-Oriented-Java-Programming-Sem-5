class A1{
    
    public static void main(String S[])
    {
        int n=1001,a=0,b=0;
        int temp=n;

        while(n>0)
        {
            a=n%10;
            b=(b*10)+a;
            n=n/10;
        }

        if(b==temp)
        System.out.println("PALLINDROME NUMBER");
        else
        System.out.println("NOT A PALLINDROME NUMBER");

    }
}