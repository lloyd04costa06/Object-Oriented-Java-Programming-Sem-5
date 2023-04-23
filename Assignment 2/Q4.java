/*4) Write a program to create an abstract class animal which has methods eat() and shelter() and an abstract method lifespan() write a child class
to implmnet the abstract methods*/

abstract class animal{
    void eat()
    {
        System.out.println("INSIDE EAT()");
    }
    void shelter(){
        System.out.println("INSIDE SHELTER()");
    }
    abstract void lifespan();
}

class child extends animal{
    void lifespan()
    {
        System.out.println("INSIDE CHILD()");
    }
}

class Q4{
    public static void main(String A[])
    {
        child C=new child();

        C.eat();
        C.shelter();
        C.lifespan();

    }
}