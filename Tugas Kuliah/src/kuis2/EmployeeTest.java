/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

import java.util.ArrayList;

/**
 *
 * @author Illuminare
 */
public class EmployeeTest {

    private ArrayList<Employee> employee = new ArrayList<>();

    public void operasi() {
        System.out.println("Hourly Employee 1");
        Employee emp1 = new HourlyEmployee("Agus", "Hariyanto", "12345");
        System.out.println("Salaried Employee 1");
        Employee emp2 = new SalariedEmployee("Bambang", "Tembong", "12456");
        System.out.println("Commision Employee 1");
        Employee emp3 = new CommisionEmployee("Alan", "Surya", "34867");
        employee.add(emp1);
        employee.add(emp2);
        employee.add(emp3);
    }

    public void tampilkan() {
        for (int i = 0; i < employee.size(); i++) {
            if (employee.get(i) instanceof HourlyEmployee) {
                System.out.println(employee.get(i).toString());
                ((HourlyEmployee) employee.get(i)).hitungPenghasilan();
                ((HourlyEmployee) employee.get(i)).getPaymentAmount();
            } else if (employee.get(i) instanceof SalariedEmployee) {
                System.out.println(employee.get(i).toString());
                ((SalariedEmployee) employee.get(i)).hitungPenghasilan();
                ((SalariedEmployee) employee.get(i)).getPaymentAmount();
            } else {
                System.out.println(employee.get(i).toString());
                ((CommisionEmployee) employee.get(i)).hitungPenghasilan();
                ((CommisionEmployee) employee.get(i)).getPaymentAmount();
            }
        }
    }

}
