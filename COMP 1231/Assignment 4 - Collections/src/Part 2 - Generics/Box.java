import java.util.ArrayList;
import java.util.stream.Collectors;

public class Box<T> {

        private final ArrayList<T> box = new ArrayList<>();

        public void add(T item) {
                this.box.add(item);
        }

        // This method will remove a random element from the box and return it.
        // If the box is empty, it will return null.
        public T drawItem() {
                if(this.isEmpty()) return null;

                int randomIndex = (int) (Math.random() * this.box.size());
                return this.box.remove(randomIndex);
        }

        // Return true if the box is empty and false otherwise
        public boolean isEmpty() {
                return this.box.isEmpty();
        }

        // Nicely display the contents of the box.
        @Override
        public String toString() {
                return this.box.size() == 0 ? "The box is empty!" :
                        box.stream().map(T::toString).collect(Collectors.joining(", "));
        }
}
