package util;

public enum ERegexPattern
{
     FIRST_NAME_PATTERN("^[A-Z]{1}[a-zA-Z]{1,}$"),
     LAST_NAME_PATTERN("^[A-Z]{1}[a-zA-Z]{1,}$"),
     MOBILE_NUMBER_PATTERN("[6-9][0-9]{9}");
    String constant;

    ERegexPattern(String constant) {
        this.constant=constant;
    }

    public String getConstant()
    {
        return constant;
    }
}
