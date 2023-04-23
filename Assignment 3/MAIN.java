
/*
Implement a package called COLLEGE which includes the following:
 * An interface called DETAILS which contains a string type variable YEAR which sets YEAR=TECOMP, methods to set and print name of a student
 * A class called TECOMP which implements this interface
 * Two classes: classes - class Database and class ELE_JAVA inherit the above class
 * The above two classes have their own methods to set marks of the student. Total marks of Database are calculated as TW+IA+Theory marks. Total marks of ELE_JAVA are calculated as IA+Theory marks. Both the classes also implement separate interfaces which have set constant names of faculty as FACULTY1 for Database and FACULTY2 for java.
 * The source code which has a Class MAIN which includes the main method is in directory where the package is a subdirectory, has to display the total marksof a student in each subject with year, rollno of the student and the faculties
 */
import college.*;

public class MAIN {
    public static void main(String[] args) {
        Database db = new Database();
        db.setData("LLOYD ALRICH COSTA", 24, 54, 100, 23);
        db.displayData();

        System.out.println("");

        JAVA_ELE java = new JAVA_ELE();
        java.setData("RAM DESSAI", 45, 90, 25);
        java.displayData();
    }
}
