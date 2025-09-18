import java.util.Scanner; 
/*
class ZooManagement {
    public static void main(String[] args) {
        int nbrCages=20 ;
	String zooName="my zoo"; 
        System.out.println(zooName + " comport " + nbrCages + " cages");
        
    }
}
*/
class ZooManagement {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int nbrCages = -1;
	while (nbrCages < 0) {
 	System.out.println("Donner nbrCages: ");
	nbrCages = sc.nextInt();
        sc.nextLine(); 
	}
	String zooName = "";
	while (zooName.trim().isEmpty() ) {
  	
	System.out.println("Donner zooName: ");
	zooName = sc.nextLine();

	}
        System.out.println(zooName + " comport " + nbrCages + " cages");
        
    }
}
