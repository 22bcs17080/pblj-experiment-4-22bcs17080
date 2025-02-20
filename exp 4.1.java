//Aim: To develop a Java program to implement an ArrayList that stores employee details (ID, Name, and Salary). Allow users to add, update, remove, and search employees.

import java.util.ArrayList;
import java.util.Scanner;
// Employee class to store details
class Employee {
int id;
String name;
double salary;
// Constructor
public Employee(int id, String name, double salary) {
this.id = id;
this.name = name;
this.salary = salary;
}
// Display Employee details
@Override
public String toString() {
return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
}
}
public class EmployeeManagementSystem {
static ArrayList<Employee> employees = new ArrayList<>();
static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
while (true) {
System.out.println("\n--- Employee Management System ---");
System.out.println("1. Add Employee");
System.out.println("2. Update Employee");
System.out.println("3. Remove Employee");
System.out.println("4. Search Employee");
System.out.println("5. Display All Employees");
System.out.println("6. Exit");
System.out.print("Choose an option: ");
int choice = scanner.nextInt();
scanner.nextLine(); // Consume newline
switch (choice) {
case 1:
addEmployee();
break;
case 2:
updateEmployee();
break;
case 3:
removeEmployee();
break;
case 4:
searchEmployee();
break;
case 5:
displayAllEmployees();
break;
case 6:
System.out.println("Exiting Employee Management System.");
scanner.close();
return;
default:
System.out.println("Invalid choice! Please try again.");
}
}
}
// Add Employee
public static void addEmployee() {
System.out.print("Enter Employee ID: ");
int id = scanner.nextInt();
scanner.nextLine(); // Consume newline
System.out.print("Enter Employee Name: ");
String name = scanner.nextLine();
System.out.print("Enter Employee Salary: ");
double salary = scanner.nextDouble();
employees.add(new Employee(id, name, salary));
System.out.println("Employee added successfully!");
}
// Update Employee
public static void updateEmployee() {
System.out.print("Enter Employee ID to update: ");
int id = scanner.nextInt();
scanner.nextLine(); // Consume newline
for (Employee emp : employees) {
if (emp.id == id) {
System.out.print("Enter New Name: ");
emp.name = scanner.nextLine();
System.out.print("Enter New Salary: ");
emp.salary = scanner.nextDouble();
System.out.println("Employee details updated successfully!");
return;
}
}
System.out.println("Employee not found!");
}
// Remove Employee
public static void removeEmployee() {
System.out.print("Enter Employee ID to remove: ");
int id = scanner.nextInt();
for (Employee emp : employees) {
if (emp.id == id) {
employees.remove(emp);
System.out.println("Employee removed successfully!");
return;
}
}
System.out.println("Employee not found!");
}
// Search Employee
public static void searchEmployee() {
System.out.print("Enter Employee ID to search: ");
int id = scanner.nextInt();
for (Employee emp : employees) {
if (emp.id == id) {
System.out.println("Employee Found: " + emp);
return;
}
}
System.out.println("Employee not found!");
}
// Display All Employees
public static void displayAllEmployees() {
if (employees.isEmpty()) {
System.out.println("No employees found!");
} else {
System.out.println("\nEmployee List:");
for (Employee emp : employees) {
System.out.println(emp);
}
}
}
}
