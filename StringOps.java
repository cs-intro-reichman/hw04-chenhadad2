import java.util.Arrays;

public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String str = "hfaih";
        int [] array = {0,1,3};
        System.out.println(camelCase(str));
       
       
        System.out.println(Arrays.toString(allIndexOf("hello", 'h')));   
        
        
    }
    public static String lowerCase(String s) { // function that returns the lower case version of the input string
        String newStr = ""; // init a new str
        for(int i=0; i<s.length();i++) { // runs on all chars of the string
            if ((s.charAt(i) >= 65) && (s.charAt(i) <= 90)) { // checks if char is UPPERCASE letter
                // TODO: you can work with chars in Java like with integers:
                //    char newChar = s.charAt(i);
                //    newChar = newChar +32;
                //  OR just
                //    char newChar = s.charAt(i) + 32;
                
                int temp = s.charAt(i) + 32; // checks lowercase ASCII code
                newStr += (char) temp; // writes lowercase letter instead
            } else newStr += s.charAt(i);
        }
        return newStr;
    }

    public static String capVowelsLowRest (String string) {
        String Str = lowerCase(string);
       String newStr = ""; // TODO: broken indentations!

        for (int i = 0; i < string.length(); i++ ) {
            char newChar = Str.charAt(i);
            if ((Str.charAt(i) == 'e') || (Str.charAt(i) == 'a') || (Str.charAt(i) == 'i') || (Str.charAt(i) == 'u') || (Str.charAt(i) == 'o') ) {
                newChar = (char) (Str.charAt(i) - 32);
                
            }
              
                        newStr = newStr+ newChar;  // TODO: broken indentations! and no space before '+'

            }
        
        return newStr;  // TODO: broken indentations!
        }

    public static String camelCase (String string) {
        String str = "";
        String low = "";

      for (int i = 0; i < string.length(); i++) {
        char var2 = string.charAt(i);
        if (string.charAt(i)>= 'A' && string.charAt(i) <= 'Z') {
            var2 = (char) (string.charAt(i) + 32);
        }
        low = low +var2;
        
        }
        for (int j = 0; j < low.length(); j++) {
            char mid = low.charAt(j);
            if (mid == 32) {
                while (mid == 32) {
                    if (j == low.length() - 1) {
                        break;
                    }
                    mid = low.charAt(j + 1);
                    j++;
                }
                if (low.charAt(0) != 32 || str != "") 
                mid = (char) (low.charAt(j) - 32);
            }
            str = str + mid;

        }

      
      
        return str;
    }
    

    public static int[] allIndexOf (String string, char chr) {
        
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char var2 = string.charAt(i);
            if (var2 == chr) {
                count++;       
        }
    } // TODO: proper indentations are very important for the code readability!
        int [] index = new int[count];
        int x = 0;
        for (int j = 0; j < string.length(); j++ ) {
            char var3 = string.charAt(j);
            if (var3 == chr) {
                index [x] = j;
                x++;
              
            }
            }
            
    
    return index;
}
}



