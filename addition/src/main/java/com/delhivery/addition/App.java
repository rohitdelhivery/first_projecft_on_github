package com.delhivery.addition;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	help ob = new help();
    	
    	ob.setA(10);
    	ob.setB(100);
    	
    	int res = ob.getA() + ob.getB();
    	System.out.println("sum of A and B  = " + res);
    	
    }
}
