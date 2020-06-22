package enumexample;

public class Quarter {

    public Seasons seasons;

    public Quarter(Seasons seasons){

        this.seasons = seasons;

    }

public void vacationToGo(){

    switch(seasons){

        case spring:
            System.out.println("Going to Australia");
            break;

        case summer:
            System.out.println("Going to Bahamas");
        break;

        case autumn:
            System.out.println("Going to Italy");
            break;

        case winter:
            System.out.println("Going to Bangladesh ");
            break;

        default:
            System.out.println("Going nowhere ");
            break;
    }
}


}
