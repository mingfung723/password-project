import java.util.Scanner;

public class Foothill
{
   // food #1 constants
   static final String FOOD_1_NAME = "pasta";
   static final int FOOD_1_CALORIES_P100G = 126;   // in calories
   static final double FOOD_1_CARBOHYDRATE_P100G = 27.9;   // in grams
   static final double FOOD_1_PROTEIN_P100G = 2.6;   // in grams
   static final double FOOD_1_FAT_P100G = 0.7;   // in grams
   static final double FOOD_1_CHOLESTROL_P100G = 0.;   // in grams
   
   // food #2 constants
   static final String FOOD_2_NAME = "egg yolk";
   static final int FOOD_2_CALORIES_P100G = 317;   // in calories
   static final double FOOD_2_CARBOHYDRATE_P100G = 3.6;   // in grams
   static final double FOOD_2_PROTEIN_P100G = 15.9;   // in grams
   static final double FOOD_2_FAT_P100G = 26.5;   // in grams
   static final double FOOD_2_CHOLESTROL_P100G = 1.234;   // in grams
   
   // food #3 constants
   static final String FOOD_3_NAME = "bacon";
   static final int FOOD_3_CALORIES_P100G = 533;  // in calories
   static final double FOOD_3_CARBOHYDRATE_P100G = 1.5;   // in grams
   static final double FOOD_3_PROTEIN_P100G = 38.3;   // in grams
   static final double FOOD_3_FAT_P100G = 40.3;   // in grams
   static final double FOOD_3_CHOLESTROL_P100G = 0.113;   // in grams
   
   //food #4 constants
   static final String FOOD_4_NAME = "parmesan cheese";
   static final int FOOD_4_CALORIES_P100G = 415;  // in calories
   static final double FOOD_4_CARBOHYDRATE_P100G = 3.4;   // in grams
   static final double FOOD_4_PROTEIN_P100G = 37.9;   // in grams
   static final double FOOD_4_FAT_P100G = 27.3;   // in grams
   static final double FOOD_4_CHOLESTROL_P100G = 0.072;   // in grams
   
   static final int SERV_LO_LIMIT = 1;
   static final int SERV_UP_LIMIT = 15;
   static final int WEIGHT_LO_LIMIT = 0;
   static final int WEIGHT_UP_LIMIT = 1500;
   static final String INDENT = "   ";
   static final String SEPARATOR = "\n";
   
   public static void main(String[] args)
   {
      String recipeName, strServ, userInputStr;
      int NUM_SERV, userInputInt;
      double totalCals, totalCarbo, totalProtein, totalFat, totalChol;
      Scanner inputStream = new Scanner(System.in);
      
      // initialize accumulator variables
      totalCals =  0;
      totalCarbo = 0.;
      totalProtein = 0.;
      totalFat = 0.;
      totalChol = 0.;
      
      // print menu
      System.out.println("---------- List of Supplies ---------");
      System.out.println(INDENT + "Food #1: " + FOOD_1_NAME);
      System.out.println(INDENT + "Food #2: " + FOOD_2_NAME);
      System.out.println(INDENT + "Food #3: " + FOOD_3_NAME);
      System.out.println(INDENT + "Food #4: " + FOOD_4_NAME + SEPARATOR);
      
      // name of recipe
      System.out.print("What are you calling this receipe ? ");
      recipeName  = inputStream.nextLine();
      System.out.print("What is the number of servings? ");
      strServ = inputStream.nextLine();
      NUM_SERV = Integer.parseInt(strServ);
      
      if (NUM_SERV < SERV_LO_LIMIT || NUM_SERV > SERV_UP_LIMIT)
      {
         System.out.println("There is an error in your input.");
      }
      else 
      {
         // food #1 ---------------------------------------------------------
         System.out.print("How many grams of " + FOOD_1_NAME + "? ");
         userInputStr = inputStream.nextLine();
         userInputInt = Integer.parseInt(userInputStr);
         if (userInputInt < WEIGHT_LO_LIMIT || userInputInt > WEIGHT_UP_LIMIT)
         {
            System.out.println("There is an error in your input.");
         }
         else 
         {
         // update accumulators
         totalCals += userInputInt * (FOOD_1_CALORIES_P100G / 100);
         totalCarbo += userInputInt * (FOOD_1_CARBOHYDRATE_P100G / 100);
         totalProtein += userInputInt * (FOOD_1_PROTEIN_P100G / 100);
         totalFat += userInputInt * (FOOD_1_FAT_P100G / 100);
         totalChol += userInputInt * (FOOD_1_CHOLESTROL_P100G / 100);
         
         // food #2 ---------------------------------------------------------
         System.out.print("How many grams of " + FOOD_2_NAME + "? ");
         userInputStr = inputStream.nextLine();
         userInputInt = Integer.parseInt(userInputStr);
         
         if (userInputInt < WEIGHT_LO_LIMIT || userInputInt > WEIGHT_UP_LIMIT)
         {
            System.out.println("There is an error in your input.");
         }
         else 
         {
         // update accumulators
         totalCals += userInputInt * (FOOD_2_CALORIES_P100G / 100);
         totalCarbo += userInputInt * (FOOD_2_CARBOHYDRATE_P100G / 100);
         totalProtein += userInputInt * (FOOD_2_PROTEIN_P100G / 100);
         totalFat += userInputInt * (FOOD_2_FAT_P100G / 100);
         totalChol += userInputInt * (FOOD_2_CHOLESTROL_P100G / 100);
         
         // food #3 ---------------------------------------------------------
         System.out.print("How many grams of " + FOOD_3_NAME + "? ");
         userInputStr = inputStream.nextLine();
         userInputInt = Integer.parseInt(userInputStr);
         
         if (userInputInt < WEIGHT_LO_LIMIT || userInputInt > WEIGHT_UP_LIMIT)
         {
            System.out.println("There is an error in your input.");
         }
         else 
         {
         // update accumulators
         totalCals += userInputInt * (FOOD_3_CALORIES_P100G / 100);
         totalCarbo += userInputInt * (FOOD_3_CARBOHYDRATE_P100G / 100);
         totalProtein += userInputInt * (FOOD_3_PROTEIN_P100G / 100);
         totalFat += userInputInt * (FOOD_3_FAT_P100G / 100);
         totalChol += userInputInt * (FOOD_3_CHOLESTROL_P100G / 100);
         
         // food #4 ---------------------------------------------------------
         System.out.print("How many grams of " + FOOD_4_NAME + "? ");
         userInputStr = inputStream.nextLine();
         userInputInt = Integer.parseInt(userInputStr);
         
         if (userInputInt < WEIGHT_LO_LIMIT || userInputInt > WEIGHT_UP_LIMIT)
         {
            System.out.println("There is an error in your input.");
         }
         else 
         {
         // update accumulators
         totalCals += userInputInt * (FOOD_4_CALORIES_P100G / 100);
         totalCarbo += userInputInt * (FOOD_4_CARBOHYDRATE_P100G / 100);
         totalProtein += userInputInt * (FOOD_4_PROTEIN_P100G / 100);
         totalFat += userInputInt * (FOOD_4_FAT_P100G / 100);
         totalChol += userInputInt * (FOOD_4_CHOLESTROL_P100G / 100);
         inputStream.close();
         
         totalCals = totalCals / NUM_SERV;
         totalCarbo = totalCarbo / NUM_SERV;
         totalProtein = totalProtein / NUM_SERV;
         totalFat = totalFat / NUM_SERV;
         totalChol = totalChol / NUM_SERV;
         
         // report results --------------------------------------------------
         System.out.println("\nNutrition for " + recipeName + "------------"); 
         System.out.println(INDENT + "Calories: " + totalCals);
         System.out.println(INDENT + "Soluble Fiber: " + totalCarbo + " grams");
         System.out.println(INDENT + "Protein: " + totalProtein + " grams");
         System.out.println(INDENT + "Fat: " + totalFat + " grams");
         System.out.println(INDENT + "Cholestrol: " + totalChol + " grams");
         }
         }
         }
         }
      }
   }
}

