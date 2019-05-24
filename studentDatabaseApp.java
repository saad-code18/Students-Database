
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
public class studentDatabaseApp 
{
    public static void main(String [] args)
    {
        
        //how many students might be added
        Scanner kb=new Scanner(System.in);
        System.out.println("How many students want to enroll");
        int numOfStudent=kb.nextInt();
        Student [] students=new Student[numOfStudent];
        
        
        //n number of students
        for(int i=0;i<numOfStudent;i++)
        {
            students[i]=new Student();
            students[i].enroll();
            students[i].payTution();
            students[i].toString();
        }
    }
    
    
}
