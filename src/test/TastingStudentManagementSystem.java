package test;

import cooman.RegexUtil;
import org.junit.Assert;
import org.junit.Test;

public class TastingStudentManagementSystem
{
    @Test
    public void mobileNoTest1()
    {
        RegexUtil regexUtil = new RegexUtil();
        Assert.assertTrue(regexUtil.isMobileNumberValid("7447376717"));
    }
    @Test
    public void mobileNoTest2()
    {
        RegexUtil regexUtil = new RegexUtil();
        Assert.assertTrue(regexUtil.isMobileNumberValid("9822856670"));
    }
    @Test
    public void mobileNoTest3()
    {
        RegexUtil regexUtil = new RegexUtil();
        Assert.assertTrue(regexUtil.isMobileNumberValid("8551020272"));
    }


    @Test
    public void firstNameTest1()
    {
        RegexUtil regexUtil = new RegexUtil();
        Assert.assertTrue(regexUtil.isFirstNameStartWithCapitalLatter("Geetesh"));
    }
    @Test
    public void firstNameTest2()
    {
        RegexUtil regexUtil = new RegexUtil();
        Assert.assertTrue(regexUtil.isFirstNameStartWithCapitalLatter("Lokesh"));
    }
    @Test
    public void firstNameTest3()
    {
        RegexUtil regexUtil = new RegexUtil();
        Assert.assertTrue(regexUtil.isFirstNameStartWithCapitalLatter("Rohan"));
    }
    @Test
    public void lastNameTest1()
    {
        RegexUtil regexUtil = new RegexUtil();
        Assert.assertTrue(regexUtil.isLastNameStartWithCapitalLatter("Joshi"));
    }
    @Test
    public void lastNameTest2()
    {
        RegexUtil regexUtil = new RegexUtil();
        Assert.assertTrue(regexUtil.isLastNameStartWithCapitalLatter("Kumbalkar"));
    }
    @Test
    public void lastNameTest3()
    {
        RegexUtil regexUtil = new RegexUtil();
        Assert.assertTrue(regexUtil.isLastNameStartWithCapitalLatter("Wandile"));
    }


}
