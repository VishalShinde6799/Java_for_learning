package com.zensar.math;

import java.io.IOError;
import java.io.IOException;

public class MathEngine  {


		public static int divide(int divisor) throws IOException
		{
			
			if(divisor==0)
				throw new ArithmeticException("Divide by zero error");
			if(divisor>0)
				throw new IOException("Input or output Error");
			
			int result=10/divisor;
		
			return result;
	}
}


