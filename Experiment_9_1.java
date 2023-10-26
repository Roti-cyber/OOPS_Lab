import java.util.ArrayList;

class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Magenta");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println("ArrayList: " + colors);
        System.out.println("Element at index 1:" + colors.get(1));
        System.out.println("Is the ArrayList empty?" + colors.isEmpty());
        System.out.println("Size of the ArrayList:" + colors.size());
        colors.remove("Green");
        System.out.println("After removing 'Green':" + colors);
        colors.remove(1);
        System.out.println("After removing the element at index 1:" + colors);
        System.out.println("Does 'Blue' exist in the ArrayList?" + colors.contains("Blue"));
        colors.clear();
        System.out.println("After clearing the ArrayList:" + colors);
    }
}
