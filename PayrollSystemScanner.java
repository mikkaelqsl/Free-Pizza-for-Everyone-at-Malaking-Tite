import java.util.Scanner;
public class PayrollSystemScanner{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //declaration of vars
        String name, employee_id, department;
        double basic_salary, overtime_hours, rate_per_hour, rice_allowance, transportation_allowance, tax_deduction;
        
        //get inputs
        //String inputs use nextLine() so spaces in names and department names can be accepted
        System.out.print("Enter name                        :   ");
        name = input.nextLine();
        System.out.print("Enter Employee ID                 :   ");
        employee_id = input.nextLine();
        System.out.print("Enter Department                  :   ");
        department = input.nextLine();
        System.out.print("Enter Basic Salary                :   ");
        basic_salary = input.nextDouble();
        System.out.print("Enter Ovetime Hours               :   ");
        overtime_hours = input.nextDouble();
        System.out.print("Enter Rate per Hour               :   ");
        rate_per_hour = input.nextDouble();
        System.out.print("Enter Rice Allowance              :   ");
        rice_allowance = input.nextDouble();
        System.out.print("Enter Transportation Allowance    :   ");
        transportation_allowance = input.nextDouble();
        System.out.print("Enter Tax Deduction in Percentage :   ");
        tax_deduction = input.nextDouble();
        
        //process inputs
        //all calculated salary values are stored separately so they can be displayed individually in the receipt
        double sss, philhealth, pagibig, tax, total_deduction, gross_pay, overtime_pay, net_pay;
        
        //monthly salary is converted to an estimated hourly salary before calculating overtime pay
        overtime_pay = ((((basic_salary * 12) / 52) / 40) * rate_per_hour) * overtime_hours;
        
        //gross pay consists of the basic salary, overtime pay, and both allowances
        gross_pay = basic_salary + overtime_pay + rice_allowance + transportation_allowance;
        
        //mandatory deductions are calculated as percentages of the gross pay
        sss = gross_pay * 0.05;
        philhealth = gross_pay * 0.025;
        pagibig = gross_pay * 0.02;
        
        //tax_deduction is entered as a whole-number percentage, so it is divided by 100 before multiplication
        tax = (tax_deduction) / 100 * gross_pay;
        
        //all individual deductions are combined before calculating the final net salary
        total_deduction = sss + philhealth + pagibig + tax;
        
        //net pay is the amount remaining after all deductions are removed from gross pay
        net_pay = gross_pay - total_deduction;
        
        //boolean tests are used to check whether the payroll result satisfies the given requirements
        boolean test1, test2, test3, test4;
        
        //checks whether the employee's net salary reaches the minimum of P10,000
        test1 = net_pay >= 10000;
        
        //gross salary should normally be equal to or greater than net salary because deductions are subtracted
        test2 = gross_pay >= net_pay;
        
        //checks whether the employee actually received overtime pay
        test3 = overtime_pay > 0;        
        
        //all three conditions must be true for the final requirement to be met
        test4 = test1 && test2 && test3;
        
        //display output
        System.out.println("\n================================================");
        System.out.println("        SFNCS PAYROLL MANAGEMENT SYSTEM");
        System.out.println("================================================");
        System.out.println();
        System.out.println("Employee Information");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Employee Name                   :   " + name);
        System.out.println("Employee ID                     :   " + employee_id);
        System.out.println("Department                      :   " + department);
        System.out.println();
        System.out.println("Salary Information");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Basic Salary                    :   " + basic_salary);
        System.out.println("Overtime Pay                    :   " + overtime_pay);
        System.out.println("Rice Alowance                   :   " + rice_allowance);
        System.out.println("Transportation Alowance         :   " + transportation_allowance);
        System.out.println();
        System.out.println("Gross Salary                    :   " + gross_pay);
        System.out.println();
        System.out.println("Deductions");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Tax Deduction                   :   " + tax);
        System.out.println("SSS Deduction                   :   " + sss);
        System.out.println("Philhealth Deduction            :   " + philhealth);
        System.out.println("Pag-IBIG Deduction              :   " + pagibig);
        System.out.println();
        System.out.println("Total Deductions                :   " + total_deduction);
        System.out.println();
        System.out.println("================================================");
        System.out.println("Net Salary                      :   " + net_pay);
        System.out.println("================================================");
        System.out.println();
        
        //display the result of each individual requirement check
        System.out.println("Net salary is P20,000 or above          :   " + test1);
        System.out.println("Gross Salary is greater than Net Salary :   " + test2);
        System.out.println("Employee received overtime pay          :   " + test3);
        
        //test4 becomes true only when test1, test2, and test3 are all true
        System.out.println("Both requirements are met               :   " + test4);
    }
}
