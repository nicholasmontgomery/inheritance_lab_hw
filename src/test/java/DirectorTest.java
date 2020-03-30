import managment.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Jane", 0006, 45000, "Sanitation", 1000000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jane", director.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals(0006, director.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(45000, director.getSalary());
    }

    @Test
    public void hasDepName() {
        assertEquals("Sanitation", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1.1);
        assertEquals(49500, director.getSalary());
    }

    @Test
    public void canReturnBonus() {
        assertEquals(900, director.payBonus());
    }

    @Test
    public void canGetBudget() {
        assertEquals(1000000.00, director.getBudget(), 10);
    }

    @Test
    public void setName() {
        director.setName("Janet");
        assertEquals("Janet", director.getName());
    }
}
