import java.util.ArrayList;
import java.util.stream.Collectors;

public class Parade {
    // Initialize an ArrayList to store the clowns
    private ArrayList<Clown> parade = new ArrayList<>();

    public void addClown(Clown clown) {
        this.parade.add(clown);
    }

    public void removeClown() {
        try {
            this.parade.remove(0);
        } catch(IndexOutOfBoundsException e) {
            System.out.println("There are no clowns in the parade!");
        }
    }

    public boolean isFront(Clown clown) {
        try {
            return this.parade.get(0).equals(clown);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("There are no clowns in the parade!");
            return false;
        }
    }

    @Override
    public String toString() {

        String clowns = this.parade.stream().map(Clown::getName).collect(Collectors.joining(", "));

        return this.parade.size() == 0 ? "There are no clowns in the parade." :
               this.parade.size() == 1 ? "There is 1 clown in the parade: \n" + clowns :
               "There are " + this.parade.size() + " clowns in the parade: \n" + clowns;
    }
}
