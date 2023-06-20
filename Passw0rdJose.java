/*File: Passw0rdJose.java
Project: CSIS 3101 Assignment 11
Author: Jose Ron Coka
History: Version 1.0 April 8, 2022*/

public class Passw0rdJose {
    
    private String pswd;

    Passw0rdJose (String p){
        this.pswd = p; 
    }

    public String  checkPassword(){
        /*The password should be at least 12 characters strong. 
 The password should contain EXACTLY TWO upper case letters.
 The password should have EXACTLY TWO digits.
 The password should contain EXACTLY ONE special character like $ or ! or %. 
 The password should not contain any spaces.
 The password should contain all remaining lower case letters
    //A password Is valid if it contains 16 characters. 
    //One uppercase, 
    //one lowercase char, 
    //one digit, 
    //one special character. 
    //If all conditions are met it should return true, if not it should return false.
    */
    String message="";
    char C;
    int upCount=0;
    int digCount=0; 
    int lowCount=0;
    int specialCount=0;
    
    
    for (int i=0;i < pswd.length();i++){
        C=pswd.charAt(i);

        if( Character.isDigit(C)==true) {
           digCount+=1;
        }
        else if (Character.isUpperCase(C)==true){
            upCount+=1;
        } 
        else if (Character.isLowerCase(C)==true){
            lowCount+=1;
        }
        else if (Character.isDigit(C)!=true && Character.isUpperCase(C)!=true && Character.isLowerCase(C)!=true){
            specialCount+=1;
        }
    }
    

    if (upCount==2 && digCount==2 && specialCount==1 && lowCount>=7 ){
        return "Password Accepted.";
    }
    else{
        message+="Password not accepted.\n";
        if (pswd.length()<12){
            message+="Your Password is shorter than 12 character.\n "; 
        }
        if (upCount<2 || upCount>2){
            message+="The Password should have exactly TWO UPPERCASE letter. Your Password has "+upCount+" uppercase letter.\n ";
        }
        if ( digCount<2 ||  digCount>2 ){
            message+="The Password should have exactly TWO DIGITS. Your Password has "+digCount+" digits.\n ";
        }
        if( specialCount<1 || specialCount>1){
            message+="The Password should have exactly ONE SPECIAL character, your Password has "+specialCount+" special chars.\n ";
        }
        
        return message;
    }

    }
}

