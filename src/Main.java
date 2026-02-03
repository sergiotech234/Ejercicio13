import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String>Lista = new ArrayList<>();
        Lista.add("Pepe");
        Lista.add("Ana");
        Lista.add("Antonio");
        Lista.add("Juan");
        Lista.add("Pedro");

        System.out.println("Lista original: " + Lista);
        
        Iterator<String> iterator = Lista.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.length() <= 4) {
                iterator.remove();
            }
        }
        System.out.println("Lista removida: " + Lista);
    }
}