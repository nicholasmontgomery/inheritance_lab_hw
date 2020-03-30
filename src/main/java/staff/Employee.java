package staff;

public abstract class Employee {

    private String name;
    private int NINumber;
    protected int salary;

    public Employee(String name, int NINumber, int salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

   public String getName() {
        return name;
   }

   public void setName(String name) {
        this.name = name;
   }

   public int getNINumber() {
        return NINumber;
   }

   public int getSalary() {
        return salary;
   }

   public void raiseSalary(Double raisePercent) {
        if (raisePercent >= 0) {
            this.salary *= raisePercent;}
        }


   public int payBonus() {
        return (int) (this.salary * 0.01);
   }

}
