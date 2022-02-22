public class Main {

    public static void main(String[] args) {
        // Initialize empty parade
        Parade parade = new Parade();

        Clown clown1 = new Clown("Ronald");
        Clown clown2 = new Clown("Goofy");
        Clown clown3 = new Clown("Smiley");
        Clown clown4 = new Clown("Bozo");
        Clown clown5 = new Clown("Krusty");
        Clown clown6 = new Clown("Happy");
        Clown clown7 = new Clown("Nathan");

        // Add some clowns to the parade
        parade.addClown(clown1);
        parade.addClown(clown2);
        parade.addClown(clown3);
        parade.addClown(clown4);

        System.out.println(parade);

        // Remove some clowns from the front of the parade
        parade.removeClown();
        parade.removeClown();
        parade.removeClown();

        System.out.println("\n" + parade);

        parade.addClown(clown5);
        parade.addClown(clown6);
        parade.addClown(clown7);

        System.out.println("\n" + parade);

        // Test the isFront method, we expect to see "false" then "true"
        System.out.println("\n" + parade.isFront(clown7));
        System.out.println(parade.isFront(clown4));

    }
}
