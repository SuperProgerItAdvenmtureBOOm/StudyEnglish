package WorkWithFiles;

import Tools.Offset;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Crypto {
    public static File incrypt(File defaultFile) throws IOException {
        File incryptedFile = new File("incryptedFile");
        BufferedReader br = new BufferedReader(new FileReader(defaultFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(incryptedFile));
        String str;
        //writing the first character with offset
        //33-42
        //int offset = Math.random()*9+1;
        //for test
        int offset = 5;
        boolean offsetInitFlag = true;
        //true if its the first iteration

        while((str = br.readLine())!=null) {
            char[] massivOfChars = str.toCharArray();

                int counter = 0;//in masssiv
            //if its the first symbol -> its offset
                for (char c : massivOfChars) {
                        if (c != ' ' && c != '\n')
                            massivOfChars[counter++] = Offset.offset(c, offset);
                        else counter++;
                }
                bw.write(massivOfChars);

            }
        br.close();
        bw.close();
        return incryptedFile;

    }
    public static void decrypt(){

    }



}
