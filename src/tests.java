import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tests {
    //testing class
    public static void main(String[] args) {
        System.out.println((char)((int)'h'-32));
        String strToMatch = "HUI";

        StringBuilder strB = new StringBuilder();
        for(char elem : strToMatch.toCharArray()){
            strB.append('[');
            if(elem < 90 && elem > 65) {
                strB.append(elem);
                strB.append((char)(elem + 32));
            }
            else{
                strB.append(elem);
                strB.append((char)(elem - 32));
            }
            strB.append(']');
        }
        System.out.println(strB);

        Pattern pat = Pattern.compile(String.valueOf(strB));
        System.out.println(pat.matcher("hui").matches());


    }
}
