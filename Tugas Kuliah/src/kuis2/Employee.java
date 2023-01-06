/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author Illuminare
 */
public class Employee {

    protected String firstName, lastName, noKTP;
    protected double penghasilan;

    public Employee(String firstName, String lastName, String noKTP) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.noKTP = noKTP;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public void setPenghasilan(double penghasilan) {
        this.penghasilan = penghasilan;
    }

    @Override
    public String toString() {
        return "Employee { " + "firstName = " + firstName + ", lastName = " + lastName + ", noKTP = " + noKTP + '}';
    }

    public void hitungPenghasilan() {
    }

}
