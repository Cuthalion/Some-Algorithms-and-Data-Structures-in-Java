public class ObjectSortApp{

      public static void main(String[] args){

            int maxSize = 100;
            ObjectArray people = new ObjectArray(maxSize);

            people.insert("Patty", "Evans", 24);
            people.insert("Doc", "Smith", 59);
            people.insert("Lorraine", "Smith", 37);
            people.insert("Tolga", "Karahan", 22);
            people.insert("Jose", "Velasquez", 72);
            people.insert("RTE", "RTE", 65);
            people.insert("Zinedine", "Zidane", 45);
            people.insert("Georghe", "Hagi", 52);


            System.out.printf("Before sorting:%n%n");
            people.display();

            people.insertionSort();

            System.out.printf("%n%nAfter sorting:%n%n");
            people.display();

      }
}
