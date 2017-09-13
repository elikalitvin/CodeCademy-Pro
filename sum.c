/* Program for adding two integers given by the user. */
#include <stdio.h>

int main()
{
  /* Declaring variables and their type */
  int integer1; /* First integer the user is going to type */
  int integer2; /* Second integer the user is going to type */
  int sum; /* Sum of integers */
  
  printf("Enter first integer, please: \n");
  scanf("%d", &integer1); /*  read the integer that will be assigned to integer1 */
  
  printf("Enter second integer, please: \n");
  scanf("%d", &integer2);
  
  sum = integer1 + integer2;
  printf("The sum of two integers is: %d \n", sum);
  
  
  return 0;
  
}
