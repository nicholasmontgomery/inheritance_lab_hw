package managment;

public class Director extends Manager {

    private Double budget;

    public Director(String name, int NINumber, int salary, String deptName, Double budget) {
        super(name, NINumber, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    public int payBonus() {
        return (int) (this.salary * 0.02);
    }
}
