package nestedclassdemo;

public class Test {


    public static void main(String[] args) {

        CPU cpu = new CPU();

        CPU.Processor processor = cpu.new Processor();

        CPU.RAM ram = cpu.new RAM();

        System.out.println("Processor cache ="+processor.getCache());
        System.out.println("Ram clock speed = "+ram.getClockSpeed());



    }
}
