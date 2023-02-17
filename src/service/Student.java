package service;

public class Student {
    private int rollNo;
    private String firstName;
    private String lastName;
    private long mobileNumber;
    private int standard;
    /////set/////

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }
    /////get////

    public int getRollNo() {
        return rollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public int getStandard() {
        return standard;
    }
}
