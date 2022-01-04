package com.mars.returnship;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class MyException extends Exception
{
 public MyException(String str)
 {
  System.out.println(str);
 }
}
 
public class Positiveornegativenumbers {
 
 public static void main(String[] args)throws IOException {
  //BufferedReader class to read data from keyboard.
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Input number : ");
  
  try {
	  // this method is used to read a string from keyboard 
	  //parseInt( ) method converts String object into integer number.
	  //parseInt( ) is the method of Integer wrapper class.
   int num = Integer.parseInt(br.readLine());
   if(num < 0)
    throw new MyException("Number is negative");
   else
    throw new MyException("Number is positive");
  }
  catch (MyException m) {
   System.out.println(m);
  }
 }
 
}