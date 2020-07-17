 class recursion {
    int first = 0;
    int second = 1;
    int sum = 0;
    public int get_fib(int value){
        if(value == 0)
          return sum;
        if(value == 1)
          return sum;
        sum = first+second;
        first = second;
        second = sum;
        return  get_fib(value-1);
    }

}
