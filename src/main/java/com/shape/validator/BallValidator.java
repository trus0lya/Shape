package com.shape.validator;

public class BallValidator {
    public static boolean isRadiusValid(String str) {
        return Double.parseDouble(str.substring(str.lastIndexOf(' ')+1)) > 0;
    }
    public static boolean isNumeric(String str){
        return str.matches("[(0.0-9' '-]+");
    }
    public static boolean isEnoughData(String str){
        return str.split(" ").length == 4;
    }

    public static boolean isValidString(String str) {
        return isNumeric(str) && isEnoughData(str) && isRadiusValid(str);
    }
}
