/* 1)Write a program to create an interface called area which has a float field PI=3.14f and a method called area(float x,float y) to calculate the area
implmenets this interface into 2 classes circle and square and display the reults using the class main */


interface Area 
{
    float Pi=3.14f;

    float area(float x,float y);
}

class Circle implements Area{
    public float area(float x,float y)
    {
        return(Pi*x*x);
    }
}

class Square implements Area{
    public float area(float x,float y)
    {
        return(x*x);
    }
}

class Q1
{
    public static void main(String A[])
    {
        Circle C=new Circle();
        Square S=new Square();
        System.out.println("AREA OF CIRCLE= "+C.area(2,0));
        System.out.println("AREA OF SQUARE= "+S.area(2,0));
    }
}