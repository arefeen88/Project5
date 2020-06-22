package singleton;

public class Ferrari {

    private Ferrari() {}

    public static Ferrari getFerrari() {

        return new Ferrari();

    }
    public void engine(){

        System.out.println("The car engine need to be checked");
}


}
