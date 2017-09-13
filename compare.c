/* Program for comparing two integers. */
#include <stdio.h>

int main() 
{
  int num1;
  int num2;
  
  printf("Please enter two integers: \n ");
  scanf("%d%d", &num1, &num2);
  
  
  /* IF clause conditions that compare two integers */
  if (num1 == num2) { /* if numbers are equal */
    printf("%d is equal to %d.\n", num1, num2);
  }
 
 if (num1 != num2) {
   printf("%d is not equal to %d.\n", num1, num2);
 } 
 
 if (num1 < num2) {
   printf("%d is less than %d.\n", num1, num2);
 }
 
 if (num1 > num2) {
   printf("%d is greater than %d.\n", num1, num2);
 }
 
 if (num1 <= num2) {
   printf("%d is less or equal to %d.\n", num1, num2);
 }
 
 if (num1 >= num2) {
   printf("%d is greater or equal to %d.\n", num1, num2);
 }
 
 return 0; 
}
