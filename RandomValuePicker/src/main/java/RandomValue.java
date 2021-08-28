import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomValue {

    private static Random random = new Random();
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Jafar Ali");
        list.add("Rajadurai");
        list.add("Jaya Kumar");
        list.add("Anu Priya");
        list.add("Kesavan");
        list.add("Pavithra");
        list.add("Dinesh");
        list.add("Muralidharan");
        list.add("Uma");
        list.add("Srinath");

        getRandomItem(list);
    }

    private static void getRandomItem(List<String> list) {
        int index = random.nextInt(list.size());

        System.out.println("Kindly Start the session,  "+list.get(index));
    }
}
