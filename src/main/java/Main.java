import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");

         CsvReader reader = new CsvReader();

        try {
            reader.readAndSaveToArrayList("src/main/resources/menu1.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        reader.printMeals(reader);
    }
}
