package com.kylestankovich.handson0;

public class HandsOn {

	public static void main(String[] args) {
        Employee employee = new Employee("Bob", "Smith", "ACME", 5);
        Manager manager = new Manager("Sally", "Jones", "ACME", 12, "IT Director");
        Engineer engineer = new Engineer("Rupert", "Brown", "ACME", 7, "Sr. Developer");

    System.out.println(employee.toString());
    System.out.println(manager.toString());
    System.out.println(engineer.toString());
}

}
