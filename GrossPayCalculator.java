import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Gross Pay Calculator\n");
        System.out.print("Enter Monthly Salary            :         ");
        double ms = input.nextDouble();
        System.out.print("Enter Overtime Rate             :         ");
        double m = input.nextDouble();
        System.out.print("Enter Overtime Hours            :         ");
        double o = input.nextDouble();
        
        System.out.print("Private Job? y/n                :         ");
        char pb = input.next().charAt(0);
        boolean check = false;
        boolean priv;
        while (check == false) { // check if input in pb is y or n
            if (pb == 'y' || pb == 'n') {
                check = true;
            } else {
                System.out.println("The character is something else.\nPrivate Job? y/n                :         ");
                pb = input.next().charAt(0);
            }
        }
        if (pb == 'y'){
            priv = true;
        }
        else{
            priv = false;
        }
        
        System.out.print("Employee? y/n                   :         ");          
        char ee = input.next().charAt(0);
        boolean check1 = false;
        boolean employee;
        while (check1 == false) { // check if input in pb is y or n
            if (ee == 'y' || ee == 'n') {
                check1 = true;
            } else {
                System.out.println("The character is something else.\nEmployee? y/n                   :         ");
                ee = input.next().charAt(0);
            }
        }
        if (ee == 'y'){
            employee = true;
        }
        else{
            employee = false;
        }
        
        double gp = (((((ms * 12) / 52) / 40) * m) * o) + ms;
        double agp = gp * 12;
        double wt;
        
        if (agp <= 250000) {
            wt = 0;
        } else if (agp <= 400000) {
            wt = (0.15 * (agp - 250000))/12;
        } else if (agp <= 800000) {
            wt = (0.20 * (agp - 400000) + 22500)/12;
        } else if (agp <= 2000000) {
            wt = (0.25 * (agp - 800000) + 102500)/12;
        } else if (agp <= 8000000) {
            wt = (0.30 * (agp - 2000000) + 402500)/12;
        } else {
            wt = (0.35 * (agp - 8000000) + 2202500)/12;
        }
        
        double sss1, philhealth1, pagibig1, gsis1, gsis2, sss2, philhealth2, pagibig2;
        
        gsis1 = (gp * 0.09);
        gsis2 = gp * 0.12;
        sss1 = (gp * 0.05);
        sss2 = gp * 0.10;
        philhealth1 = philhealth2 = (gp * 0.025);
        pagibig1 = pagibig2 = (gp * 0.02);
        
        double deductions;
        if (priv && employee){
            deductions = sss1 + philhealth1 + pagibig1 + wt;
        }
        else if (priv){
            deductions = sss2 + philhealth2 + pagibig2 + wt;
        }
        else if (employee){
            deductions = gsis1 + philhealth1 + pagibig1 + wt;
        }
        else{
            deductions = gsis2 + philhealth2 + pagibig2 + wt;
        }
        
        double net = gp - deductions;
        
        System.out.println("\nGross Pay                       :         " + gp);
        System.out.println("Annual Gross Pay                :         " + agp);
        System.out.println("Withholding Tax                 :         " + wt);
        System.out.println("Deductions                      :         " + deductions);
        System.out.println("Net Pay                         :         " + net);
        
    }
}