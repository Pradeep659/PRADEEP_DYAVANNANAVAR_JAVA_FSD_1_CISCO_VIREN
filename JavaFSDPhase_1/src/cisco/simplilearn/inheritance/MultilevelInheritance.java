package cisco.simplilearn.inheritance;

class Animal {
    public  void eat() {
        System.out.println("Eat hum hum hum");
    }
}
class Dog extends Animal {
    void bark () {
        System.out.println("barking bow bow bow");
    }
}
class BabyDog extends  Dog {
    void weep() {
        System.out.println("weeping vu vu vu");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();

        d.weep();
        d.bark();
        d.eat();
    }
}