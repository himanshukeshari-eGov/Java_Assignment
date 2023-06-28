public class Employee {

    protected   String name;
    protected double baseSalary;
    protected double gratuity;
    private long joiningDate;

    public Employee(String name, double baseSalary, double gratuity, long joiningDate) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.gratuity = gratuity;
        this.joiningDate = joiningDate;
    }
    public void displayTotalSalary(){
  System.out.println("Total salary is :" + (baseSalary+gratuity)+ " per month");
    }
    public  void displayEmployeeRole(){
        System.out.println("I am an instance of the type employee, I can do anything!");
    }
    public void displayDetails(){
        System.out.println("My name is "+name+" and my base salary is "+ baseSalary);
    }
}
