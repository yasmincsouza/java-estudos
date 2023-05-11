package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramTwo {
    public static void main(String[] args){
        List<Employee> list = new ArrayList<>();
        String path = "C:\\Users\\922017\\Desktop\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");// recorta o string em dois 'name' e 'salary'.
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }

            Collections.sort(list);
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
    }
}
