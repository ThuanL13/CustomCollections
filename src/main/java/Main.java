import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Creating FixedList that can hold Integers
        FixedList<Integer> numbers = new FixedList<>(3); // limits list to 3
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43); // Should fail to add
        // Displays number of items in list
        System.out.println("Number list size: " + numbers.getItems().size());
        //Displays all numbers
        System.out.println(numbers.getItems());

        // Creating FixedList for LocalDate objects
        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        //dates.add(LocalDate.now());
//        dates.add(15); // Causes compile error
        dates.add(LocalDate.of(2026, 12, 25));

        System.out.println("Date list size: " + dates.getItems().size());
        System.out.println(dates.getItems());
    }
}
