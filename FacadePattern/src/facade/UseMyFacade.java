package facade;

import facade.StringFacade.ValidationType;

import java.util.Arrays;

public class UseMyFacade
{
    public static void main(String[] args)
    {
        System.out.println(StringFacade.validate(ValidationType.PHONE_NUMBER, "999-888-7777"));
        System.out.println(StringFacade.validate(ValidationType.PHONE_NUMBER, "9998887777"));
        System.out.println(StringFacade.validate(ValidationType.PHONE_NUMBER, "88-7777"));
        System.out.println(StringFacade.validate(ValidationType.EMAIL, "e@e.com"));
        System.out.println(StringFacade.validate(ValidationType.EMAIL, ".com"));

        String[] colors = {"green", "green", "pink", "blue", "pink", "red", "red", "red"};
        Operation operation = StringFacade.operate(colors);

        //make some changes
        operation.removeDuplicates().filter("blue").resize(5);
        System.out.println(Arrays.toString(operation.getData()));
    }
}
