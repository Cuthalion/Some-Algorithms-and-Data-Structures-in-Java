public class DataArrayApp{

    public static void main(String[] args){

        int maxSize = 100;
        DataArray arr = new DataArray(maxSize);

        arr.insert("Tolga", "Karahan", 22);
        arr.insert("Ahmet", "Cinar", 18);
        arr.insert("Guzin", "Orman", 25);
        arr.insert("Ayse", "Fatma", 17);
        arr.insert("Can", "Gox", 25);

        arr.display();

        if(arr.find("Fatma") != null)
            System.out.println("Person is found succesfully.");
        else
            System.out.println("Person is not found.");

        arr.delete("Fatma");
        arr.delete("Cinar");

        arr.display();

    }
}
