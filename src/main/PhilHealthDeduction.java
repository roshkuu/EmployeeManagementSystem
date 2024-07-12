/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author kuros
 */
public class PhilHealthDeduction extends Deduction {
        /**
     * Calculates the PhilHealth deduction amount based on the specified gross salary.
     * @param grossSalary The gross salary of the employee.
     * @return The PhilHealth deduction amount.
     */
    @Override
    public double calculateDeduction(double grossSalary) {
        // Calculation logic for PhilHealth deduction
        double philHealthDeduction = 0;
        if (grossSalary <= 10000) {
            philHealthDeduction = 150;
        } else if (grossSalary > 10000 && grossSalary < 60000) {
            philHealthDeduction = grossSalary * 0.03 / 2;
        } else if (grossSalary >= 60000) {
            philHealthDeduction = 900 / 2;
        }
        return philHealthDeduction;
    }
}