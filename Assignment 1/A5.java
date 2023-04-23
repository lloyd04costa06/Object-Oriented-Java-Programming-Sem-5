//Write a program to implment class X which has varaible Y, write a constructor to initialze this value. Write a class Y which has the varaible j
//and write a constructor to insitalizde it.write a class z and write a constructor

class X{
    int A;
    X(int a)
    {
        A=a;
    }
}

class Y extends X{
    int B;
    Y(int a,int b)
    {
        super(a);
        B=b;
        
    }
}

class Z extends Y{
    int C;
    Z(int a, int b,int c)
    {
        super(a,b);
        C=c;
        
    }
}

class A5{
    public static void main(String s[])
    {
        Z obj=new Z(1,2,3);
        System.out.println("A="+obj.A);
        System.out.println("B="+obj.B);
        System.out.println("C="+obj.C);

    }
}