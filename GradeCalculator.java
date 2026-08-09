```java
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      //get input for grades
      //each subject has three separate term grades which will later be averaged into one final grade
      double lcs1, lcs2, lcs3, k1, k2, k3, gm1, gm2, gm3, gs1, gs2, gs3, c1, c2, c3, cp1, cp2, cp3, ec1, ec2, ec3, mk1, mk2, mk3;

      System.out.println("Student Average Scanner\n");
      System.out.print("Enter LCS Term 1               :   ");
      lcs1 = input.nextDouble();
      System.out.print("Enter LCS Term 2               :   ");
      lcs2 = input.nextDouble();
      System.out.print("Enter LCS Term 3               :   ");
      lcs3 = input.nextDouble();
      System.out.print("Enter Kasaysayan Term 1        :   ");
      k1 = input.nextDouble();
      System.out.print("Enter Kasaysayan Term 2        :   ");
      k2 = input.nextDouble();
      System.out.print("Enter Kasaysayan Term 3        :   ");
      k3 = input.nextDouble();
      System.out.print("Enter Gen Math Term 1          :   ");
      gm1 = input.nextDouble();
      System.out.print("Enter Gen Math Term 2          :   ");
      gm2 = input.nextDouble();
      System.out.print("Enter Gen Math Term 3          :   ");
      gm3 = input.nextDouble();
      System.out.print("Enter Gen Sci Term 1           :   ");
      gs1 = input.nextDouble();
      System.out.print("Enter Gen Sci Term 2           :   ");
      gs2 = input.nextDouble();
      System.out.print("Enter Gen Sci Term 3           :   ");
      gs3 = input.nextDouble();
      System.out.print("Enter CLED Term 1              :   ");
      c1 = input.nextDouble();
      System.out.print("Enter CLED Term 2              :   ");
      c2 = input.nextDouble();
      System.out.print("Enter CLED Term 3              :   ");
      c3 = input.nextDouble();
      System.out.print("Enter Comp Prog Term 1         :   ");
      cp1 = input.nextDouble();
      System.out.print("Enter Comp Prog Term 2         :   ");
      cp2 = input.nextDouble();
      System.out.print("Enter Comp Prog Term 3         :   ");
      cp3 = input.nextDouble();
      System.out.print("Enter Eff Com Term 1           :   ");
      ec1 = input.nextDouble();
      System.out.print("Enter Eff Com Term 2           :   ");
      ec2 = input.nextDouble();
      System.out.print("Enter Eff Com Term 3           :   ");
      ec3 = input.nextDouble();
      System.out.print("Enter Mab Kom Term 1           :   ");
      mk1 = input.nextDouble();
      System.out.print("Enter Mab Kom Term 2           :   ");
      mk2 = input.nextDouble();
      System.out.print("Enter Mab Kom Term 3           :   ");
      mk3 = input.nextDouble();

      //process informartions and compute
      //final grade for each subject is calculated by getting the average of its three terms
      double lcsf, kf, gmf, gsf, cf, cpf, ecf, mkf;

      lcsf = (lcs1 + lcs2 + lcs3)/3;
      kf = (k1 + k2 + k3)/3;
      gmf = (gm1 + gm2 + gm3)/3;
      gsf = (gs1 + gs2 + gs3)/3;
      ecf = (ec1 + ec2 + ec3)/3;
      mkf = (mk1 + mk2 + mk3)/3;
      cf = (c1 + c2 + c3)/3;
      cpf = (cp1 + cp2 + cp3)/3;

      //general average uses the eight subjects included in this calculation
      double  ga = (lcsf + kf + gmf + gsf + ecf + mkf + cf + cpf)/8;

      //test variables are used to store the result of each condition as true or false
      boolean test1, test2, test3;
      //checks whether the general average reaches the required minimum of 75
      test1 = (ga >= 75); 
      //checks whether the Computer Programming final grade reaches the required minimum of 90
      test2 = (cpf >= 90);
      //both conditions must be true for test3 to become true
      test3 = test1 && test2;

      //display output
      System.out.println("\nSubject Final Grades:");
      System.out.println("= = = = = = = = = = = = = = = = = = = = = =");
      System.out.println("LCS Final Grade              :   " + lcsf);
      System.out.println("Kasaysayan Final Grade       :   " + kf);
      System.out.println("Gen Math Final Grade         :   " + gmf);
      System.out.println("Gen Sci Final Grade          :   " + gsf);
      System.out.println("ClED Final Grade             :   " + cf);
      System.out.println("Comp Prog Final Grade        :   " + cpf);
      System.out.println("Eff Com Final Grade          :   " + ecf);
      System.out.println("Mab Kom Final Grade          :   " + mkf);
      System.out.println("= = = = = = = = = = = = = = = = = = = = = =");
      System.out.println();
      System.out.println("General Average              :   " + ga);
      System.out.println();
      System.out.println("Is general average >= 75     :   " + test1);
      System.out.println("Is Com Prog >= 90            :   " + test2);
      System.out.println("Are both conditions met?     :   " + test3);

    }
}
```
