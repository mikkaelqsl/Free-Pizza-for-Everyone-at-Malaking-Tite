import java.util.Scanner;

public class Airport_Reservation_v2{
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
        
        String comres = "Invalid Answer!";                              //declaring invalid answer response for while loops
  
        //get personal info
        int num_people, input1;                                         //declaring vars in one line to reduce lines of code
        boolean check0, check1, specneeds;
        check1 = false;                                                 //initializing check variable as false to be later reassigned as true
        specneeds = false;
        check0 = false;

        System.out.println("\nPersonal Information:");   
        System.out.print("Enter # of Reservee           :       ");
        num_people = input.nextInt();

        while (!check0){                                                //while loop to check if answer is valid
            check0 = (num_people != 0) ? true : false;
                       
            if (!check0){                                                                         //MAKE 0 AN INVALID ANSWER FOR # OF RESERVEE
                System.out.println(comres);
                System.out.print("Enter # of Reservee           :       ");
                num_people = input.nextInt();
            }    
        }

        System.out.print("Special Needs? 0/1            :       ");
        input1 = input.nextInt();
        
        while (!check1){                                                //while loop to check if answer is valid
            check1 = (input1 == 1) ? true : (input1 == 0) ? true : false;
            specneeds = (input1 == 1) ? true : (input1 == 0) ? false : false;
            
            if (!check1){
                System.out.println(comres);
                System.out.print("Special Needs? 0/1            :       ");
                input1 = input.nextInt();
            }    
        }

        input.nextLine();

        String[] names = new String[num_people];
        for (int i = 0; i < num_people; i++){
          System.out.print("Enter Name " + (i + 1) + "                  :       ");
          names[i] = input.nextLine();
        }

        //get flight info
        String from, destination, twowaytype;
        int input2, input2a, input2b;
        boolean check2, check2a, check2b, local, twowayboolean;
        check2 = false;
        check2a = false;
        check2b = false;
        local = false;
        twowayboolean = false;
        from = "hulaan mo";                                             //initializing with a string to be later reassigned
        destination = "di ko alam pre";                                 
        twowaytype = "ganito ang rugby";

        System.out.println("\nFlight Information:");
        System.out.println("Ticket Type:");
        System.out.println("1.One Way Ticket\n2.Round Trip");
        System.out.print("Enter Number                  :       ");
        input2b = input.nextInt();

        while (!check2b){
            twowaytype =
                (input2b == 1) ? "One Way Ticket" : 
                (input2b == 2) ? "Round Trip" :
                "None";
            check2b = 
                (input2b == 1 || input2b == 2) ? true : 
                false;
            twowayboolean = 
                (input2b == 1) ? false : 
                (input2b == 2) ? true :
                false;
            if (!check2b){
                System.out.println(comres);
                System.out.print("Enter Number                  :       ");
                input2b = input.nextInt();
            }
        }

        System.out.println("\nDeparting From:       ");
        System.out.println("1. China\n2. Japan\n3. Canada\n4. Bicol\n5. Cebu ");
        System.out.print("Enter Number                  :       ");
        input2a = input.nextInt();
        
        while (!check2a){
            from =
                (input2a == 1) ? "China" : 
                (input2a == 2) ? "Japan" :
                (input2a == 3) ? "Canada" :
                (input2a == 4) ? "Bicol" :
                (input2a == 5) ? "Cebu" :
                "mikael";
            check2a = 
                (input2a >= 1 && input2a <= 5) ? true : 
                false;
            if (!check2a){
                System.out.println(comres);
                System.out.print("Enter Number                  :       ");
                input2a = input.nextInt();
            }
        }
        
        System.out.println("\nSelect Destination:");
        System.out.println("1. China\n2. Japan\n3. Canada\n4. Bicol\n5. Cebu");
        System.out.print("Enter Number                  :       ");
        input2 = input.nextInt();
        
