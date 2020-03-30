import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Sally", 0004, 20000);
    }

    @Test
    public void hasName() {
        assertEquals("Sally", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals(00004, databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(20000, databaseAdmin.getSalary());
    }

}

