public class Main {
    public static void main(String[] args) throws Shit {
        //System.out.println("start");
        throw new Shit("我日你妈的");

    }
}

class Shit extends Exception {
    public Shit(){
    }
    public Shit(String message){
        super(message);
    }
}
