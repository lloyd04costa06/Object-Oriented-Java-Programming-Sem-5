/*3) Write a program to create an interface IN1 and it has a interger variable A=10 and a display methd=od to display  the value A.Write another interface IN2 which has an interger b=10
and a method dispay to display the value of b and another method show. Write aclass testClass which implements interface1, write another class testClass2 which implementsboth the interfaces*/

interface IN1{
    int A=10;
    void display1();
}

interface IN2{
    int B=10;
    void display2();
}

class TestCLASS1 implements IN1{
    public void display1()
    {
        System.out.println("A="+A);
    }
}

class TestCLASS2 implements IN1,IN2{
    public void display1()
    {
        System.out.println("A="+A);
    }

     public void display2()
    {
        System.out.println("B="+B);
    }
}

class Q3{

    public static void main(String A[])
    {
        TestCLASS1 T1=new TestCLASS1();
         TestCLASS2 T2=new TestCLASS2();
         T1.display1();
         T2.display1();
         T2.display2();
    }
}


