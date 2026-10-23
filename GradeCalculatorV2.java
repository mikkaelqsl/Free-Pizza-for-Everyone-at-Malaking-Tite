import java.util.Scanner;
public class GradeCalculatorV2 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      for (int i = 1; i < 50; i++){
        System.out.print("= ");
      }
      System.out.printf("%n%60s%n", "CLASS SUBJECT GRADE TABLE");
      for (int i = 1; i < 50; i++){
        System.out.print("= ");
      }
      int studentQuantity = 5;
      String[] subject = {
        "Mathematics",
        "Science",
        "English",
        "Java",
        "ICT"
      };
      String[] name= new String[studentQuantity];
      String[] performance = new String[studentQuantity];
      double[] total = new double[studentQuantity];
      double[] average = new double[studentQuantity]; 
      double[][] grade = new double[studentQuantity][subject.length];
      for (int i = 0; i< studentQuantity; i++){
        System.out.print("\nEnter Student " + (i + 1) + " Name:\t");
        name[i] = in.nextLine();
        System.out.println("Enter Grades from 0 to 100:");
        for (int j = 0; j < grade[i].length; j++){
          System.out.print("Enter Grades for " + subject[j] + ":\t");
          grade[i][j] = in.nextDouble();
          total[i] += grade[i][j];
        }
        in.nextLine();
        average[i] = total[i] / grade[i].length;

        performance[i] = (average[i] >= 90) ? "EXCELLENT":
                         (average[i] >= 85) ? "VERY GOOD":
                         (average[i] >= 80) ? "GOOD":
                         "NEEDS IMPROVEMENT";
      }
      for (int i = 1; i < 50; i++){
        System.out.print("= ");
      }
      System.out.printf("%n%60s%n", "CLASS GRADE TABLE");
      for (int i = 1; i < 50; i++){
        System.out.print("= ");
      }
      System.out.printf("%n%-16s %12s %10s %10s %10s %10s %10s %22s%n",
          "Student", "Mathematics", "Science", "English", "Java", "ICT", "Average", "Performance");
      for (int i = 1; i < 50; i++){
        System.out.print("- ");
      }
      System.out.println();
      for (int i = 0; i < studentQuantity; i++){
        System.out.printf("%-16s %12.1f %10.1f %10.1f %10.1f %10.1f %10.1f %22s%n",
            name[i], grade[i][0], grade[i][1], grade[i][2], grade[i][3], grade[i][4],
            average[i], performance[i]);
      }
      in.close();
    }
}
