package college;

interface JAVA_ELE_Faculty {
    String faculty2 = "FACULTY2";
}

public class JAVA_ELE extends TECOMP implements JAVA_ELE_Faculty {
    int theory, internal, total;

    public void setMarks(int th, int internal) {
        theory = th;
        this.internal = internal;
        total = theory + internal;
    }

    public void setData(String name, int rollNo, int theory, int internal) {
        setName(name);
        setRollNo(rollNo);
        setMarks(theory, internal);
    }

    public void displayData() {
        printName();
        printRollNo();
        System.out.println("Year = " + year);
        System.out.println("Faculty : " + faculty2);
        System.out.println("Total = " + total);
    }
}
