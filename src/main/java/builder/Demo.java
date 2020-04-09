package builder;

public class Demo {
    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal vegMeal = builder.prepareVegMeal();

        Meal nonVegMeal = builder.prepareNonVegMeal();
    }
}
