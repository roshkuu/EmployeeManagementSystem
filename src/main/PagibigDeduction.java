/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author kuros
 */
public class PagibigDeduction extends Deduction {
    /**
     * Calculates the Pag-IBIG deduction amount based on the specified gross salary.
     * @param grossSalary The gross salary of the employee.
     * @return The Pag-IBIG deduction amount.
     */
    @Override
    public double calculateDeduction(double grossSalary) {
        // Calculation logic for Pag-IBIG deduction
        double pagibigDeduction = 0;
        if (grossSalary >= 1000 && grossSalary <= 1500) {
            pagibigDeduction = grossSalary * 0.01;
        } else if (grossSalary > 1500) {
            pagibigDeduction = grossSalary * 0.02;
        }
        return pagibigDeduction;
    }
}
