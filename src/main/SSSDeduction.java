/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author kuros
 */
public class SSSDeduction extends Deduction {

        /**
     * Calculates the SSS deduction amount based on the specified gross salary.
     * @param grossSalary The gross salary of the employee.
     * @return The SSS deduction amount.
     */
    @Override
    public double calculateDeduction(double grossSalary) {
        double sssDeduction = 0;
        if (grossSalary < 3250) {
            sssDeduction = 135;
        } else if (grossSalary >= 3250 && grossSalary <= 7750) {
            sssDeduction = 45 * Math.ceil((grossSalary - 3250) / 500);
        } else if (grossSalary > 7750) {
            sssDeduction = 945;
        }
        return sssDeduction;
    }
}
