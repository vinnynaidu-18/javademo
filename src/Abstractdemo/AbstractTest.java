package Abstractdemo;

public class AbstractTest {
    public static void main(String[] args) {

        HourlyEmployee hourlyEmployee=new HourlyEmployee("1234","Chandhu",
                1000,10);
        System.out.println(hourlyEmployee.displayEmployeeDetails("1234","Chandhu"));
        System.out.println("Salary is " + hourlyEmployee.calculateSalary());


        SalariedEmployee salariedEmployee=new SalariedEmployee("5678","Vinny",
                25000);
        System.out.println(salariedEmployee.displayEmployeeDetails("5678","Vinyy"));
        System.out.println("Salary is " + salariedEmployee.calculateSalary());


        ContractEmployee contractEmployee=new ContractEmployee("1638","Vicky",
                3,1500,15);
        System.out.println(contractEmployee.displayEmployeeDetails("1638","Vicky"));

        System.out.println("Salary is " + contractEmployee.calculateSalary());
    }
}

