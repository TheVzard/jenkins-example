package com.sapient;

public class mathservice {
	
	  public int fib(int n){ 
	    int f[] = new int[n+2]; 
	    int i; 
	    if(n<0) {
	    	return -1;
	    }
	    f[0] = 0; 
	    f[1] = 1; 
	      
	    for (i = 2; i <= n; i++) 
	    { 
	        f[i] = f[i-1] + f[i-2]; 
	    } 
	       
	    return f[n]; 
	  } 
	       
	  public int factorial(int n){ 
	        int res = 1, i; 
	        if(n<0)
	        	return -1;
	        for (i=2; i<=n; i++) 
	            res *= i; 
	        return res; 
	  }
	  
	  public int isPrime(int n) {
		  if(n<0)
			  return -1;
		  int flag = 1;
		  for(int i =2;i<=n/2;++i)
		  {
			  
			  if(n%i==0)
			  {
				  flag=0;
				  break;
			  }
		  }
		  
		  return flag;
	  }
	  
	  public int[] TwoPrime(int a, int b) {
		  
		  int flag,i,j,temp;
		  if(a<0 && b>0)
		  {
			  a=1;
		  }
		  if(b<0 && a>0)
		  {
			  b=1;
		  }
		  
		  if(a>b)
		  {
			  temp=b;
			  b=a;
			  a=temp;
		  }
		  
		  if(a<0 && b<0) {
			  return new int[] {-1};
		  }
		  int ele=0;
		  for (i = a; i <= b; i++) { 
			   
	            if (i == 1 || i == 0) 
	                continue;
	  
	             
	            if (1 == isPrime(i)) {
	            	ele++;
	        } 
	    }
		  int[] arr = new int[ele];
		  ele=0;

		  for (i = a; i <= b; i++) { 
			   
	            if (i == 1 || i == 0) 
	                continue;
	  
	             
	            if (1 == isPrime(i)) {
	                arr[ele]=i;
	            	ele++;
	        } 
	    } 
		  
		  return arr;
	  }
	  
	  
	  
}
