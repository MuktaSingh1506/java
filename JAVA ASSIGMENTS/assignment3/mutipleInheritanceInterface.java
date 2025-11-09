package assignment3;

import java.util.Scanner;

interface PersonalDetails {
    void setDetails(String name, String id);
    void getDetails();
}
interface Skills {
    void setSkills();
    void getSkills();
}

class StudentResume implements PersonalDetails, Skills {
    String name;
    String id;
    String skills[];
    int size;

    @Override
    public void setDetails(String name, String id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public void getDetails() {
        System.out.println("Name: "+name+ " ID: "+id);  
    }
    @Override
    public void setSkills() {
        System.out.println("Enter number of skills: ");
        Scanner sc = new Scanner(System.in);
        
        size = sc.nextInt();

        skills = new String[size];
        System.out.println("Enter skills: ");
        for(int i=0; i<size; i++)
        {
            skills[i] = sc.next();
        }
        sc.close();
    }
    @Override
    public void getSkills() {
        for(String str : skills) {
            System.out.print(str + " ");
        }
        
    }
}
public class mutipleInheritanceInterface {
    public static void main(String[] args) {
        StudentResume s1 = new StudentResume();
        s1.setSkills();
        s1.getSkills();
    }
}
