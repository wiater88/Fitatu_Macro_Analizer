import com.opencsv.bean.CsvBindByName;

public class Meal {

    @CsvBindByName(column = "Produkty i potrawy")
    private String name;

    @CsvBindByName(column = "Miara użyteczna")
    private String measure;

    @CsvBindByName(column = "ilość (g)")
    private double weight;

    @CsvBindByName(column = "kalorie (kcal)")
    private double kcal;

    @CsvBindByName(column = "Białka (g)")
    private double protein;

    @CsvBindByName(column = "Zwierzęce (g)")
    private double animalProtein;

    @CsvBindByName(column = "Roślinne (g)")
    private double vegetableProtein;

    @CsvBindByName(column = "Tłuszcze (g)")
    private double fats;

    @CsvBindByName(column = "Nasycone (g)")
    private double saturatedFats;

    @CsvBindByName(column = "Jednonienasycone (g)")
    private double monounsaturatedFats;

    @CsvBindByName(column = "Wielonienasycone (g)")
    private double polyunsaturatedFats;

    @CsvBindByName(column = "Kwas omega 3 (mg)")
    private double omega3Acid;

    @CsvBindByName(column = "Kwas omega 6 (mg)")
    private double omega6Acid;

    @CsvBindByName(column = "Węglowodany (g)")
    private double carbohydrates;

    @CsvBindByName(column = "Cukry (g)")
    private double sugar;

    @CsvBindByName(column = "Cholesterol (g)")
    private double cholesterol;

    @CsvBindByName(column = "Błonnik (g)")
    private double fiber;

    @CsvBindByName(column = "Kofeina (mg)")
    private double caffeine;

    @CsvBindByName(column = "Kwas foliowy (ug)")
    private double folicAcid;

    @CsvBindByName(column = "Witamina A (ug)")
    private double vitaminA;

    @CsvBindByName(column = "Witamina B1 (mg)")
    private double vitaminB1;

    @CsvBindByName(column = "Witamina B2 (mg)")
    private double vitaminB2;

    @CsvBindByName(column = "Witamina B5 (mg)")
    private double vitaminB5;

    @CsvBindByName(column = "Witamina B6 (mg)")
    private double vitaminB6;

    @CsvBindByName(column = "Biotyna (ug)")
    private double biotin;

    @CsvBindByName(column = "Witamina B12 (ug)")
    private double vitaminB12;

    @CsvBindByName(column = "Witamina C (mg)")
    private double vitaminC;

    @CsvBindByName(column = "Witamina D (ug)")
    private double vitaminD;

    @CsvBindByName(column = "Witamina E (mg)")
    private double vitaminE;

    @CsvBindByName(column = "Witamina PP (mg)")
    private double vitaminPP;

    @CsvBindByName(column = "Witamina K (ug)")
    private double vitaminK;

    @CsvBindByName(column = "Cynk (mg)")
    private double zinc;

    @CsvBindByName(column = "Fosfor (mg)")
    private double phosphorus;

    @CsvBindByName(column = "Jod (ug)")
    private double iodine;

    @CsvBindByName(column = "Magnez (mg)")
    private double magnesium;

    @CsvBindByName(column = "Miedź (mg)")
    private double copper;

    @CsvBindByName(column = "Potas (mg)")
    private double potassium;

    @CsvBindByName(column = "Selen (ug)")
    private double selenium;

    @CsvBindByName(column = "Sód (mg)")
    private double sodium;

    @CsvBindByName(column = "Wapń (mg)")
    private double calcium;

    @CsvBindByName(column = "Żelazo (mg)")
    private double iron;

    @CsvBindByName(column = "Sól (g)")
    private double salt;

    public String getName() {
        return name;
    }

    public String getMeasure() {
        return measure;
    }

    public double getWeight() {
        return weight;
    }

    public double getKcal() {
        return kcal;
    }

    public double getProtein() {
        return protein;
    }

    public double getAnimalProtein() {
        return animalProtein;
    }

    public double getVegetableProtein() {
        return vegetableProtein;
    }

    public double getFats() {
        return fats;
    }

    public double getSaturatedFats() {
        return saturatedFats;
    }

    public double getMonounsaturatedFats() {
        return monounsaturatedFats;
    }

    public double getPolyunsaturatedFats() {
        return polyunsaturatedFats;
    }

    public double getOmega3Acid() {
        return omega3Acid;
    }

    public double getOmega6Acid() {
        return omega6Acid;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getSugar() {
        return sugar;
    }

    public double getCholesterol() {
        return cholesterol;
    }

    public double getFiber() {
        return fiber;
    }

    public double getCaffeine() {
        return caffeine;
    }

    public double getFolicAcid() {
        return folicAcid;
    }

    public double getVitaminA() {
        return vitaminA;
    }

    public double getVitaminB1() {
        return vitaminB1;
    }

    public double getVitaminB2() {
        return vitaminB2;
    }

    public double getVitaminB5() {
        return vitaminB5;
    }

    public double getVitaminB6() {
        return vitaminB6;
    }

    public double getBiotin() {
        return biotin;
    }

    public double getVitaminB12() {
        return vitaminB12;
    }

    public double getVitaminC() {
        return vitaminC;
    }

    public double getVitaminD() {
        return vitaminD;
    }

    public double getVitaminE() {
        return vitaminE;
    }

    public double getVitaminPP() {
        return vitaminPP;
    }

    public double getVitaminK() {
        return vitaminK;
    }

    public double getZinc() {
        return zinc;
    }

    public double getPhosphorus() {
        return phosphorus;
    }

    public double getIodine() {
        return iodine;
    }

    public double getMagnesium() {
        return magnesium;
    }

    public double getCopper() {
        return copper;
    }

    public double getPotassium() {
        return potassium;
    }

    public double getSelenium() {
        return selenium;
    }

    public double getSodium() {
        return sodium;
    }

    public double getCalcium() {
        return calcium;
    }

    public double getIron() {
        return iron;
    }

    public double getSalt() {
        return salt;
    }


}
