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
    public void age(){
        System.out.println("Duck is 2 years old");
    }

}