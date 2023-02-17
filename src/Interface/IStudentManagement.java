package Interface;

import exception.InvalidFirstName;
import exception.InvalidLastName;
import exception.InvalidMobileNumberException;

public interface IStudentManagement {
    public void showCoditions();
    public void create()throws InvalidMobileNumberException, InvalidFirstName, InvalidLastName;
    public void update();
    public void searchByRollNo();
    public void searchByFirstName();
    public void searchByLastName();
    public void searchByStandard();
}
