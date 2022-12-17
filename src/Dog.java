public class Dog extends Animal implements AnimalSpeed{

    @Override
    public void eat(){
        System.out.println("The dog is eating");
    }

    @Override
    public void sleep(){
        System.out.println("The dog is sleeping");
    }

    public void makeSound(){
        System.out.println("bark");
    }

    public void speed() {
        System.out.println("30");
    }

}
