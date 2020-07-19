
abstract class Animo {
    String name;
    Boolean isPeople;
    public void talk(){
        System.out.println("Hello...");
    }
    public void set(final Animo obj) {
        this.name = obj.name;
        this.isPeople = obj.isPeople;
    }
}

class cat extends Animo {
    @Override
    public void talk() {
        System.out.println("meo meo...");
    }
}

class people extends Animo {
    @Override
    public void talk() {
        System.out.println("hello...");
    }
}

public class class_abtraction {
    public static void main(final String[] args) {
        Animo cat = new cat();
        cat.talk();
        Animo people = new people();
        people.talk();
    }
}