/*------------------------------sample run 1------------------------------
---------- List of Supplies ---------
   Food #1: pasta
   Food #2: egg yolk
   Food #3: bacon
   Food #4: parmesan cheese

What are you calling this receipe ? Luke's secret menu
What is the number of servings? 4
How many grams of pasta? 600
How many grams of egg yolk? 200
How many grams of bacon? 150
How many grams of parmesan cheese? 90

Nutrition for Luke's secret menu------------
   Calories: 577.5
   Soluble Fiber: 44.97749999999999 grams
   Protein: 34.739999999999995 grams
   Fat: 35.555 grams
   Cholestrol: 0.675575 grams
   
------------------------------sample run 2--------------------------------
---------- List of Supplies ---------
   Food #1: pasta
   Food #2: egg yolk
   Food #3: bacon
   Food #4: parmesan cheese

What are you calling this receipe ? Cheese party
What is the number of servings? 9
How many grams of pasta? 1000
How many grams of egg yolk? 300
How many grams of bacon? 200
How many grams of parmesan cheese? 1000

Nutrition for Cheese party------------
   Calories: 766.6666666666666
   Soluble Fiber: 36.3111111111111 grams
   Protein: 58.8111111111111 grams
   Fat: 48.900000000000006 grams
   Cholestrol: 0.5164444444444444 grams
------------------------------sample run 3--------------------------------
---------- List of Supplies ---------
   Food #1: pasta
   Food #2: egg yolk
   Food #3: bacon
   Food #4: parmesan cheese

What are you calling this receipe ? Carbonara
What is the number of servings? 1
How many grams of pasta? 140
How many grams of egg yolk? 243
How many grams of bacon? 8
How many grams of parmesan cheese? 5

Nutrition for Carbonara------------
   Calories: 929.0
   Soluble Fiber: 48.09799999999999 grams
   Protein: 47.236000000000004 grams
   Fat: 69.96400000000001 grams
   Cholestrol: 3.0112600000000005 grams
------------------------------sample run 4--------------------------------
---------- List of Supplies ---------
   Food #1: pasta
   Food #2: egg yolk
   Food #3: bacon
   Food #4: parmesan cheese

What are you calling this receipe ? Chef's challenge
What is the number of servings? 20
There is an error in your input.
------------------------------sample run 5--------------------------------
---------- List of Supplies ---------
   Food #1: pasta
   Food #2: egg yolk
   Food #3: bacon
   Food #4: parmesan cheese

What are you calling this receipe ? Vegetarian
What is the number of servings? 2
How many grams of pasta? 300
How many grams of egg yolk? 360
How many grams of bacon? 0
How many grams of parmesan cheese? 137

Nutrition for Vegetarian------------
   Calories: 964.0
   Soluble Fiber: 50.659 grams
   Protein: 58.481500000000004 grams
   Fat: 67.4505 grams
   Cholestrol: 2.27052 grams
-------------------------------------------------------------------------*/