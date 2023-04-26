import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    private Customer cust1 = new Customer("first","last","N/A","N/A","N/A",18);

    @Test
    void getCustomerInfo() {
        assertEquals("first",cust1.getFirstName());
    }

    @Test
    void checkContent() {
        assertFalse(cust1.check());
    }

    @Test
    void getContent() {
        assertEquals("",cust1.getContent());
    }

    @Test
    void getAge() {
    }

    @Test
    void getFirstName() {
    }

    @Test
    void getLastName() {
    }
}