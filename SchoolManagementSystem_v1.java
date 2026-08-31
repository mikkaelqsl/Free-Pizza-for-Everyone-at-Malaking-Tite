import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // INPUT 

        // School Information
          System.out.println("School Information");
          System.out.print("Building Name                   :   ");
          String buildingname = input.nextLine();
          System.out.print("# of Students                   :   ");
          double studentsnum = input.nextDouble();
          System.out.print("# of Faculty Members            :   ");
          double facultynum = input.nextDouble();
          System.out.print("# of Staff Members              :   ");
          double staffnum = input.nextDouble();
          System.out.print("# of Operating Days             :   ");
          double operatingdays = input.nextDouble();

        // Classroom Information
          System.out.println("\nClassroom Information"); 
          System.out.print("# of Classrooms                 :   ");
          double classroomnum = input.nextDouble();
          System.out.print("# of Students per Classroom     :   ");
          double classroomusersnum = input.nextDouble();
          System.out.println("Average Water Consumption per Student per Day");
          System.out.print("Enter Input                     :   ");
          double classroomdailywaterconsumption = input.nextDouble();
          System.out.println("Average Classroom Waste per Student in kilograms");
          System.out.print("Enter Input                     :   ");
          double classroomwasteperuser = input.nextDouble();

        // Computer Laboratory
          System.out.println("\nComputer Laboratory");
          System.out.print("# of Laboratory Users per Day   :   ");
          double laboratoryusersnum = input.nextDouble();
          System.out.println("Average Water Consumption per Users per Day");
          System.out.print("Enter Input                     :   ");
          double laboratorydailywaterconsumption = input.nextDouble();
          System.out.println("Average Laboratory Waste per Users in kilograms");
          System.out.print("Enter Input                     :   ");
          double laboratorywasteperuser = input.nextDouble();
          
        // Library
          System.out.println("\nLibrary");
          System.out.print("# of Library Users per Day      :   ");
          double libraryusersnum = input.nextDouble();
          System.out.println("Average Water Consumption per Users per Day");
          System.out.print("Enter Input                     :   ");
          double librarydailywaterconsumption = input.nextDouble();
          System.out.println("Average Library Waste per Student in kilograms");
          System.out.print("Enter Input                     :   ");
          double librarywasteperuser = input.nextDouble();
          
        // Canteen
          System.out.println("\nCanteen");
          System.out.print("# of Canteen Users              :   ");
          double canteenusersnum = input.nextDouble();
          System.out.println("Average Water Consumption per Users per Day");
          System.out.print("Enter Input                     :   ");
          double canteendailywaterconsumption = input.nextDouble();
          System.out.println("Average Canteen Waste per Users in kilograms");
          System.out.print("Enter Input                     :   ");
          double canteenwasteperuser = input.nextDouble();
        // hash brown ni isay pampalinis ng code 
        // Comfort Rooms
          System.out.println("\nComfort Rooms");
          System.out.print("# of Comfort Room Users         :   ");
          double crusersnum = input.nextDouble();
          System.out.println("Average Water Consumption per Users per Day");
          System.out.print("Enter Input                     :   ");
          double crdailywaterconsumption = input.nextDouble();
          System.out.println("Average Comfort Room Waste per Users in kilograms");
          System.out.print("Enter Input                     :   ");
          double crwasteperuser = input.nextDouble();

        // Administrative Office
          System.out.println("\nCanteen");
          System.out.print("# of Office Users               :   ");
          double officeusersnum = input.nextDouble();
          System.out.println("Average Water Consumption per Users per Day");
          System.out.print("Enter Input                     :   ");
          double officedailywaterconsumption = input.nextDouble();
          System.out.println("Average Office Waste per Users in kilograms");
          System.out.print("Enter Input                     :   ");
          double officewasteperuser = input.nextDouble();

        // Water Information
          System.out.println("\nWater Information");
          System.out.print("Enter Water Rate per Cubic Meter:   ");
          double waterrate = input.nextDouble();
          System.out.print("Enter Water-Saving Percentage   :   ");
          double watersavingpercentage = (input.nextDouble())/100;
          System.out.print("Monthly Maintenance Expense     :   ");
          double maintenanceexpense = input.nextDouble();

        // Waste Management Information
          System.out.println("\nWaste Management Information");
          System.out.print("Waste Collection Cost per kg    :   ");
          double wastecollectioncost = input.nextDouble();
          System.out.print("Recyclable Waste Percentage     :   ");
          double recyclablewastepercentage = (input.nextDouble()) / 100;
          System.out.print("Actual Recycling Percentage     :   ");
          double actualrecyclingpercentage = (input.nextDouble()) / 100;
          System.out.print("Recycling Revenue per Kilogram  :   ");
          double recyclingrevenue = input.nextDouble();
          System.out.print("Monthly Waste Management Expense:   ");
          double wastemanagementexpense = input.nextDouble();

      // PROCESSES

        // Water Consumption
          double classroomwater = studentsnum * classroomdailywaterconsumption;
          double laboratorywater = laboratoryusersnum * laboratorydailywaterconsumption;
          double librarywater = libraryusersnum * librarydailywaterconsumption;
          double canteenwater = canteenusersnum * canteendailywaterconsumption;
          double crwater = crusersnum * crdailywaterconsumption;
          double officewater = officeusersnum * officedailywaterconsumption;

          // Per-Section Monthly Water Consumption (needed for output display)
          double classroomwatermonthly = (classroomwater * 365) / 12;
          double laboratorywatermonthly = (laboratorywater * 365) / 12;
          double librarywatermonthly = (librarywater * 365) / 12;
          double canteenwatermonthly = (canteenwater * 365) / 12;
          double crwatermonthly = (crwater * 365) / 12;
          double officewatermonthly = (officewater * 365) / 12;

        // Total Water Consumption
          double totalwaterconsumptiondaily = classroomwater + laboratorywater + librarywater + canteenwater + crwater + officewater;
          double totalwaterconsumptionmonthly = (totalwaterconsumptiondaily * 365) / 12;
          double waterconsumptionperstudent = totalwaterconsumptionmonthly / studentsnum;
          double waterconsumptionperschooluser = totalwaterconsumptionmonthly / (facultynum + staffnum);

        // Water-Saving Analysis
          double watersaved = (totalwaterconsumptionmonthly * watersavingpercentage);
          double waterconsumptionafter = totalwaterconsumptionmonthly - watersaved;
          double watercostbefore = waterrate * totalwaterconsumptionmonthly; 
          double watercostafter = waterrate * waterconsumptionafter;
          double moneysaved = watercostbefore - watercostafter;

        // sakadung kading padungding santos
        // Waste Analysis
          double classroomwastemonthly = (classroomwasteperuser * studentsnum * 365) / 12;
          double laboratorywastemonthly = (laboratorywasteperuser * laboratoryusersnum * 365) / 12;
          double librarywastemonthly = (librarywasteperuser * libraryusersnum * 365) / 12;
          double canteenwastemonthly = (canteenwasteperuser * canteenusersnum * 365) / 12;
          double officewastemonthly = (officewasteperuser * officeusersnum * 365) / 12;
          double crwastemonthly = (crwasteperuser * crusersnum * 365) / 12;
          double totalwastedaily = (classroomwasteperuser * studentsnum) + (laboratorywasteperuser * laboratoryusersnum) + (librarywasteperuser * libraryusersnum) + (canteenwasteperuser * canteenusersnum) + (officewasteperuser * officeusersnum) + (crwasteperuser * crusersnum);
          double totalwastemonthly = classroomwastemonthly + laboratorywastemonthly + librarywastemonthly + canteenwastemonthly + officewastemonthly + crwastemonthly;

        // Recycling Analysis
          double potentialrecyclablewaste = totalwastemonthly * recyclablewastepercentage;
          double actualrecycledwaste = (potentialrecyclablewaste * actualrecyclingpercentage);
          double unrecycledrecyclablewaste = potentialrecyclablewaste - actualrecycledwaste;
          double nonrecyclablewaste = totalwastemonthly - potentialrecyclablewaste;
          double totalrecyclerevenue = actualrecycledwaste * recyclingrevenue;

        // Waste Management Cost
          double totalwastecollectioncost = wastecollectioncost * totalwastemonthly;
          // wastemanagementexpense already declared
          // totalrecyclerevenue already determined
          double netwastemanagementcost = wastemanagementexpense - totalrecyclerevenue;
        
        // Total Monthly Operating Cost 
          // watercost already determined
          // maintenanceexpense already declared
          // totalwastecollectioncost already determined
          // wastemanagementexpense already declared
          double totaloperatingcost = watercostafter + maintenanceexpense + totalwastecollectioncost + wastemanagementexpense - totalrecyclerevenue;

        // Sustainability Analysis
          // Water Consumption per Student
            // waterconsumptionperstudent determined 
          // Waster per Student
            double wasteperstudent = totalwastemonthly / studentsnum;
          //Recycling Rate
            double totalwasterecycledpercentage = (actualrecycledwaste / totalwastemonthly) * 100;
          // Recyclable Waste Recovery
            double recyclablewasterecoveredpercentage = (actualrecycledwaste / potentialrecyclablewaste) * 100;
          // Water Reduction
            double waterreductionpercentage = (watersaved / totalwaterconsumptionmonthly) * 100;
          // Waste Diversion 
            double wastediverted = (actualrecycledwaste / totalwastemonthly) * 100;
        
        // Logical Analysis 
          boolean bigwaterconsumptionboolean = totalwaterconsumptionmonthly >= 10000;
          boolean bigwasteconsumptionboolean = totalwastemonthly >= 1000;
          boolean watersavingminimumboolean = watersavingpercentage >= 0.1;
          boolean minimumrecyleboolean = actualrecycledwaste >= (potentialrecyclablewaste * 0.5);
          boolean wastediversionboolean = actualrecycledwaste >= (totalwastemonthly * 0.3);
          boolean minimumwaterexpenseboolean = watercostafter >= 50000;
          boolean waterrecycleboolean = watersavingminimumboolean && minimumrecyleboolean;
          boolean highwastewaterboolean = bigwasteconsumptionboolean && bigwaterconsumptionboolean;
          boolean sustainbilityboolean = watersavingminimumboolean && minimumrecyleboolean && wastediversionboolean;

      // OUTPUT 
        
        // Header Frame 
          System.out.println("\n= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
          System.out.println("Smart School Water, Waste Management, and Sustainability Analysis System");
          System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
        
        // School Information 
          System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
          System.out.println("School Information");
          System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
          System.out.println("Building Name                     :   " + buildingname);
          System.out.println("# of Students                     :   " + studentsnum);
          System.out.println("# of Faculty Members              :   " + facultynum);
          System.out.println("# of Staff Members                :   " + staffnum);
          System.out.println("# of Operating Days               :   " + operatingdays);

        // Classroom Information
          System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
          System.out.println("Classroom Information"); 
          System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
          System.out.println("# of Classrooms                   :   " + classroomnum);
          System.out.println("# of Students per Classroom       :   " + classroomusersnum);
          System.out.println("Average Water Consumption per Student per Day");
          System.out.println("Result                            :   " + classroomdailywaterconsumption);
          System.out.println("Average Classroom Waste per Student in kilograms");
          System.out.println("Result                            :   " + classroomwasteperuser);

          // Water Consumption
            System.out.println("Total Water Consumption Daily   :   " + classroomwater);
            System.out.println("Total Water Consumption Monthly :   " + classroomwatermonthly);

        // Computer Laboratory 
          System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
          System.out.println("Computer Laboratory");
          System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
          System.out.println("# of Laboratory Users per Day     :   " + laboratoryusersnum);
          System.out.println("Average Water Consumption per Users per Day");
          System.out.println("Result                            :   " + laboratorydailywaterconsumption);
          System.out.println("Average Laboratory Waste per Users in kilograms");
          System.out.println("Result                            :   " + laboratorywasteperuser);

          // Water Consumption
            System.out.println("Total Water Consumption Daily   :   " + laboratorywater);
            System.out.println("Total Water Consumption Monthly :   " + laboratorywatermonthly);
          
        // Library 
          System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
          System.out.println("Library");
          System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
          System.out.println("# of Library Users per Day        :   " + libraryusersnum);
          System.out.println("Average Water Consumption per Users per Day");
          System.out.println("Result                            :   " + librarydailywaterconsumption);
          System.out.println("Average Library Waste per Student in kilograms");
          System.out.println("Result                            :   " + librarywasteperuser);
          
          // Water Consumption
            System.out.println("Total Water Consumption Daily   :   " + librarywater);
            System.out.println("Total Water Consumption Monthly :   " + librarywatermonthly);
          
        // Canteen 
          System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
          System.out.println("Canteen");
          System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
          System.out.println("# of Canteen Users per Day        :   " + canteenusersnum);
          System.out.println("Average Water Consumption per Users per Day");
          System.out.println("Result                            :   " + canteendailywaterconsumption);
          System.out.println("Average Canteen Waste per Student in kilograms");
          System.out.println("Result                            :   " + canteenwasteperuser);

          // Water Consumption
            System.out.println("Total Water Consumption Daily   :   " + canteenwater);
            System.out.println("Total Water Consumption Monthly :   " + canteenwatermonthly);
          
        // Comfort Rooms 
          System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
          System.out.println("Comfort Room");
          System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
          System.out.println("# of Comfort Room Users per Day   :   " + crusersnum);
          System.out.println("Average Water Consumption per Users per Day");
          System.out.println("Result                            :   " + crdailywaterconsumption);
          System.out.println("Average Comfort Room Waste per Student in kilograms");
          System.out.println("Result                            :   " + crwasteperuser);   

          // Water Consumption
            System.out.println("Total Water Consumption Daily   :   " + crwater);
            System.out.println("Total Water Consumption Monthly :   " + crwatermonthly);
        // Administrative Office 
          System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
          System.out.println("Administrative Office");
          System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
          System.out.println("# of Administrative Office Users per Day      :   " + officeusersnum);
          System.out.println("Average Water Consumption per Users per Day");
          System.out.println("Result                            :   " + officedailywaterconsumption);
          System.out.println("Average Administrative Office Waste per Student in kilograms");
          System.out.println("Result                            :   " + officewasteperuser);

          // Water Consumption
            System.out.println("Total Water Consumption Daily   :   " + officewater);
            System.out.println("Total Water Consumption Monthly :   " + officewatermonthly);
          
        // Water Information 
          System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
          System.out.println("Water Information");
          System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
          System.out.println("Enter Water Rate per Cubic Meter  :   " + waterrate);
          System.out.println("Enter Water-Saving Percentage     :   " + watersavingpercentage);
          System.out.println("Monthly Maintenance Expense       :   " + maintenanceexpense);
          
          // Water Saving Analysis
        
        // Waste Management Information 
          System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
          System.out.println("Waste Management Information");
          System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
          System.out.println("Waste Collection Cost per kg      :   " + wastecollectioncost);
          System.out.println("Recyclable Waste Percentage       :   " + recyclablewastepercentage);
          System.out.println("Actual Recycling Percentage       :   " + actualrecyclingpercentage);
          System.out.println("Recycling Revenue per Kilogram    :   " + recyclingrevenue);
          System.out.println("Monthly Waste Management Expense  :   " + wastemanagementexpense);

        // Waste Analysis 
          System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
          System.out.println("Waste Analysis");

          // Classroom 
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
            System.out.println("Classroom");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
            System.out.println("Total Daily Waste               :   " + classroomwasteperuser);
            System.out.println("Monthly Daily Waste             :   " + classroomwastemonthly);

          // Laboratory 
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
            System.out.println("Laboratory");
            System.out.println("Total Daily Waste               :   " + laboratorywasteperuser);
            System.out.println("Monthly Daily Waste             :   " + laboratorywastemonthly);

          // Library
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
            System.out.println("Library");
            System.out.println("Total Daily Waste               :   " + librarywasteperuser);
            System.out.println("Monthly Daily Waste             :   " + librarywastemonthly);

          // Canteen 
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
            System.out.println("Canteen");
            System.out.println("Total Daily Waste               :   " + canteenwasteperuser);
            System.out.println("Monthly Daily Waste             :   " + canteenwastemonthly);

          // Administrative Office 
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
            System.out.println("Administrative Office");
            System.out.println("Total Daily Waste               :   " + officewasteperuser);
            System.out.println("Monthly Daily Waste             :   " + officewastemonthly);

          // Comfort Room
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
            System.out.println("Comfort Room");
            System.out.println("Total Daily Waste               :   " + crwasteperuser);
            System.out.println("Monthly Daily Waste             :   " + crwastemonthly);

        // Recycling Analysis 
          System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
          System.out.println("Recycling Analysis");
          System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
          System.out.println("Potential Recyclable Waste        :   " + potentialrecyclablewaste);
          System.out.println("Actual Recycled Waste             :   " + actualrecycledwaste);
          System.out.println("Unrecycled Recyclable Waste       :   " + unrecycledrecyclablewaste);
          System.out.println("Non Recyclable Waste              :   " + nonrecyclablewaste);
          System.out.println("Total Recycle Revenue             :   " + totalrecyclerevenue);

        // Waste Management Cost 
          System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
          System.out.println("Waste Management Cost");
          System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
          System.out.println("Total Waste Collection Cost       :   " + totalwastecollectioncost);
          System.out.println("Waste Management Expense          :   " + wastemanagementexpense);
          System.out.println("Recycling Revenue                 :   " + totalrecyclerevenue);
          System.out.println("Net Waste-Management Cost         :   " + netwastemanagementcost);

        // Total Monthly Operating Cost  
          System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
          System.out.println("Total Monthly Operating Cost");
          System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
          System.out.println("Water Cost                        :   " + watercostafter);
          System.out.println("Maintenance Expense               :   " + maintenanceexpense);
          System.out.println("Waste Collection Cost             :   " + totalwastecollectioncost);
          System.out.println("Waste Management Expense          :   " + wastemanagementexpense);
          System.out.println("Total Operating Cost              :   " + totaloperatingcost);


        // Sustainability Analysis 
          System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
          System.out.println("Sustainability Analysis");
          System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
          System.out.println("Water Consumption per Student     :   " + waterconsumptionperstudent);
          System.out.println("Waste per Student                 :   " + wasteperstudent);
          System.out.println("Recycling Rate                    :   " + totalwasterecycledpercentage);
          System.out.println("Recyclable Waste Recovery         :   " + recyclablewasterecoveredpercentage);
          System.out.println("Water Reduction                   :   " + waterreductionpercentage);
          System.out.println("Waste Diversion                   :   " + wastediverted);

        // Logical Analysis 
          System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
          System.out.println("Logical Analysis");
          System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
          System.out.println("Water Consumption >= 10,000         :   " + bigwaterconsumptionboolean);
          System.out.println("Waste Consumption >= 1,000          :   " + bigwasteconsumptionboolean);
          System.out.println("Water Savings >= 10%                :   " + watersavingminimumboolean);
          System.out.println("Total Recycled >= 50%               :   " + minimumrecyleboolean);
          System.out.println("Waste Diverted >= 30%               :   " + wastediversionboolean);
          System.out.println("Water Expense >= 50,000             :   " + minimumwaterexpenseboolean);
          System.out.println("Water and Waste Efficient           :   " + waterrecycleboolean);
          System.out.println("High Water and Waste                :   " + highwastewaterboolean);
          System.out.println("Sustainable                         :   " + sustainbilityboolean);

    }
}
