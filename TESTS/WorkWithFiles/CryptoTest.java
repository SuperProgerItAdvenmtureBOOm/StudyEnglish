package WorkWithFiles;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class CryptoTest {

    @Test
    void incryptTesting() {
        try {
            //Mjqqt rfs bfyx zu - Hello man wats up

            File expectedFile = new File("expectedFile");
            BufferedWriter bw = new BufferedWriter(new FileWriter(expectedFile));
            bw.write("mjqqt rfs bfyx zu");
            bw.close();

            File actualFile = new File("actualFile");
            BufferedWriter bw2 = new BufferedWriter(new FileWriter(actualFile));
            bw2.write("hello man wats up");
            bw2.close();


            Crypto.incrypt(actualFile);
            assertEquals(new BufferedReader(new FileReader(expectedFile)).read(),new BufferedReader(new FileReader(Crypto.incrypt(actualFile))).read());
        }catch(IOException e){
            e.printStackTrace();
        }


    }

    @Test
    void decrypt() {
    }
}