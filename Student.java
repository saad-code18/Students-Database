
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saad
 */
public class Student {
    
    private String firstName;
    private String lastName;
    private int batchYear;
    private String studentID;
    private String courses;
    private int tutionBalance=0;
    private static int costOfCourses = 4500;
    private static int id=1000;
    Scanner kb=new Scanner(System.in);
    //constructor to ask students name and year
    public Student()
    {
        
        System.out.println("Enter student's first name");
        this.firstName=kb.nextLine();
        
        System.out.println("Enter student's last name name");
        this.lastName=kb.nextLine();
        
        System.out.println("1- Frsher\n2- Sophomore\n3- Junior\n4- Senior\n Enter student's class level");
        this.batchYear=kb.nextInt();
        
        setStudentId();
        
        System.out.println(firstName+" "+lastName+" "+batchYear+" "+studentID);
        
       
    }
    //Generate ID
    private void setStudentId()
    {
        id++;
        this.studentID = batchYear+""+ id;
    }
    //Enroll courses
    public void enroll()
    {
        do{
        System.out.print("Enter courses to enroll (Q to quit):");
        String course=kb.nextLine();
        if(!course.equals("Q"))
        {
         courses= courses+"\n"+course;
         tutionBalance=tutionBalance+costOfCourses;
        }
        else
        {
            //System.out.println("Break!");
            break;
        }
        
        
        }while(1 !=0);
        
        System.out.println("Enrolled in: "+courses);
        System.out.println("Tution Balance: $"+tutionBalance);
    }
    // view balance
    public void viewBalance()
    {
        System.out.println("Your Balance is: $"+tutionBalance);
    }
    //pay tution
    public void payTution()
    {
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner kb=new Scanner(System.in);
        int payment=kb.nextInt();
        tutionBalance = tutionBalance-payment;
        System.out.println("Thank you for your payment $"+payment);
        viewBalance();
    }
    //show status
    public String toString()
    {
        return  "Name: "+firstName+" "+lastName+
                "\n Grade Level: "+batchYear+
                "\n Student ID: "+studentID+
                "\n Courses Enrolled: "+courses+
                "\n Balance: $"+tutionBalance;
    }
    
    
}
