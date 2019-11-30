/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jikiy
 */
public class BaseFormatter implements NumberFormatter {
    private int base;
    public BaseFormatter(int base) {
        this.base = base;
    }

    @Override
    public String format(int n) {
        //No matter the base, 0 will be 0 always.
        if (n == 0)
            return "0";
        
        String number = "";   // Initialize the string to which we will add the digits.
        int c = 0; //This variable will be the starting point for the second loop.
        for (int i = 1; i <= n; i*=this.base){
         //This loop divides the number n by all the powers of the base (i)
        if ((n/i) < this.base) {
            if ((n / i) < 10){ /* If the integer division yields a number smaller
               than 10, then it is added to the string */ 
                number = number + (n / i);
            } else {
                /*Otherwise, if the case is a number of a base larger than 10, 
                then we calculate distance from 9 and then use ASCII codes to get A,B,C, etc*/
                number = number + ((char) ((n / i - 9) + 64));
            }

            n = (n%i); //Store the remaining number and continue doing operations.
            c = i/this.base;
            break;
        }
        }  
        for (int i = c; i > 0; i /= this.base){
            if ((n/i) < 10)
                number = number + (n/i);
            else {
                number = number + ((char) ((n/i - 9) + 64));
            }
            if (n/i > 0)
                n = n%i;
        }
        return number;
    }
    
}
