class student{
    int roll;
    void getNum(int x)
    {
        roll=x;
    }

    void putnum()
    {
           System.out.println("ROLL NUMBER ="+roll);
    }
}

class test extends student
{
    float put1,put2;
    void getmarks(float x,float y)
    {
        put1=x;
        put2=y;
    }

    void putmarks()
    {
          System.out.println("P1 ="+put1);
          System.out.println("P2 ="+put2);
    }

}

interface sports{
    float sportMarks=100;

    void display();
}

class result extends test implements sports{
    int total;

    public void display()
    {
        System.out.println("SPORTS MARKS ="+sportMarks);

    }

    void display2()
    {  
        float x=put1+put2; 
          System.out.println("Total ="+x);
    }

}

class Q2{
    public static void main(String A[])
    {
        result X=new result();
        X.getNum(25);
        X.getmarks(100,98);
        X.putnum();
        X.putmarks();
        X.display();
        X.display2();
    }
}