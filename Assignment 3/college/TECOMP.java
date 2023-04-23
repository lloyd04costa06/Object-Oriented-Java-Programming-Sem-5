package college;

interface Details {
    String year = "TECOMP";

    void printName();

    void setName(String name);
}

public class TECOMP implements Details {
    String name;
    int rollNo;

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Name: " + name);
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void printRollNo() {
        System.out.println("Roll Number = " + rollNo);
    }

}

interface DatabaseFaculty {
    String faculty1 = "FACULTY1";
}