class Grandfather {
    void showGrandfather() {
        System.out.println("I am the grandfather.");
    }
}

class Father extends Grandfather {
    void showFather() {
        System.out.println("I am the father.");
    }
}

class Son extends Father {
    void showSon() {
        System.out.println("I am the son.");
    }
}

public class Inheritance4 {
    public static void main(String[] args) {
        Son obj = new Son();
        obj.showGrandfather();
        obj.showFather();
        obj.showSon();
    }
}
