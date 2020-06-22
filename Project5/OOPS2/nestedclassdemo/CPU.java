package nestedclassdemo;

public class CPU {
     //nested class

    class Processor{

       double cores;

       String producer;


       double getCache(){

           return 3.3;

       }
    }


//nested class
protected class RAM{

        double memory;
        String producer;

        double getClockSpeed(){
            return 4.4;
        }
}




}
