import java.util.Scanner;

public class Airport_Reservation_v1{
    public static void main(String[] args){
        //declare Scanner
        Scanner input = new Scanner(System.in);
        
        //display basic instructions
        System.out.println("Airport Reservation CLI");
        System.out.println("Answer the Following Questions:");
        
        /*
            To make it user friendly, we looped if statements using while statement until valid answer is received.
            boolean "check" variabes are used for the while statemnts which are later reassigned as true when the program gets a valid answer.
            int "input" variables are used for if statements to check if user input is valid.
        */
        
        //get personal info
        int num_people, input1;                                         //declaring vars in one line to reduce lines of code
        boolean check1, specneeds;
        check1 = false;                                                 //initializint check variable as false to be later reassigned as true
        specneeds = false;
        
        System.out.println("\nPersonal Information:");
        System.out.print("Enter # of Reservee           :       ");
        num_people = input.nextInt();
        System.out.print("Special Needs? 0/1            :       ");
        input1 = input.nextInt();
        
        while (!check1){                                                //check variable for while loop
            if (input1 == 1){                                           //input variable to check if answer is valid
                specneeds = true;
                check1 = true;
            }
            else if (input1 == 0){
                specneeds = false;
                check1 = true;
            }
            else{
                System.out.println("Invalid Answer!");
                System.out.print("Special Needs? 0/1            :       ");
                input1 = input.nextInt();
            }
        }
        input.nextLine();                                               //solution to a bug where it skips "Departing From" question
        
        //get flight info
        String from, destination;
        int input2;
        boolean check2, local;
        check2 = false;
        local = false;
        destination = "di ko alam pre";                                 //initializing with a string to be later reassigned
        
        System.out.println("\nFlight Information:");
        System.out.print("Departing From                :       ");
        from = input.nextLine();
        System.out.println("\nSelect Destination:");
        System.out.println("1.China\n2.Japan\n3.Canada\n4.Bicol\n5.Cebu");
        System.out.print("Enter Number                  :       ");
        input2 = input.nextInt();
        
        while (!check2){
            if (input2 == 1){
                destination = "China";
                local = false;
                check2 = true;  //six seven
            }
            else if (input2 == 2){
                destination = "Japan";
                local = false;
                check2 = true;
            }
            else if (input2 == 3){
                destination = "Canada";
                local = false;
                check2 = true;
            }
            else if (input2 == 4){
                destination = "Bicol";
                local = true;
                check2 = true;
            }
            else if (input2 == 5 ){
                destination = "Cebu";
                local = true;
                check2 = true;
            }
            else{
                System.out.println("Invalid Answer!");
                System.out.print("Enter Number                  :       ");
                input2 = input.nextInt();
            }
        }
        
        String type;
        int input3;
        boolean check3;
        check3 = false;
        type = "chinita fine shyt po with glasses na matalino at politically aware at galit sa mga DDS";
        
        System.out.println("\nSelect Type of Class:");
        System.out.println("1. First Class\n2. Business Class\n3. Premium Economy\n4. Economy Class");
        System.out.print("Enter Number                  :       ");   
        input3 = input.nextInt();
        
        while (!check3){
            if (input3 == 1){
                type = "First Class";
                check3 = true;
            }
            else if (input3 == 2){
                type = "Business Class";
                check3 = true;
            }
            else if (input3 == 3){
                type = "Premium Economy";
                check3 = true;
            }
            else if (input3 == 4){
                type = "Economy";
                check3 = true;
            }
            else{
                System.out.println("Invalid Answer!");
                System.out.print("Enter Number                  :       ");
                input3 = input.nextInt();
            }
        }
        
        //extra charges
        double weight;
        int num_pet, input4, input5;
        boolean insurance, check4, check5, pets;
        insurance = false;
        check4 = false;
        check5 = false;
        pets = false;
        num_pet = 0;
        
        System.out.println("\nExtra Charges:");
        System.out.print("Travel Insurance? 0/1         :       ");
        input4 = input.nextInt();
        
        while (!check4){
            if (input4 == 1){
                insurance = true;
                check4 = true;
            }
            else if (input4 == 0){
                insurance = false;
                check4 = true;
            }
            else{
                System.out.println("Invalid Answer!");
                System.out.print("Travel Insurance? 0/1         :       ");
                input4 = input.nextInt();
            }
        }
        input.nextLine();
        
        System.out.print("Enter Baggage Weight in kg    :       ");
        weight = input.nextDouble();
        System.out.print("With Pets? 0/1                :       ");
        input5 = input.nextInt();
        
        while (!check5){
            if (input5 == 1){
                pets = true;
                check5 = true;
                
                System.out.print("Enter # of Pets               :       ");
                num_pet = input.nextInt();
            }
            else if (input5 == 0){
                pets = false;
                check5 = true;
            }
            else{
                System.out.println("Invalid Answer!");
                System.out.print("With Pets? 0/1                :       ");
                input5 = input.nextInt();
            }
        }
        input.nextLine();
        
        //process input
        
        //ticket price
        double ticket_price;
        ticket_price = 0;
        
        //1 first, 2 business, 3 premium economy, 4 economy; local and international
        if (input3 == 1 && local){
            ticket_price = 60000;
        }
        else if (input3 == 2 && local){
            ticket_price = 35000;
        }
        else if (input3 == 3 && local){
            ticket_price = 12000;
        }
        else if (input3 == 4 && local){
            ticket_price = 8000;
        }
        else if (input3 == 1 && !local){
            ticket_price = 120000;
        }
        else if (input3 == 2 && !local){
            ticket_price = 90000;
        }
        else if (input3 == 3 && !local){
            ticket_price = 40000;
        }
        else if (input3 == 4 && !local){
            ticket_price = 20000;
        }
        else{
            //suntukan tayo right nyeow
        }
        
        //insurance 
        double insurance_pay;
        insurance_pay = 0;
        if (insurance){
            insurance_pay = 850;
        }
        else{
            insurance_pay = 0;
        }
        //service fee
        double service = 350; 
        //baggage fee
        double baggage = weight * 500;
        
        //airport tax 
        double tax = ticket_price * 0.05;
        
        //pet fee
        double pet_pay = num_pet * 1000;
        
        //total ticket
        double total_ticket = ticket_price * num_people;        
        //total charges
        double total = total_ticket + insurance_pay + service + baggage + pet_pay;
        
        //local or international
        String localstring;
        localstring = "edi tipaklong";
        if (local){
            localstring = "Domestic Flight";
        }
        else{
            localstring = "International Flight";
        }
        
        //Display Output
        System.out.println("\n= = = = = = = = = = = = = = = = = = = = = ");
        System.out.println("            Maharlika Airlines ");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = \n");
        
        System.out.println("\nPassenger Itenerary:");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Number of Reservee          :       " + num_people);
        System.out.println("Special Needs?              :       " + specneeds);
        System.out.println();
        System.out.println("Flight Information");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Departing From              :       " + from);
        System.out.println("Destination                 :       " + destination);
        System.out.println("Flight Class                :       " + type);
        System.out.println("Type of Flight              :       " + localstring);
        System.out.println("Flight Insurance?           :       " + insurance);  
        System.out.println("With Pets                   :       " + pets);
        System.out.println();
        System.out.println("= = = = = = = = = = = = = = = = = = = = = ");
        System.out.println();
        System.out.println("Charge Receipt:");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Individual Ticket Price     :       " + ticket_price);;
        System.out.println("Total Ticket Price          :       " + total_ticket);
        System.out.println();
        System.out.println("Extra Charges");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Service Fee                 :       " + service);
        System.out.println("Airline Tax                 :       " + tax); 
        System.out.println("Flight Insurance            :       " + insurance_pay);
        System.out.println("Baggage Fee                 :       " + baggage);
        System.out.println("Pet Extra Charge            :       " + pet_pay);
        System.out.println();
        System.out.println("= = = = = = = = = = = = = = = = = = = = = ");
        System.out.println("Total Charge                :       " + total);
        System.out.println("= = = = = = = = = = = = = = = = = = = = = ");
    }
}
