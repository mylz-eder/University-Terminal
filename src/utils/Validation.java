package utils;

import java.util.regex.Pattern;

public class Validation {
    public String nameValidator(String name) throws Exception {
        if(Pattern.matches("^[a-zA-Z\\s]{3,30}$", name)){
            return name;
        }else{
            throw new Exception("Invalid Name");
        }
    }

    public int posNumValidator(int posNum) throws Exception {
        if (posNum > 0) {
            return posNum;
        } else {
            throw new Exception("Invalid Value: This value should be a positive number! ");
        }
    }

    public int negNumValidator(int negNum) throws Exception {
        if (negNum > 0) {
            return negNum;
        } else {
            throw new Exception("Invalid Value: This value should be a negative number!");
        }
    }

}

