import java.awt.*;
import java.awt.event.*;
 
public class Form {
    void myForm(){
        Frame f=new Frame("EMPLOYEE FORM");
        Label lid=new Label("EMPLOYEE ID");
        TextField eid=new TextField(10);
        Label lname=new Label("EMPLYEE NAME");
        TextField ename=new TextField(10);
        Label laddress=new Label("EMPLOYEE ADDRESS");
        TextField eaddress=new TextField(10);
        Button b=new Button("SUBMIT");
        
        lid.setBounds(10,100,150,20);
        eid.setBounds(160,100,150,20);
        lname.setBounds(10,120,150,20);
        ename.setBounds(160,120,150,20);
        laddress.setBounds(10,140,150,20);
        eaddress.setBounds(160,140,150,20);
        b.setBounds(10,200,100,20);
        
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(500,400);
        
        f.add(lid);
        f.add(eid);
        f.add(lname);
        f.add(ename);
        f.add(eaddress);
        f.add(laddress);
        f.add(b);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        Form a = new Form();
        a.myForm();
    }
}
