public class Main {
    public static void main(String[] args) {
        // Code to be executed when the program is run
        Employee e1= new Employee("Govind", 150000.0,2500.0,5062023);
        Engineer e11=new Engineer("Amit",100000.0,1500.0,18072023,2343.09);
        e1.displayTotalSalary();
        e1.displayEmployeeRole();
        e11.displayTotalSalary();
        e11.displayEmployeeRole();
        e1.displayDetails();
        e11.displayDetails();
    }


}
