class Parent {
    void showMessage() {
        System.out.println("This is the Parent class");
    }
}

class Child1 extends Parent {
    void child1Method() {
        System.out.println("This is Child1 class");
    }
}

class Child2 extends Parent {
    void child2Method() {
        System.out.println("This is Child2 class");
    }
}

public class Inheritance7 {
    public static void main(String[] args) {
        Child1 obj1 = new Child1();
        obj1.showMessage(); // Inherited from Parent
        obj1.child1Method(); 

        Child2 obj2 = new Child2();
        obj2.showMessage(); // Inherited from Parent
        obj2.child2Method();
    }
}
