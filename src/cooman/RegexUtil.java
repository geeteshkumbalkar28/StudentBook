package cooman;

import exception.InvalidFirstName;
import exception.InvalidLastName;
import exception.InvalidMobileNumberException;
import util.ERegexPattern;

import java.util.regex.Pattern;

public class RegexUtil {
    public boolean isFirstNameStartWithCapitalLatter(String input) throws InvalidFirstName
    {
        boolean checkCondition=Pattern.matches(ERegexPattern.FIRST_NAME_PATTERN.getConstant(),input);
        if (checkCondition == false) {
            System.out.println();
            System.out.println();
            throw new InvalidMobileNumberException("Invalid First Name ......");

            }

        return checkCondition;
    }

    public boolean isLastNameStartWithCapitalLatter(String input)throws InvalidLastName
    {
        boolean checkCondition=Pattern.matches(ERegexPattern.LAST_NAME_PATTERN.getConstant(),input);
        if (checkCondition == false) {
            System.out.println();
            throw new InvalidMobileNumberException("Invalid Last Name ......");
            }

        return checkCondition;
    }
    public boolean isMobileNumberValid(String input) throws InvalidMobileNumberException
    {
        boolean checkCondition=Pattern.matches(ERegexPattern.MOBILE_NUMBER_PATTERN.getConstant(),input);
        if (checkCondition == false) {
            System.out.println();
            throw new InvalidMobileNumberException("Invalid Mobile Number ......");

        }

        return checkCondition;
    }

}
