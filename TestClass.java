/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.Math;

/**
 *
 * @author Jikiy
 */
public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalSeparatorFormatter formatter = new DecimalSeparatorFormatter();
        BaseFormatter baseformatter = new BaseFormatter(2);
        AccountingFormatter accformatter = new AccountingFormatter();

        System.out.println("DECIMAL FORMATTER STARTS HERE");

        for (double i = 0; i < 10; i++) {
            System.out.println(formatter.format((int) Math.pow(10.00, i)));
        }

        System.out.println("ACCOUNTING FORMATTER STARTS HERE");

        System.out.println(accformatter.format(-23));
        System.out.println(accformatter.format(23));

        System.out.println("BASE FORMATTER STARTS HERE");

        for (int x = 2; x < 32; x++) {
            baseformatter = new BaseFormatter(x);
            System.out.println("**********BASE: " + x + "*********");
            for (int i = 0; i < 25; i++) {
                System.out.println("Decimal: " + i);
                System.out.println("Base: " + x + ", "+ baseformatter.format(i));
            }
        }

        baseformatter = new BaseFormatter(16);

    }

}
