package com.example;
public class App 
{
    public static void main( String[] args )
    {
        boolean result = checkEvenorOdd(23);
        System.out.println(result);
    }

    public static boolean checkEvenorOdd(int num)
    {
        boolean result = num % 2 == 0?true:false;
        return result;
    }
}
