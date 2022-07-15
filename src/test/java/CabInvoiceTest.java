import com.bridgelabz.InvoiceGenerator;
import com.bridgelabz.Rides;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CabInvoiceTest {
    InvoiceGenerator invoice = new InvoiceGenerator();


    /**
     * Check fare as: 4*10+4 = 44
     */
    @Test
    public void testGenerateInvoice() {

        Assertions Assert = null;
        Assert.assertEquals(44, invoice.generateInvoice(new Rides(4, 4)), 0.0);
    }

    /**
     * Fare = 0.2*10+1 = 3 which is less than 5.
     * Should give fare = 5
     */
    @Test
    public void testGenerateInvoice_getMin() {

        Assertions Assert = null;
        Assert.assertEquals(5, invoice.generateInvoice(new Rides(0.2, 1)), 0.0);
    }
}
