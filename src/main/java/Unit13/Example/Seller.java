package Unit13.Example;

public class Seller extends Employee{
    private double revenue;

    public Seller() {
    }

    public Seller(String name, double revenue, double salary) {
        super(name, salary);
        this.revenue = revenue;
    }


    public double getSalary() {
        if (revenue < 4000){
            super.setSalary(super.getSalary() + (0.05*revenue));
        } else {
            super.setSalary(super.getSalary() + (0.1 * revenue));
        }
        return super.getSalary();
    }
}
