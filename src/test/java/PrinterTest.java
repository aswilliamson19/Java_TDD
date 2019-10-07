import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(300, 5, 5);
    }

    @Test
    public void checkPaperNumber(){
        assertEquals(300, printer.getPaper());
    }

    @Test
    public void printCopies(){
        assertEquals(25, printer.copyNumber());
    }

    @Test
    public void checkPrinterHasEnoughPaper(){
        assertEquals(true, printer.paperCheck());
    }

}
