import Domain.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Enter Your Name ");
        employee.setName(input.next());
        System.out.println("Enter Your cnic ");
        employee.setCnic(input.next());
        System.out.println("Enter Your Age ");
        employee.setAge(input.nextInt());


    }
}
