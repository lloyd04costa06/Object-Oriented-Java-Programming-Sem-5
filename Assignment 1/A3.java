class shape{
   int l,b;
    shape()
    {
        l=0;
        b=0;
    }

    int area(int l,int b)
    {
        return(l*b);
    }

    int area(int l)
    {
        return(l*l);
    }

}

class A3{
    public static void main(String S[])
    {
        shape x=new shape();
        System.out.println("AREA OF RECTANGLE="+x.area(2,3));
        System.out.println("AREA OF SQUARE="+x.area(2));
        
    }
}