package operator;

public class controlStatement {
    public static void main(String[] args) {
        int num = 123456;

        if (num<100 && num>=9){
            System.out.println("Its a two digit number");
        }
        else if (num>500 && num<=400){
            System.out.println("its a three digit number ");
        }

        else if (num<1400 || num>=2000){
            System.out.println("its a four  digit number ");
        }
        else if (num ==12345){
            System.out.println("its a five digit number ");
        }
        else {
            System.out.println("this is not a number or seven digit number");
        }





    }




}
