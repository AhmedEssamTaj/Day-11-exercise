
/*
Author: Ahmed Essam Taj
Date: 3, November
Day 11 - exercise number 2

 */

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("A*med Taj","12345",8000);
        Employee emp2 = new Employee("john doe","54321",8000);

        emp1.setName("Ahmed Taj");
        System.out.println("Annual salary for "+emp1.getName()+" is "+emp1.getAnnualSalary());

        emp2.setSalary(10000);
        emp2.raisedSalary(50);

        System.out.println("the new salary is "+ emp2.getSalary());

        System.out.println();
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());


    }
}