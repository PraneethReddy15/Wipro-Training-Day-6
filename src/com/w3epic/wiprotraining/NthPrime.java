package com.w3epic.wiprotraining;

public class NthPrime {
	public int getNthPrime(int input1) {
	int[] arr = new int[1000];//store 1000 elemnts
    int count = 0;
    int number = 1;
    
    // Iterate 1000
    while (count < 1000) {
        if (isPrime(number)) {
            arr[count] = number;
            count++;
        }
        number++;
    }
    
    // Return index-1
    return arr[input1 - 1];
}
	public boolean isPrime(int n) 
	{
	    if (n <= 1) 
	    {
	        return false;
	    }
	    for (int i = 2; i*i <= n; i++) 
	    {
	        if (n % i == 0) 
		{
	            return false;
	        }
	    }
	    return true;
	}

}
