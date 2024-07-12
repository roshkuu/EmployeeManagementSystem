/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author kuros
 */
public class WithholdingTaxDeduction extends Deduction {
    @Override
    public double calculateDeduction(double grossSalary) {
        double withholdingTax = 0;
        if (grossSalary > 20833 && grossSalary <= 33333) {
            withholdingTax = (grossSalary - 20833) * 0.15;
        } else if (grossSalary >= 33333 && grossSalary <= 66667) {
            withholdingTax = 1875 + (grossSalary - 33333) * 0.20;
        } else if (grossSalary >= 66667 && grossSalary <= 166667) {
            withholdingTax = 8541 + (grossSalary - 66667) * 0.25;
        } else if (grossSalary >= 166667 && grossSalary <= 666667) {
            withholdingTax = 33541 + (grossSalary - 166667) * 0.30;
        } else if (grossSalary > 666667) {
            withholdingTax = 183541 + (grossSalary - 666667) * 0.35;
        }
        return withholdingTax;
    }
}