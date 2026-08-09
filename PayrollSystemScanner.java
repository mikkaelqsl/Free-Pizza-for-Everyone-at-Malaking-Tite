import java.util.Scanner;
public class PayrollSystemScanner{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //declaration of vars
        String name, employee_id, department;
        double basic_salary, overtime_hours, rate_per_hour, rice_allowance, transportation_allowance, tax_deduction;
        
        //get inputs
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
        double sss, philhealth, pagibig, tax, total_deduction, gross_pay, overtime_pay, net_pay;
        overtime_pay = ((((basic_salary * 12) / 52) / 40) * rate_per_hour) * overtime_hours;
        gross_pay = basic_salary + overtime_pay + rice_allowance + transportation_allowance;
        sss = gross_pay * 0.05;
        philhealth = gross_pay * 0.025;
        pagibig = gross_pay * 0.02;
        tax = (tax_deduction) / 100 * gross_pay;
        total_deduction = sss + philhealth + pagibig + tax;
        net_pay = gross_pay - total_deduction;
        boolean test1, test2, test3, test4;
        test1 = net_pay >= 10000;
        test2 = gross_pay >= net_pay;
        test3 = overtime_pay > 0;        
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
        System.out.println("Net salary is P20,000 or above          :   " + test1);
        System.out.println("Gross Salary is greater than Net Salary :   " + test2);
        System.out.println("Employee received overtime pay          :   " + test3);
        System.out.println("Both requirements are met               :   " + test4);
    }
}
