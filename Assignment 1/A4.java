//Write a program to create a class bicycle which has to attributes, gear and speed, write a paramaterized constructor for this class
// let this class have 3 methos
//1) Applybrake: reduces the speed accordingly
//2) SpeedUp: Increases the speed acoordingly
//3) NoOfGreas: display no of greas and the speed
//Write another class called mountain bike which extends class bicycle and has a field called seat height
//implement a constructor to initiate the 3 parameters also write a methos that allows you to set the seat height to a new value
class Bicycle{
    int gear;
    float speed;
    Bicycle(int a, float b)
    {
        gear=a;
        speed=b;
    }

    void Apply_brake(float a)
    {
        speed=speed-a;
    }

    void Speed_up(float a)
    {
        speed=speed+a;
    }

    void No_of_gears()
    {
        System.out.println("NO OF GEARS="+gear+"\nSPEED="+speed);
    } 
}

class Mountain_bike extends Bicycle{
    float Seat_height;

    Mountain_bike(float speed,int gear, float seatH)
    {
        super(gear,speed);
        Seat_height=seatH;
    }

    void setH(float a)
    {
        Seat_height=Seat_height-a;
    }
}

class A4{

    public static void main(String S[])
    {
    Mountain_bike x=new Mountain_bike(5.5f,5,1.2f);
    x.Apply_brake(1.0f);
    x.Speed_up(3.0f);
    x.No_of_gears();
    }
}