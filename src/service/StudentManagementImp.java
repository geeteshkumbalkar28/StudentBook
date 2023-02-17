package service;

import Interface.IStudentManagement;
import Interface.StudentManagemantEditAndRemove;
import cooman.RegexUtil;
import exception.InvalidFirstName;
import exception.InvalidLastName;
import exception.InvalidMobileNumberException;
import util.ERegexPattern;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentManagementImp extends StudentManagemantEditAndRemove implements IStudentManagement  {
    private static RegexUtil regexUtil = new RegexUtil();
     private static LinkedList<Student> linkedList = new LinkedList<>();
    private static Scanner SCANNER = new Scanner(System.in);
    @Override
    public void showCoditions()
    {
        System.out.println();
        System.out.println("Enetr your choice");
        System.out.println("1 : Create Student contact");
        System.out.println("2 : display all student data");
        System.out.println("3 : Update Student contact");
        System.out.println("4 : Remove Student contact");

        System.out.println("5 :Search by Roll Number");
         System.out.println("6 :Search By First Name");

        System.out.println("7 :Search By Last Name");
        System.out.println("8 :search By Subject");

        System.out.println("9 : Terminate the application");

    }
    public void create()throws InvalidMobileNumberException, InvalidLastName, InvalidFirstName
    {
        Student student = new Student();
//        private int rollNo;
//        private String firstName;
//        private String lastName;
//        private long mobileNumber;
//        private int standard;
//        /////set/////

        System.out.println("Enter the First Name of student ");

       String firstName =SCANNER.next();
        student.setFirstName(firstName);

        System.out.println("Enter the Last Name of student ");
        String lastName =SCANNER.next();
        student.setLastName(lastName);

        System.out.println("Enter the Roll No of student ");
        int rollNo =SCANNER.nextInt();
        student.setRollNo(rollNo);
        try
        {

            System.out.println("Enter the Mobile of student ");
            long mobileNumber = SCANNER.nextLong();
            student.setMobileNumber(mobileNumber);


        }
        catch(Exception e)
        {
            System.out.println(e);
            System.err.println("invalid Mobile number");
            System.out.println("Enter the standerd of student ");

        }

        try
        {

            System.out.println("Enter the standerd of student ");
            int standerd = SCANNER.nextInt();
            student.setStandard(standerd);

        }
        catch(Exception e)
        {
            System.out.println(e);
            System.err.println("invalid standerd name");
            System.out.println("Enter the standerd of student ");

        }

    if(regexUtil.isFirstNameStartWithCapitalLatter(firstName) == true)
    {
            if(regexUtil.isLastNameStartWithCapitalLatter(lastName)==true)
            {
                String mobilNo= student.getMobileNumber()+"";

                if(regexUtil.isMobileNumberValid(mobilNo) == true)
                {
                    linkedList.add(student);
                    System.out.println();
                    System.out.println("-------------------------------------------");
                    System.out.println("Added Succesfully");
                    System.out.println("-------------------------------------------");
                }
            }
        }

    }
    public void searchByRollNoAndEdit(int rollNo)
    {
        for(int i = 0; i<linkedList.size();i++)
        {
            if(linkedList.get(i).getRollNo()== rollNo)
            {

                System.out.println("Enter the First Name of student ");
                String firstName =SCANNER.next();
                if(regexUtil.isFirstNameStartWithCapitalLatter(firstName)==true)
                {
                    linkedList.get(i).setFirstName(firstName);
                }
                System.out.println("Enter the Last Name of student ");
                String lastName =SCANNER.next();
                if(regexUtil.isLastNameStartWithCapitalLatter(lastName)==true)
                {
                    linkedList.get(i).setLastName(lastName);
                }


                System.out.println("Enter the Roll No of student ");
                linkedList.get(i).setRollNo(SCANNER.nextInt());
                System.out.println("Enter the Mobile of student ");
                Long mobileNumber = SCANNER.nextLong();
                String mobilNo= mobileNumber+"";

                if(regexUtil.isMobileNumberValid(mobilNo) == true)
                {
                    linkedList.get(i).setMobileNumber(mobileNumber);
                }
                System.out.println("Enter the standerd of student ");
                linkedList.get(i).setStandard(SCANNER.nextInt());

            }
        }
    }

    public void update()
    {

            System.out.println("Enter the roll number that you want to update");
            int rollNo=SCANNER.nextInt();
//
//            linkedList.stream()
//                    .filter(n->n.getRollNo()==rollNo)
//                    .forEach(n-> System.out.println( "First Name : "+n.getFirstName()+"\n"+
//                                                    "Last Name  : "+ n.getLastName()+"\n"+
//                                                    "Roll No    : "+ n.getRollNo()+"\n"+
//                                                    "Mobile no  : "+ n.getMobileNumber()+"\n"+
//                                                    "standard   : "+ n.getStandard()));
             searchByRollNoAndEdit(rollNo);
    }
    public void remove() {
        System.out.println("Enter the roll number that you want to remove");
        int rollNo = SCANNER.nextInt();

        for (int i = 0; i < linkedList.size(); i++)
        {
            if (linkedList.get(i).getRollNo() == rollNo) {
                linkedList.remove(i);
                break;
            }
        }

    }

   public void display()
    {
        for(int i= 0; i < linkedList.size();i++)
        {
            System.out.println("------------------Student" +(i+1)+"---------");
            System.out.println("First Name : "+linkedList.get(i).getFirstName());
            System.out.println("Last Name  : "+ linkedList.get(i).getLastName());
            System.out.println("Roll No    : "+ linkedList.get(i).getRollNo());
            System.out.println("Mobile no  : "+ linkedList.get(i).getMobileNumber());
            System.out.println("standard   : "+ linkedList.get(i).getStandard());

        }
    }
    public void searchByRollNo()
    {
        System.out.println("Enter the roll number that you want to search");
        int rollNo = SCANNER.nextInt();

        linkedList.stream()
                .filter(n->n.getRollNo()==rollNo)
                .forEach(n-> System.out.println( "First Name : "+n.getFirstName()+"\n"+
                        "Last Name  : "+ n.getLastName()+"\n"+
                        "Roll No    : "+ n.getRollNo()+"\n"+
                        "Mobile no  : "+ n.getMobileNumber()+"\n"+
                        "standard   : "+ n.getStandard()));
    }
    public void searchByFirstName()
    {

        System.out.println("Enter the First Name that you want to search");
        String firstName = SCANNER.next();

        linkedList.stream()
                .filter(n->n.getFirstName().equals(firstName))
                .forEach(n-> System.out.println( "First Name : "+n.getFirstName()+"\n"+
                        "Last Name  : "+ n.getLastName()+"\n"+
                        "Roll No    : "+ n.getRollNo()+"\n"+
                        "Mobile no  : "+ n.getMobileNumber()+"\n"+
                        "standard   : "+ n.getStandard()));
    }
    public void searchByLastName()
    {

        System.out.println("Enter the Last Name that you want to search");
        String lastName = SCANNER.next();

        linkedList.stream()
                .filter(n->n.getLastName().equals(lastName))
                .forEach(n-> System.out.println( "First Name : "+n.getFirstName()+"\n"+
                        "Last Name  : "+ n.getLastName()+"\n"+
                        "Roll No    : "+ n.getRollNo()+"\n"+
                        "Mobile no  : "+ n.getMobileNumber()+"\n"+
                        "standard   : "+ n.getStandard()));
    }
    public void searchByStandard()
    {

        System.out.println("Enter the standard Name that you want to search");
        int standard = SCANNER.nextInt();

        linkedList.stream()
                .filter(n->n.getStandard()==standard)
                .forEach(n-> System.out.println( "First Name : "+n.getFirstName()+"\n"+
                        "Last Name  : "+ n.getLastName()+"\n"+
                        "Roll No    : "+ n.getRollNo()+"\n"+
                        "Mobile no  : "+ n.getMobileNumber()+"\n"+
                        "standard   : "+ n.getStandard()));
    }
}
