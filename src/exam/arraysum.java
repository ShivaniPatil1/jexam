/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author kareena
 */

public class arraysum
{
    public static void main(String[]args)
    {
        int my_array[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for (int i:my_array )
            sum +=i;
          System.out.println("sum is"+sum);
        
       
    }
    
}
