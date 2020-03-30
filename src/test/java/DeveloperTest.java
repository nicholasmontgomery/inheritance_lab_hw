import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Nick", 0003, 25000);
    }

    @Test
    public void hasName() {
        assertEquals("Nick", developer.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals(00003, developer.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000, developer.getSalary());
    }

}
