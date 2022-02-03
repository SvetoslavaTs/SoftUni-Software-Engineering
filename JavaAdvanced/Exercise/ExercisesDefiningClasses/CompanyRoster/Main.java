package ExercisesDefiningClasses.CompanyRoster;

import ExercisesDefiningClasses.CompanyRoster.Department;
import ExercisesDefiningClasses.CompanyRoster.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Department> departmentMap = new HashMap<>();

        while (n-- > 0) {
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String department = tokens[3];


            Employee employee = null;

            if (tokens.length == 6) {
                String email = tokens[4];
                int age = Integer.parseInt(tokens[5]);
                employee = new Employee(name, salary, position, department, email, age);
            } else if (tokens.length == 4) {
                employee = new Employee(name, salary, position, department);
            } else if (tokens.length == 5) {
                if (tokens[4].matches("^\\d+$")) {
                    int age = Integer.parseInt(tokens[4]);
                    employee = new Employee(name, salary, position, department, age);
                } else {
                    String email = tokens[4];
                    employee = new Employee(name, salary, position, department, email);
                }
            }
            departmentMap.putIfAbsent(department, new Department());
            departmentMap.get(department).getEmployeeList().add(employee);

        }
        double bestAVGSalary = Integer.MIN_VALUE;
        String bestDepartment = "";
        for (Map.Entry<String, Department> entry : departmentMap.entrySet()) {
            if (entry.getValue().getAvgSalary() > bestAVGSalary) {
                bestAVGSalary = entry.getValue().getAvgSalary();
                bestDepartment = entry.getKey();
            }
        }


        Department department = departmentMap.get(bestDepartment);
        System.out.println(String.format("Highest Average Salary: %s", bestDepartment));

        department.getEmployeeList().stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(System.out::println);


    }
}

