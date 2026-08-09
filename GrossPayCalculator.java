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
            //input is repeatedly checked until the user enters either lowercase y or n
            if (pb == 'y' || pb == 'n') {
                check = true;
            } 
            else {
                System.out.println("The character is something else.\nPrivate Job? y/n                :         ");
                pb = input.next().charAt(0);
            }
        }
        //convert the y/n answer into a boolean value for easier use in the deduction conditions
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
            //same validation process as above, but this time for employee status
            if (ee == 'y' || ee == 'n') {
                check1 = true;
            } else {
                System.out.println("The character is something else.\nEmployee? y/n                   :         ");
                ee = input.next().charAt(0);
            }
        }
        //convert the y/n answer into a boolean value for the deduction calculation later
        if (ee == 'y'){
            employee = true;
        }
        else{
            employee = false;
        }
        
        //gross pay starts with the monthly salary and adds the calculated overtime pay
        //the monthly salary is converted to an estimated weekly and hourly rate before multiplying by the overtime rate and hours
        double gp = (((((ms * 12) / 52) / 40) * m) * o) + ms;
        
        //annual gross pay is used as the basis for the withholding tax brackets
        double agp = gp * 12;
        double wt;
        
        //withholding tax is determined using the employee's annual gross pay
        //each bracket applies a different percentage only to the amount exceeding the bracket's lower limit
        if (agp <= 250000) {
            //income at or below 250,000 has no withholding tax under this bracket system
            wt = 0;
        } else if (agp <= 400000) {
            //15% is applied to the amount exceeding 250,000, then divided by 12 to get the monthly tax
            wt = (0.15 * (agp - 250000))/12;
        } else if (agp <= 800000) {
            //22,500 is the accumulated tax from the previous bracket
            wt = (0.20 * (agp - 400000) + 22500)/12;
        } else if (agp <= 2000000) {
            //102,500 is the accumulated tax from the previous brackets
            wt = (0.25 * (agp - 800000) + 102500)/12;
        } else if (agp <= 8000000) {
            //402,500 is the accumulated tax from the previous brackets
            wt = (0.30 * (agp - 2000000) + 402500)/12;
        } else {
            //2,202,500 is the accumulated tax from the previous brackets for income above 8,000,000
            wt = (0.35 * (agp - 8000000) + 2202500)/12;
        }
        
        //contribution variables are separated into two rates because the deduction depends on the worker's private/public and employee/non-employee status
        double sss1, philhealth1, pagibig1, gsis1, gsis2, sss2, philhealth2, pagibig2;
        
        //the contribution values are calculated from gross pay before being selected for the final deductions
        gsis1 = (gp * 0.09);
        gsis2 = gp * 0.12;
        sss1 = (gp * 0.05);
        sss2 = gp * 0.10;
        
        //PhilHealth and Pag-IBIG use the same rates for both possible deduction cases
        philhealth1 = philhealth2 = (gp * 0.025);
        pagibig1 = pagibig2 = (gp * 0.02);
        
        double deductions;
        //private employee uses SSS1, PhilHealth1, Pag-IBIG1, and withholding tax
        if (priv && employee){
            deductions = sss1 + philhealth1 + pagibig1 + wt;
        }
        //private non-employee uses the second SSS rate while keeping the same PhilHealth and Pag-IBIG rates
        else if (priv){
            deductions = sss2 + philhealth2 + pagibig2 + wt;
        }
        //public employee uses GSIS1 instead of SSS
        else if (employee){
            deductions = gsis1 + philhealth1 + pagibig1 + wt;
        }
        //public non-employee uses the second GSIS rate
        else{
            deductions = gsis2 + philhealth2 + pagibig2 + wt;
        }
        
        //net pay is the remaining amount after all selected deductions are subtracted from gross pay
        double net = gp - deductions;
        
        //display output
        System.out.println("\nGross Pay                       :         " + gp);
        System.out.println("Annual Gross Pay                :         " + agp);
        System.out.println("Withholding Tax                 :         " + wt);
        System.out.println("Deductions                      :         " + deductions);
        System.out.println("Net Pay                         :         " + net);
        
    }
}
```
