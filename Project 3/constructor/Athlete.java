package constructor;

public class Athlete{

    static String name;
    static int age;
    String nationality;


    Athlete(String name ,int age ){
        this.name = name;
        this.age = age;



    }
    Athlete (String name ,int age ,String nationality){
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

   public static void display1(){

        System.out.println("Name ="+name );
        System.out.println("Age ="+age);

    }
    public void display2(){
        display1();
        System.out.println("Nationality ="+nationality);

    }



    }

















