package facade;

import modules.StringRegex;

public class StringFacade
{
    public static boolean validate(ValidationType type, String subject)
    {
        boolean result = false;
        switch (type)
        {
            case PHONE_NUMBER:
                result = StringRegex.isPhoneNumber(subject);
                break;
            case EMAIL:
                result = StringRegex.isEmail(subject);
                break;
            case URL:
                result = StringRegex.isUrl(subject);
                break;
            case ZIPCODE:
                result = StringRegex.isZipCode(subject);
                break;
            default:
                throw new IllegalArgumentException("Type not recognized: " + type);
        }

        return result;
    }

    public static Operation operate(String[] data)
    {
        return new Operation(data);
    }

    public enum ValidationType
    {
        PHONE_NUMBER,
        EMAIL,
        URL,
        ZIPCODE
    }
}
