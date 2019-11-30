/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jikiy
 */
public class AccountingFormatter implements NumberFormatter {

    @Override
    public String format(int n) {
        Integer number = new Integer(n);
        String numberString = number.toString();
        
        //If the number is negative, replace first & last position with partenthesis.
        if(numberString.startsWith("-")){
            numberString = numberString.replace("-", "(");
            numberString = numberString.concat(")");
            return numberString.toString();
        }
        else
            return numberString.toString();
    }

    
    
}
