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
    public static final int MAX_CAGES = 25;
    Animal[] animals ;
    String name;
    String city;
    final int nbeCages;
    int nbA = 0;
    Zoo (String name, String city, int nbeCages) {
        this.name = name;
        this.city = city;
        this.nbeCages = (nbeCages > MAX_CAGES) ? MAX_CAGES : nbeCages;
        //if (nbeCages > MAX_CAGES) {
        //    this.nbeCages = MAX_CAGES;
        //} else {
        //    this.nbeCages = nbeCages;
        //}
        this.animals = new Animal[nbeCages];
    }
    boolean isFull() {
        return nbA >= nbeCages;
    }
    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbA >= z2.nbA) {
            return z1;
        } else {
            return z2;
        }
    }
    boolean addAnimal(Animal a) {
        if (nbA >= animals.length) {
            return false;
        }
        for (int i = 0; i < nbA; i++) {
            if (animals[i].name.equals(a.name)) {
                return false;
            }
        }
        animals[nbA] = a;
        nbA++;
        return true;
    }
    void displayAnimals() {
        System.out.println(" animaux" + name + ":");
        for (int i = 0; i < nbA; i++) {
            System.out.println(animals[i]);
        }
    }
    int searchAnimal(String name) {
        for (int i = 0; i < nbA; i++) {
            if (animals[i].name.equals(name)) {
                return i;
            }
        }
        return -1;
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


        //Zoo myZoo = new Zoo("zoo1","tunis",50);
        //System.out.println("Capacité max du zoo : " + myZoo.nbeCages);
        Zoo myZoo = new Zoo("zoo1","tunis",2);
        Zoo zoo1 = new Zoo("zoo1", "ariena", 5);
        //myZoo.animals[0] = lion;
        //myZoo.animals[1] = cat;
        //myZoo.animals[2] = dog;

        //myZoo.displayZoo();
        //System.out.println(myZoo);
        //System.out.println(myZoo.toString());
        //System.out.println(lion);
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(cat));
        System.out.println(myZoo.addAnimal(dog));
        //System.out.println(myZoo.addAnimal(lion));
        System.out.println("myZoo plein ? " + myZoo.isFull());
        System.out.println("zoo1 plein ? " + zoo1.isFull());
        Zoo biggest = Zoo.comparerZoo(myZoo, zoo1);
        System.out.println("Le zoo avec plus d’animaux est : " + biggest.name);
        myZoo.displayAnimals();

        //System.out.println("Recherche de 'moche' : " + myZoo.searchAnimal("moche"));
        //System.out.println("Recherche de 'banboun' : " + myZoo.searchAnimal("banboun"));

        //System.out.println(myZoo);
    }
}