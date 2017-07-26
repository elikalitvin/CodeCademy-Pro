public class Magic {
	public static void main(String[] args) {
		
    int myNumber = 13;
    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
		int stepSix = stepFive / 6;
    System.out.println(stepSix);
	}
}

 /* This program takes any original number, and performs a sequence of different arithmetic 
    operations, and results in the number 3 being printed out in the console. */
