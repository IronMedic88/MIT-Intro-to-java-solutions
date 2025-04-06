//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(7.50, 35);
        Employee emp2 = new Employee(8.20, 47);//35
        Employee emp3 = new Employee(10.00, 73);

        emp1.getWage(emp1.basePay, emp1.hoursWorked);
        emp2.getWage(emp2.basePay, emp2.hoursWorked);
	    emp3.getWage(emp3.basePay, emp3.hoursWorked);
    }
}
