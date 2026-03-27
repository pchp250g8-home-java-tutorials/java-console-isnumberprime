/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.isnumberprime;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class IsNumberPrime 
{

    public static void main(String[] args) throws Exception
    {
        var nDividers = 0;
        try (var scanner = new Scanner(System.in)) 
        {
            System.out.println("Input an integer positive number");
            var ulNumber = scanner.nextLong();
            System.out.printf
            (
               "The number %d has the folowing dividers:\r\n", 
               ulNumber
            );
            for(long i = 1; i <= ulNumber; i++)
            {
                if(ulNumber % i == 0)
                {
                    System.out.printf("%d ", i);
                    nDividers++;
                }
            }
            System.out.println("");
            switch (nDividers)
                {
                    case 0:
                    case 1:
                        System.out.printf
                        (
                            "The number %d is neither composite nor prime\r\n",
                            ulNumber
                        );
                        break;
                    case 2:
                        System.out.printf("The number %d is prime\r\n",ulNumber);
                        break;
                    default:
                        System.out.printf("The number %d is composite\r\n",ulNumber);
                        break;
                }
        }
        
    }
}