        while (!check2){
            destination = 
                (input2 == 1) ? "China" : 
                (input2 == 2) ? "Japan" :
                (input2 == 3) ? "Canada" :
                (input2 == 4) ? "Bicol" :
                (input2 == 5) ? "Cebu" :
                "seibel";
            check2 = 
                (input2 >= 1 && input2 <= 5 && input2 != input2a) ? true : 
                false;
            local = 
                ((input2a >=1 && input2a <= 3) && (input2 == 4 || input2 == 5)) ? false :
                ((input2a == 4 || input2a == 5) && (input2a == 4 || input2a == 5)) ? true :
                false;
            if (!check2 || input2 == input2a){
              System.out.println(comres);
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
            type =
                (input3 == 1) ? "First Class      " : 
                (input3 == 2) ? "Business Class      " :
                (input3 == 3) ? "Premium Economy     " :
                (input3 == 4) ? "Economy             " :
                "santos po";
            check3 = 
                (input3 >= 1 && input3 <= 4) ? true : 
                false;
            if (!check3){
                System.out.println(comres);
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
            check4 = (input4 == 1) ? true : (input4 == 0) ? true : false;
            insurance = (input4 == 1) ? true : (input4 == 0) ? false : false;
            
            if (!check4){
                System.out.println(comres);
                System.out.print("Travel Insurance? 0/1         :       ");
                input4 = input.nextInt();
            }    
        }
        
        System.out.print("Enter Baggage Weight in kg    :       ");
        weight = input.nextDouble();
        System.out.print("With Pets? 0/1                :       ");
        input5 = input.nextInt();
        
        while (!check5){
            check5 = (input5 == 1) ? true : (input5 == 0) ? true : false;
            pets = (input5 == 1) ? true : (input5 == 0) ? false : false;
            
            if (!check5){
                System.out.println(comres);
                System.out.print("With Pets? 0/1                :       ");
                input5 = input.nextInt();
            }    
        }
        
        if (pets){
            System.out.print("Enter # of Pets               :       ");
            num_pet = input.nextInt();
        }
        
        //ticket price
        double ticket_price;
        ticket_price = 0;
        ticket_price = 
            (input3 == 1 && local) ? 60000 :                        //check if first class and local
            (input3 == 2 && local) ? 35000 :                        //if business and local
            (input3 == 3 && local) ? 12000 :                        //if premium economy and local
            (input3 == 4 && local) ? 8000 :                         //if economy and local
            (input3 == 1 && !local) ? 120000 :                      //if first and international
            (input3 == 2 && !local) ? 90000 :                       //if business and international
            (input3 == 3 && !local) ? 40000 :                       //if premium economy and international
            (input3 == 4 && !local) ? 20000 :                       //if economy and international
            0;

        //get total ticket price based on ticket type
        double twowaypay = 
            twowayboolean ? (ticket_price - (ticket_price * 0.2)) :               //20% discount if two way pay ticket is bought 
            !twowayboolean ? (ticket_price) :
            0;

        //insurance 
        double insurance_pay;
        insurance_pay = 0;
        if (insurance){                                             //conditional value for insurance_pay
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
        double total_ticket = twowaypay * num_people;        
        
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
        
        //terminal system using arrays and math random
        String[] terminal_char = {"A","B","C","D"};
        String[] terminal_num = {"1","2","3","4"};
        
        //Display Output
        System.out.println("\n= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.println("                      Maharlika Airlines ");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = \n");
        
        System.out.println("\nPassenger Itenerary:");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Number of Reservee          :       " + num_people);
        System.out.println("Special Needs?              :       " + specneeds);
        
        for (int i = 0; i < num_people; i++){
          System.out.println("Reservee Name " + (i + 1) + "             :       " + names[i]);
        }
        
        System.out.println();
        System.out.println("Flight Information");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Departing From              :       " + from);
        System.out.println("Destination                 :       " + destination);
        System.out.println("Ticket Type                 :       " + twowaytype);
        System.out.println("Flight Class                :       " + type);
        System.out.println("Type of Flight              :       " + localstring);
        System.out.println("Flight Insurance?           :       " + insurance);  
        System.out.println("With Pets?                  :       " + pets);
        System.out.println();
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
        System.out.println();
        System.out.println("Charge Receipt:");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Individual Ticket Price     :       " + twowaypay);
        System.out.println("Total Ticket Price          :       " + total_ticket);
        System.out.println();
        System.out.println("Extra Charges");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Service Fee                 :       " + service);
        System.out.println("Airline Tax                 :       " + tax); 
        System.out.println("Flight Insurance            :       " + insurance_pay);
        System.out.println("Baggage Fee                 :       " + baggage);
        System.out.println("Pet Extra Charge            :       " + pet_pay);
        System.out.println();
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
        System.out.println("Total Charge                :       " + total);
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
        System.out.println();
        System.out.println("Wait for departure at Terminal " + terminal_char[(int) (Math.random() * 4)] + terminal_num[(int) (Math.random() * 4)] + ".");
   
    }
}
