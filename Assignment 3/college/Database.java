package college;

public class Database extends TECOMP implements DatabaseFaculty {
    int theory, internal, tw, total;

    public void setMarks(int th, int internal, int tw) {
        theory = th;
        this.internal = internal;
        this.tw = tw;
        total = theory + internal + tw;
    }

    public void setData(String name, int rollNo, int theory, int internal, int tw) {
        setName(name);
        setRollNo(rollNo);
        setMarks(theory, internal, tw);
    }

    public void displayData() {
        printName();
        printRollNo();
        System.out.println("Year = " + year);
        System.out.println("Faculty : " + faculty1);
        System.out.println("Total = " + total);
    }
}
