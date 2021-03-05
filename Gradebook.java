import java.util.Scanner;
import java.text.DecimalFormat;
//Jordan Mozebo
//Comp163-005
//A program that calculate the total grade of a student based
//on the user input
class Gradebook {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat j = new DecimalFormat("#.##");
    String firstName;  
    String lastName;
    String participation;
    double project1;
    double project2;
    double mid1;
    double mid2;
    double mid3;
    double fin;
    double partiScore;
    double projectScore;
    double midScore;
    double totalScore; 

    System.out.println("Welcome to the interactive gradebook. what is the student name?");
    firstName = sc.next();
    lastName = sc.next();

    /*ask the user for participation credit*/
    System.out.println("Did the student received participation credit?");
    participation = sc.next();

    /*ask the user for the grade the student had in each projects*/
    System.out.println("Enter the grade for the first project.");
    project1 = sc.nextDouble();

    System.out.println("Enter the grade for the second project.");
    project2 = sc.nextDouble();

    /*ask the user to enter grades of each midterm the student had taken*/ 
    System.out.println("Enter the grade for the first midterm.");
    mid1 = sc.nextDouble();

    System.out.println("Enter the grade for the second midterm.");
    mid2 = sc.nextDouble();

    System.out.println("Enter the grade for the third midterm.");
    mid3 = sc.nextDouble();

    /*ask the user to enter the grade for the final exam*/
    System.out.println("Enter the grade for the final exam.");
    fin = sc.nextDouble();

    System.out.println("* * * * *");

    System.out.println("Here is the grade summary for "+firstName+" "+lastName+".");

    if (participation.equals("yes")) {
      partiScore = 100;
    }

    else {
      partiScore = 0;
    }
    System.out.println("Participation Score: "+j.format(partiScore));

    /*Calculate the total score of all projects*/
    projectScore = ((project1 + project2) / 2);

    System.out.println("Project Score: "+j.format(projectScore));

    /*determine which midterm grade need to replaced*/

    if (mid1 < 70 && mid1 <= mid2 && mid1 <= mid3 && fin > mid1) {
      mid1 = fin;
      midScore = ((mid1 + mid2 + mid3) / 3);

      System.out.println("Midterm Score: "+j.format(midScore));
      System.out.println("A midterm grade was replaced by the final exam grade.");
    }

    else if (mid2 < 70 && mid2 <= mid1 && mid2 <= mid3 && fin > mid2) {
      mid2 = fin;
      midScore = ((mid1 + mid2 + mid3) / 3);
      System.out.println("Midterm Score: "+j.format(midScore));
      System.out.println("A midterm grade was replaced by the final exam grade.");
    }

    else if (mid3 < 70 && mid3 <= mid1 && mid3 <= mid2 && fin > mid3) {
      mid3 = fin;
      midScore = ((mid1 + mid2 + mid3) / 3);
      System.out.println("Midterm Score: "+j.format(midScore));
      System.out.println("A midterm grade was replaced by the final exam grade");
    }

    else {
      midScore = ((mid1 + mid2 + mid3) / 3);
      System.out.println("Midterm Score: "+j.format(midScore));
    }

    /* print the grade of the final*/
    System.out.println("Final Exam Score: "+j.format(fin));

    /*Calculate the total grade of the student*/
    totalScore =  (double) ((0.1 * partiScore) + (0.35 * projectScore) + (0.3 * midScore) + (0.25 * fin));



    System.out.println("Total Score: "+j.format(totalScore));

    /*determine the final grade of the student*/

    if (totalScore >= 90){
      System.out.println("Final grade: "+"A");
    }

    else if (totalScore >= 80 && totalScore < 90) {
      System.out.println("Final grade: "+"B");
    }

    else if (totalScore >= 70 && totalScore < 80) {
      System.out.println("Final grade: "+"C");
    }

    else if (totalScore >= 60 && totalScore < 70) {
      System.out.println("Final grade: "+"D");
    }

    else if (totalScore < 60) {
      System.out.println("Final grade: "+"F");
    }

    System.out.println("* * * * *");















  }
}