import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.bean.CsvToBeanBuilder;


public class CsvReader {

    private List<Meal> meals;

    public CsvReader() {
        this.meals = new ArrayList<Meal>();
    }

    public List<Meal> readAndSaveToArrayList(String filePath) throws FileNotFoundException {
        meals = new CsvToBeanBuilder(new FileReader(filePath))
                .withType(Meal.class)
                .build()
                .parse();

        return meals;
    }

    public void printMeals(CsvReader reader){
        for ( Meal m : reader.meals) {
            System.out.println(m.toString());
        }

    }
}
