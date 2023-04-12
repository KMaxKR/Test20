import service.Joiner;
import service.Joiners;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Joiner<String> joiner = ((first, second) -> first + " " + second);
        Joiner<Integer>  joiner1 = (((first, second) -> first + second));

        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        System.out.println(Joiners.fold(list, joiner1, () -> 0));  // result 3

        ArrayList list2 = new ArrayList();
        list2.add("Hi");
        list2.add("World");
        System.out.println(Joiners.fold(list2, joiner, () -> "")); // result "Hi World"
    }
}