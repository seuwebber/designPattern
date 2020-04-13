package iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext();) {
            System.out.println("Name: " + iterator.next());
        }
    }
}
