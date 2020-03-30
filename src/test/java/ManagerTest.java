import managment.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Bob", 00002, 30000, "Sanitation");
    }

    @Test
    public void hasName() {
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals(00002, manager.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000, manager.getSalary());
    }

    @Test
    public void hasDepName() {
        assertEquals("Sanitation", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(-1.5);
        assertEquals(33000, manager.getSalary());
    }

    @Test
    public void canReturnBonus() {
        assertEquals(300, manager.payBonus());
    }
}
