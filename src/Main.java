public class Main {

    public static void main(String[] args) {
        Data data = new Data();
        data.setAge(10);
        data.setWeight(28);
        data.setType("Dog");
        data.description();

        Dog dog = new Dog();
        Cat cat = new Cat();

        test(dog);
        test(cat);

        dog.makeSound();
        cat.makeSound();

    }

    public static void test(Animal animal){
        animal.sleep();
    }

}

class Data {
    private int age;
    private int weight;
    private String type;

    public void setAge(int dataAge){
        if (dataAge<0){
            System.out.println("Error: The age is less than 0");
        }
        else {
            age = dataAge;
        }
    }

    public int getAge(){
        return age;
    }

    public void setWeight(int dataWeight){
        if (dataWeight<0){
            System.out.println("Error: The weight is less than 0");
        }
        else {
            weight = dataWeight;
        }
    }

    public int dataWeight(){
        return weight;
    }

    public void setType(String dataType){
        if (dataType.isEmpty()){
            System.out.println("Error: The field is empty");
        }
        else {
            type = dataType;
        }
    }

    public String getType(){
        return type;
    }

    void description(){
        System.out.println("Number: " + age + ", " + "Size: " + weight + ", " + "Type: " + type);
    }
}
