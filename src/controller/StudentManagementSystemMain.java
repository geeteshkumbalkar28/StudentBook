package controller;


import exception.InvalidFirstName;
import exception.InvalidLastName;
import exception.InvalidMobileNumberException;
import service.StudentManagementImp;


import java.util.Scanner;

public class StudentManagementSystemMain
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentManagementImp iStudentManagementImp = new StudentManagementImp();


        int choice = 1;
        while(choice!=0)
        {

            iStudentManagementImp.showCoditions();


            int checkCondition = scan.nextInt();

            switch(checkCondition)
            {
                case 1:
                    try
                    {

                        iStudentManagementImp.create();
                    }
                    catch (InvalidMobileNumberException e)
                    {
                        System.out.println(e);
                        iStudentManagementImp.create();
                    }
                    catch (InvalidFirstName e)
                    {
                        System.out.println(e);
                        iStudentManagementImp.create();
                    }
                    catch (InvalidLastName e)
                    {
                        System.out.println(e);
                        iStudentManagementImp.create();
                    }

                break;
                case 2:
                    iStudentManagementImp.display();
                break;
                case 3:
                    iStudentManagementImp.update();
                break;
                case 4:
                    iStudentManagementImp.remove();
                break;
                case 5:
                    iStudentManagementImp.searchByRollNo();
                break;
                case 6:
                    iStudentManagementImp.searchByFirstName();
                break;
                case 7:
                    iStudentManagementImp.searchByLastName();
                break;
                case 8:
                iStudentManagementImp.searchByStandard();
                break;
                case 9:
                    choice = 0;
                    System.out.println("---*------*----*----Thank you ----*---*---*---");
                break;

            }
        }

    }
}
