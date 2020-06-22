package enumexample;

public class Test {
    public static void main(String[] args) {


        Quarter quarter1 = new Quarter(Seasons.autumn);
        quarter1.vacationToGo();

        Quarter quarter2 = new Quarter(Seasons.spring);
        quarter2.vacationToGo();



    }
}
