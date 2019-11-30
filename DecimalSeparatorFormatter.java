/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jikiy
 */
public class DecimalSeparatorFormatter implements NumberFormatter {

    @Override
    public String format(int n) {
        
        Integer number = new Integer(n);
        String numberString = number.toString();
        
        /*Predict the size of the array based on how big the number is. 
        Add free spaces in the array for the commas that will be added.
        Integer division by three will yield the number of commas.*/
        char[] numberArray = new char[numberString.length() +((numberString.length() -1)/3)];
   
        /*This counter keeps track of how many numbers you've and then resets
        every time you add a comma*/
        int counter = 0;        
        int stringArrayIndex = numberString.length() - 1;
        
        for (int i = numberArray.length - 1; i >= 0; i--){
         
            if (counter != 3) {
                numberArray[i] = numberString.charAt(stringArrayIndex--);
                counter++;
            } else {
                numberArray[i] = ',';
                counter = 0;
            }
        }
                                 
        return new String(numberArray);
    }
    
}
