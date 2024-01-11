package RunningClasses;

import WorkWithFiles.Crypto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tests {
    //testing class
    public static void main(String[] args) throws IOException {
//        System.out.println((char)((int)'h'-32));
//        String strToMatch = "HUI";
//
//        StringBuilder strB = new StringBuilder();
//        for(char elem : strToMatch.toCharArray()){
//            strB.append('[');
//            if(elem < 90 && elem > 65) {
//                strB.append(elem);
//                strB.append((char)(elem + 32));
//            }
//            else{
//                strB.append(elem);
//                strB.append((char)(elem - 32));
//            }
//            strB.append(']');
//        }
//        System.out.println(strB);
//
//        Pattern pat = Pattern.compile(String.valueOf(strB));
//        System.out.println(pat.matcher("hui").matches());
        File myFile = new File("defaultFile");
        //myFile.deleteOnExit();
        BufferedWriter bw = new BufferedWriter(new FileWriter(myFile));
        bw.write("ну и хуесосина\n ебать");

        bw.close();
        Crypto.incrypt(myFile);
        myFile.delete();



    }
}
