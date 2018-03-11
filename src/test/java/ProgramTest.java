import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgramTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final String lineSeperator = System.lineSeparator();    //To detect the newline from whatever system used.

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(System.out);
        System.setErr(System.err);
    }

    @Test
    public void TestMainProgramOutput()
    {
        Program.main(null);
        String finalValue = "moo"  + lineSeperator;
        finalValue += "1" + lineSeperator;
        finalValue += "2" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "4" + lineSeperator;
        finalValue += "wouf" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "7" + lineSeperator;
        finalValue += "8" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "wouf" + lineSeperator;
        finalValue += "11" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "13" + lineSeperator;
        finalValue += "14" + lineSeperator;
        finalValue += "moo" + lineSeperator;
        finalValue += "16" + lineSeperator;
        finalValue += "17" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "19" + lineSeperator;
        finalValue += "wouf" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "22" + lineSeperator;
        finalValue += "23" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "wouf" + lineSeperator;
        finalValue += "26" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "28" + lineSeperator;
        finalValue += "29" + lineSeperator;
        finalValue += "moo" + lineSeperator;
        finalValue += "31" + lineSeperator;
        finalValue += "32" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "34" + lineSeperator;
        finalValue += "wouf" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "37" + lineSeperator;
        finalValue += "38" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "wouf" + lineSeperator;
        finalValue += "41" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "43" + lineSeperator;
        finalValue += "44" + lineSeperator;
        finalValue += "moo" + lineSeperator;
        finalValue += "46" + lineSeperator;
        finalValue += "47" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "49" + lineSeperator;
        finalValue += "wouf" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "52" + lineSeperator;
        finalValue += "53" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "wouf" + lineSeperator;
        finalValue += "56" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "58" + lineSeperator;
        finalValue += "59" + lineSeperator;
        finalValue += "moo" + lineSeperator;
        finalValue += "61" + lineSeperator;
        finalValue += "62" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "64" + lineSeperator;
        finalValue += "wouf" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "67" + lineSeperator;
        finalValue += "68" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "wouf" + lineSeperator;
        finalValue += "71" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "73" + lineSeperator;
        finalValue += "74" + lineSeperator;
        finalValue += "moo" + lineSeperator;
        finalValue += "76" + lineSeperator;
        finalValue += "77" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "79" + lineSeperator;
        finalValue += "wouf" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "82" + lineSeperator;
        finalValue += "83" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "wouf" + lineSeperator;
        finalValue += "86" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "88" + lineSeperator;
        finalValue += "89" + lineSeperator;
        finalValue += "moo" + lineSeperator;
        finalValue += "91" + lineSeperator;
        finalValue += "92" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "94" + lineSeperator;
        finalValue += "wouf" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "97" + lineSeperator;
        finalValue += "98" + lineSeperator;
        finalValue += "meow" + lineSeperator;
        finalValue += "wouf" + lineSeperator;

        assertEquals(finalValue, outContent.toString());
    }
}
