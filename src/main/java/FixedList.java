import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private List<T> items; // Stores items added to list
    private int maxSize; // Limits number of max items

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }
    // Method to add items to list
    public boolean add(T item) {
        if (items.size() < maxSize) { // If list has room
            items.add(item); // Adds item
            return true; // && returns true
        }
        System.out.println("The list is full, cannot add anymore items."); // If list is full
        return false; // Shows item was not added
    }
    // Getter to return list of items
    public List<T> getItems() {
        return items;
    }
}
