public class Employee {
    private String name;
    private String id;
    private int salary;

    public Employee(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }
    public int raisedSalary(int percent) {
        double percentage = percent / 100.0;
        System.out.println("Employee "+this.getName()+" salary has been raised by " + percent + "%");
        this.salary = (int)(this.salary + (percentage*this.salary));
        return  this.salary;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                '}';
    }
}
