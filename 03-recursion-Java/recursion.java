class recursion {
	public int get_fib(int value){
		if(value == 0)
		  return 0;
		if(value == 1)
		  return 1;
	    return get_fib(value)*get_fib(value-1) ; 
	}
}