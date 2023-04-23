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