public class Main {

    public static void main(String[] args) {

        // Create a Box, "box1", containing five names
        Box<String> box1 = new Box<>();
        String[] names = {"Tony", "Claudia", "Olivia", "Christiana", "Karryn"};
        for(String name : names) box1.add(name);

        // Create a Box, "box2", containing the numbers 1 to 5
        Box<Integer> box2 = new Box<>();
        int[] numbers = {1, 2, 3, 4, 5};
        for(int number : numbers) box2.add(number);

        // Print the two boxes using their toString methods
        System.out.println("Box 1: \n" + box1);
        System.out.println("\nBox 2: \n" + box2 + "\n");

        // Each name in box1 will get a random seat from box2
        while (!box1.isEmpty()) {
            System.out.println(box1.drawItem() + " gets seat " + box2.drawItem());
        }
    }
}
