/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canteen_employees;

/**
 *
 * @author G-Dragon M-TP
 */
public class Employee {
    private String employeeID, employeeName, employeeSex, employeeDOB, employeePhone, employeeAddress, employeeUsername;

    public Employee(String employeeID, String employeeName, String employeeSex, String employeeDOB, String employeePhone, String employeeAddress, String employeeUsername) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeSex = employeeSex;
        this.employeeDOB = employeeDOB;
        this.employeePhone = employeePhone;
        this.employeeAddress = employeeAddress;
        this.employeeUsername = employeeUsername;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(String employeeSex) {
        this.employeeSex = employeeSex;
    }

    public String getEmployeeDOB() {
        return employeeDOB;
    }

    public void setEmployeeDOB(String employeeDOB) {
        this.employeeDOB = employeeDOB;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeUsername() {
        return employeeUsername;
    }

    public void setEmployeeUsername(String employeeUsername) {
        this.employeeUsername = employeeUsername;
    }

    
}
