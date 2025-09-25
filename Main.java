class Animal  {
    String family;
    String name;
    int age;
    boolean isMammal;
    Animal (String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public String toString() {
        return "name: " + name + " , family: " + family + ", age: " + age + ", mammifère: " + isMammal;
    }
}
class Zoo  {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbeCages;
    Zoo (String name, String city, int nbeCages) {
        this.name = name;
        this.city = city;
        this.nbeCages = nbeCages;
    }
    void displayZoo() {
        System.out.println("Zoo: " + name + " city : " + city );
        System.out.println("Nombre de cages: " + nbeCages);
    }
    public String toString() {
        return "Zoo: " + name + " , Ville: " + city + " , Cages: " + nbeCages;
    }
}
public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("lions","binou",3,true);
        Animal cat = new Animal("cats","moche",2,true);
        Animal dog = new Animal("dogs","roky",5,true);


        Zoo myZoo = new Zoo("zoo1","tunis",20);

        myZoo.animals[0] = lion;
        myZoo.animals[1] = cat;
        myZoo.animals[2] = dog;

        myZoo.displayZoo();
        //System.out.println(myZoo);
        //System.out.println(myZoo.toString());
        System.out.println(lion);
        System.out.println(myZoo);
    }
}