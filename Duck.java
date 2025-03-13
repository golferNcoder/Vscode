public class Duck extends Animal {
    public String Duck;
    public Duck(String duck) {
        this.Duck= duck;
    }
    public void makeSound() {
        System.out.println("Quack");
    }
    public void move() {
        System.out.println("Swim");
    }
}