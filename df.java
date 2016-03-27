/*
 * Danielle Ferriola
 * CSC 240
 * Java Prog
 * cssrs utility that will create treatment plan and intervention along with rating
 */

import java.util.Scanner;


public class df
{
	static String name[]; 
	static int age[]; 
	private static int a;
   
   public static void main(String[] args)
   {
	   
	   
       header();
       name = new String[20];
       age = new int[10];  
       Scanner two = new Scanner(System.in);
       Scanner three = new Scanner(System.in);
       nameinput();
       name[a]=two.nextLine();
       ageinput();
       age [a]=three.nextInt();
       q1();
      
      
   }

   public static void header() //method for the header
   {
       System.out.println("Welcome to Columbia-Suicide Severity Rating Scale system");
       System.out.println("This program will calculate whether the CSSRS is positive or negative.");
       System.out.println("Along with a severity rating.");
       
   }
   public static void nameinput() 
   {
	   System.out.print("Name:");
   }
   public static void ageinput() 
   {
	   System.out.print("Age:");
   }

   public static void negative() 
   {
       
       System.out.println("CSSR-S is negative");
   }
   public static void caution() 
   {
       
       System.out.println("CSSR-S is negative, but continue to monitor");
   }

   public static void q1() 
   { 
	   Scanner q1 = new Scanner(System.in);
       System.out.print("Have you wished you were dead or wished you") ;
       System.out.print("could go to sleep and not wake up? (Y/N)");
       String inputa1 = q1.nextLine();
       if(inputa1.equals("Y"))
       {
    	   q2();
       }
       if(inputa1.equals("y"))
       {
    	   q2();
       }
       else
       {
           negative();
           System.exit(0);
       }
   } 
   public static void q2() 
   { 
	   Scanner q2 = new Scanner(System.in);
       System.out.print("Have you had any thoughts of killing yourself? (Y/N)");
       String inputa2 = q2.nextLine();
       if(inputa2.equals("Y"))
       {
    	   q3();
       }
       if(inputa2.equals("y"))
       {
    	   q3();
       }
       else
       {
           negative();
           System.exit(0);
       }  
   } 
   public static void q3() 
   { 
	   Scanner q3 = new Scanner(System.in);
       System.out.print("Have you been thinking about how you might do this? (Y/N)");
       String inputa3 = q3.nextLine();
       if(inputa3.equals("Y"))
       {
    	   q4();
       }
       if(inputa3.equals("y"))
       {
    	   q4();
       }
       else
       {
           negative();
           matrix();
       }  
   } 
   public static void q4() 
   { 
	   Scanner q4 = new Scanner(System.in);
       System.out.print("Have you had these thoughts and had some intention of acting on them?(Y/N) ");
       String inputa4 = q4.nextLine();
       if(inputa4.equals("Y"))
       {
    	   q5();
       }
       if(inputa4.equals("y"))
       {
    	   q5();
       }
       else
       {
           caution();
           matrix();
       }  
   }  
   public static void q5() 
   { 
	   Scanner q5 = new Scanner(System.in);
       System.out.print("Have you started to work out or worked out the details of how to kill yourself? Do you intend to carry out this plan? (Y/N)");
       String inputa4 = q5.nextLine();
       if(inputa4.equals("Y"))
       {
    	   q6();
       }
       if(inputa4.equals("y"))
       {
    	   q6();
       }
       else
       {
    	   matrix();
       }
   } 
   public static void q6() 
   { 
	   Scanner q6 = new Scanner(System.in);
       System.out.print("Have you wished you were dead or wished you could go to sleep and not wake up? (Y/N)");
       String inputa6 = q6.nextLine();
       matrix();
   } 
   public static void matrix()
   { 
	   int total;
	  
	Scanner in = new Scanner(System.in);
	Scanner in2 = new Scanner(System.in);
	Scanner in3 = new Scanner(System.in);
	Scanner in4 = new Scanner(System.in);
	Scanner in5 = new Scanner(System.in);
	Scanner in6 = new Scanner(System.in);   
       System.out.println("Frequency"); 
       System.out.println("How many times have you had these thoughts?"); 
       System.out.println("(1) Less than once a week"); 
       System.out.println("(2) Once a week"); 
       System.out.println("(3) 2-5 times in week"); 
       System.out.println("(4) Daily or almost daily"); 
       System.out.println("(5) Many times each day");
       System.out.println("Input:");
       int num = in.nextInt();
       if (num>5)
       {
    	   num=5;
       }
       if (num<1)
       {
    	   num=0;
       }
       
       
  
	   System.out.println("Duration"); 
       System.out.println("When you have the thoughts, how long do they last?"); 
       System.out.println("(1) Fleeting - few seconds or minutes "); 
       System.out.println("(2) Less than 1 hour/some of the time "); 
       System.out.println("(3) 1-4 hours/a lot of time "); 
       System.out.println("(4) 4-8 hours/most of day "); 
       System.out.println("(5) More than 8 hours/persistent or continuous ");
       System.out.println("Input:");
       int num2 = in.nextInt();
       if (num2>5)
       {
    	   num2=5;
       }
       if (num2<1)
       {
    	   num2=0;
       }
	   System.out.println("Controllability"); 
       System.out.println("Could/can you stop thinking about killing yourself or wanting to die if you want to? "); 
       System.out.println("(1) Easily able to control thoughts"); 
       System.out.println("(2) Can control thoughts with little difficulty "); 
       System.out.println("(3) Can control thoughts with some difficulty "); 
       System.out.println("(4) Can control thoughts with a lot of difficulty "); 
       System.out.println("(5) Unable to control thoughts ");
       System.out.println("(0) Does not attempt to control thoughts");
       System.out.println("Input:");
       int num3 = in.nextInt();
       if (num3>5)
       {
    	   num3=5;
       }
       if (num3<1)
       {
    	   num=0;
       }
	   System.out.println("Deterrents "); 
       System.out.println("Are there things - anyone or anything (e.g., family, religion, pain of death) - "
       		+ "that stopped you from wanting to die or acting on thoughts of committing suicide? "); 
       System.out.println("(1) Deterrents definitely stopped you from attempting suicide"); 
       System.out.println("(2) Deterrents probably stopped you" );
       System.out.println("(3) Uncertain that deterrents stopped you"); 
       System.out.println("(4) Deterrents most likely did not stop you");
       System.out.println("(5) Deterrents definitely did not stop you"); 
       System.out.println("(0) Does not apply");
       System.out.println("Input:");
      
       int num4= in.nextInt();
       if (num4>5)
       {
    	   num4=5;
       }
       if (num4<1)
       {
    	   num4=0;
       }
	   System.out.println("Reasons for Ideation "); 
	   
	  System.out.println(" What sort of reasons did you have for thinking about wanting to die or killing yourself? Was it to end the pain or stop the way you were feeling (in other words you couldn’t go on living with this pain or how you were feeling) or was it to get attention, revenge or a reaction from others? Or both?"); 
	  System.out.println("(1) Completely to get attention, revenge or a reaction from others"); 
	  System.out.println("(2) Mostly to get attention, revenge or a reaction from others living with the pain or how you were feeling"); 
	  System.out.println("(3) Equally to get attention, revenge or a reaction from others"); 
	  System.out.println("(4) Mostly to end or stop the pain");
	  System.out.println("(5) Completely to end or stop the pain");
	  System.out.println("(0) Does not apply");
      System.out.println("Input:");

      int num5 = in.nextInt();
      if (num5>5)
      {
   	   num5=5;
      }
      if (num5<1)
      {
   	   num5=0;
      }
	  System.out.println("Reasons for Ideation "); 
	  System.out.println(" What sort of reasons did you have for thinking about wanting to die or killing yourself? Was it to end the pain or stop the way you were feeling (in other words you couldn’t go on living with this pain or how you were feeling) or was it to get attention, revenge or a reaction from others? Or both?"); 
	  System.out.println("(1) Completely to get attention, revenge or a reaction from others"); 
	  System.out.println("(2) Mostly to get attention, revenge or a reaction from others living with the pain or how you were feeling"); 
	  System.out.println("(3) Equally to get attention, revenge or a reaction from others"); 
	  System.out.println("(4) Mostly to end or stop the pain");
	  System.out.println("(5) Completely to end or stop the pain");
	  System.out.println("(0) Does not apply");
      System.out.println("Input:");
      int num6 = in.nextInt();
      if (num6>5)
      {
   	   num6=5;
      }
      if (num6<1)
      {
   	   num6=0;
      }
      total=num+num2+num3+num4+num5+num6;
      if(total>20)
      {
          high();
      }
      if(total>10 && total<20)
      {
    	  medium();
      }
      	else
      	{
          low();
      	}
   }
   public static void high() 
   { 

       System.out.println("Lethality Assessment: High");
       System.out.println("Intervention: Inpatient hospitalization or line of sight");
       System.out.println("Follow up: One day");
       System.out.println("Treatment Plan: Weekly face to face 90 days");
       System.out.println("");
   }
   public static void medium() 
   { 
	   
       System.out.println("Lethality Assessment: Medium");
       System.out.println("Intervention: Schedule follow up and document ");
       System.out.println("Follow up: 2-5 days");
       System.out.println("Treatment Plan: Bi-weekly appointments");
       System.out.println("");
   }
   public static void low() 
   { 
	   
       System.out.println("Lethality Assessment: low");
       System.out.println("Intervention: Offer services");
       System.out.println("Follow up: One week");
       System.out.println("Treatment Plan: As needed");
       System.out.println("");
   }
}