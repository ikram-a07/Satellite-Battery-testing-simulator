import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner scanner = new Scanner (System.in);

      // creating a suitable title

      System.out.println("===============================================================");
      System.out.println("                     Satellite Battery Tester                  ");
      System.out.println("===============================================================");
      System.out.println();

      System.out.print("Voltage: ");
      double voltage = scanner.nextDouble();

      System.out.print("Current: ");
      double current = scanner.nextDouble();

      System.out.print("Temperature: ");
      double temperature = scanner.nextDouble();

      System.out.print("Charge: ");
      double charge = scanner.nextDouble();


      //creating a title for the test results 

      System.out.println();
      System.out.println("TEST RESULTS");
      System.out.println("----------------------------------------------------------------");


      // voltage PASS, WARNING and FAIL statements

      boolean voltagePassed = false ;
      boolean voltageWarning = false;
      boolean anyFailed = false;

      if( voltage>= 26 && voltage<= 32) {
        System.out.println("Voltage: " + voltage + " PASS");
        voltagePassed =true;
      }
      else if (voltage>= 24 && voltage<26){
        System.out.println("Voltage: " + voltage + " WARNING");
        voltageWarning = true;
      }
      else if(voltage>32 && voltage<=34){
        System.out.println("Voltage: " + voltage + " WARNING");
        voltageWarning = true;
      }
      else{
        System.out.println("Voltage: " + voltage + " FAIL");
        anyFailed= true;
      }

      //Current PASS, WARNING and FAIL statements

      boolean currentPassed = false;
      boolean currentWarning = false;
     
      
      if(current>= 0 && current<=20){
        System.out.println("Current: " + current + " PASS");
        currentPassed = true;
      }
      else if(current>20 && current<=25){
       System.out.println("Current: " + current + " WARNING");
       currentWarning = true;
      }
      else{
        System.out.println("Current: " + current + " FAIL");
        anyFailed = true;
      }

      //Temperature PASS, WARNING and FAIL statements

      boolean temperaturePassed = false;
      boolean temperatureWarning = false;
      

      if(temperature>=0 && temperature<=40){
        System.out.println("Temperature: " + temperature + " PASS");
        temperaturePassed = true;
      }
      else if(temperature<0 && temperature>=-20){
        System.out.println("Temperature: " + temperature + " WARNING");
        temperatureWarning =true;
      }
      else if(temperature>=40 && temperature<=60){
        System.out.println("Temperature: " + temperature + " WARNING");
        temperatureWarning =true;
      }
      else{
        System.out.println("Temperature: " + temperature + " FAIL");
        anyFailed = true;
      }

      //Charge PASS, WARNING and FAIL statements

      boolean chargePassed = false;
      boolean chargeWarning = false;
      

      if(charge>=20 && charge<=100){
        System.out.println("Charge: " + charge + " PASS");
        chargePassed = true;
      }
      else if(charge>=10 && charge<20){
        System.out.println("Charge: " + charge + " WARNING");
        chargeWarning = true;
      }
      else{
        System.out.println("Charge: " + charge + " FAIL");
        anyFailed = true;
      }

      //title for the overall outcome
      System.out.println();
      System.out.println("----------------------------------------------------------------");

      // seting the if statements for the overall result

      if( anyFailed){
        System.out.println ("OVERALL RESULT: FAIL");
      }
      else if(voltageWarning || currentWarning || temperatureWarning || chargeWarning){
        System.out.println("OVERALL RESULT: WARNING");
      }
      else{
        System.out.println("OVERALL RESULT: PASS");
      }

      System.out.println("================================================================");

      // anomaly explanations for each 

      if(!voltagePassed && !voltageWarning){
        System.out.println ();
        System.out.println ("ANOMALY DETECTED !");
        System.out.println ("----------------------------------------------------------------");
        System.out.println ("Battery voltage is OUTSIDE the acceptable operating range");
        System.out.println ("Expected:24 V-34 V");
        System.out.println();
        System.out.println ("Actual: " + voltage + "V");   
        System.out.println();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
      }

      if(!currentPassed && !currentWarning){
        System.out.println ();
        System.out.println ( "ANOMALY DETECTED !");
        System.out.println ("----------------------------------------------------------------");
        System.out.println ("Battery current is OUTSIDE the acceptable operating range");
        System.out.println("Expected: 0 A - 25 A");
        System.out.println();
        System.out.println("Actual: " + current + "A");
        System.out.println();
      }

      if(!temperaturePassed && !temperatureWarning ){
        System.out.println();
        System.out.println("ANOMALY DETECTED !");
        System.out.println ("----------------------------------------------------------------");
        System.out.println ("Battery temperature is OUTSIDE the acceptable operating range");
        System.out.println("Expected: -20 deg C - 60 deg C");
        System.out.println();
        System.out.println( "Actual: " + temperature + " deg C");
        System.out.println();
      }

       if(!chargePassed && !chargeWarning ){
        System.out.println();
        System.out.println("ANOMALY DETECTED !");
        System.out.println ("----------------------------------------------------------------");
        System.out.println ("Battery charge is OUTSIDE the acceptable operating range");
        System.out.println("Expected: 10% - 100%");
        System.out.println();
        System.out.println( "Actual: " + charge + "%");
        System.out.println();
      }






    }
}