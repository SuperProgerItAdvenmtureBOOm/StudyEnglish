package Tools;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OffsetTest {

    @Test
    void moveLineTesting() {
        String actual = Offset.moveLine("hello",3);
        assertEquals("khoor",actual);
        actual = Offset.moveLine("ziu",5);
        assertEquals("enz",actual);
    }

    @Test
    void offsetTesing() {

        char actual = Offset.offset('z',3);
        assertEquals('c',actual);
        actual = Offset.offset('о',3);
        assertEquals('с',actual);


    }
}