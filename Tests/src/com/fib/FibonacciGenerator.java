package com.fib;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class FibonacciGenerator {
    private static long prev=0; 
    
    // A tail recursive function to 
    // calculate n-th Fibonacci number 
    static int fibTail(int n, int a, int b ) 
    {  
        return n==0 ? a : n==1 ? b : fibTail(n - 1, b, a + b); 
    } 
    
    static long fib(long n) 
    {  
    	return n < 2 ? n : fib(n - 1)  + fib(n-2); 
    } 

    public static void printSequence(int elements) {

        LongStream.iterate(1, n -> {n+=prev; prev=n-prev; return n;}).           
        limit(elements).forEach(System.out::println);
    }
    
    public static long printReduce(int n) {
    	
    	return 
    	Stream.iterate(new long[] {1, 1}, f -> new long[] {f[1], f[0] + f[1]})
        	  .limit(n)
        	  .reduce((a, b) -> b)
        	  .get()[0];
    }
    
	public static void main(String[] args) {
		printSequence(7);
		System.out.println(printReduce(7));
		System.out.println(fibTail(7,0,1));
		System.out.println(fib(7));
	}
}
