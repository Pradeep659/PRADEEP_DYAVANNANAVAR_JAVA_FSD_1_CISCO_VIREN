package cisco.simplilearn.eightdayassignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumberMain { 
    public static boolean isValidE123(String s) 
    { 
        Pattern p = Pattern.compile("^([0]|\\+91)?\\d{10}"); 
 
        Matcher m = p.matcher(s); 
        return (m.find() && m.group().equals(s)); 
    } 
 
    public static void main(String[] args) 
    { 
        String phone1 = "+916360918981"; 
        String phone2 = "8197397659";
        String phone3 = "8495979659";
        String[] phoneNumbers= {phone1,phone2,phone3};
 
        for (int i = 0; i < phoneNumbers.length; i++) {
            String phoneNumber=phoneNumbers[i];
            if (isValidE123(phoneNumber)) 
                System.out.print(phoneNumber+" is valid phone number"); 
            else
                System.out.print(phoneNumber+" is invalid Phone number"); 
 
            System.out.println();
        }    
    } 
} 
 
