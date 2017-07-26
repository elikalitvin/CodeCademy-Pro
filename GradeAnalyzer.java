import java.util.ArrayList;

public class GradeAnalyzer {
  
  public GradeAnalyzer() {
    
  } 
  
  public int getAverage(ArrayList<Integer> grades){
    if (grades.size() < 1) {
      System.out.println("Error! The ArrayList is empty!");
      return 0;
    } else {
      int sum = 0;
      for (Integer grade : grades) {
        sum = sum + grade;
      }
      
      int average = sum / grades.size();
      System.out.println("The average grade is: " + average);
      return average;
    }
  }

  
  public static void main(String[] args){
    ArrayList<Integer> myClassroom = new ArrayList<Integer>();
    myClassroom.add(98);
    myClassroom.add(92);
    myClassroom.add(88);
    myClassroom.add(75);
    myClassroom.add(61);
    myClassroom.add(89);
    myClassroom.add(95);
    
    GradeAnalyzer myAnalyzer = new GradeAnalyzer();
    myAnalyzer.getAverage(myClassroom);
   
  }
}
/* Has for each interation.
We wrote a method to count the average grade. Then in main, we created an ArrayList to store integers
that represent grades. Then, we created a new CLASS OBJECT myAnalyzer, and called a method on it with a 
parameter myClassroom that was our ArrayList with scores (method is called on object but it deals with the
ArrayList) */
