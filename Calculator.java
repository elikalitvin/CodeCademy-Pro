public class Calculator {
  
  public Calculator() {
    
  }
    
    public int add(int a, int b) {
      return a + b;
    }
    
    public int subtract(int a, int b) {
      return a - b;
    }
    
    public int multiply(int a, int b) {
      return a * b;
    }
    
    public int divide(int a, int b) {
      if (b == 0) {
        System.out.println("Error! Dividing by zero is not allowed!");
      	return 0;      
      } else {
        return a / b;
      }
    }
    
    public int modulo(int a, int b) {
      if (b == 0) {
        System.out.println("Error! Dividing by zero is not allowed!");
      	return 0;
      } else {
        return a % b;
      }  
    }
    
	public static void main(String[] args) {
      Calculator myCalculator = new Calculator();
      System.out.println(myCalculator.add(5, 7));
      System.out.println(myCalculator.subtract(45, 11));
    }
  }
  
  /* Basic calculator that performs 5 operations: +, -, *, /, %. 
  Each method represents each operation and take 2 parameters (int a, int b). 
  In division and modulo, we have to be careful and write if-statement as we cannot
  divide by 0. In main, we create a new object that we are calling the methods on! */
