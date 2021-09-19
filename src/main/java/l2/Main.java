package l2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        List<String> integerList = new ArrayList<>();
        ArrayListImp<Integer> arrayListImp = new ArrayListImp();
        System.out.println(integerList.toString());

        arrayListImp.add(5);
        arrayListImp.add(7);
        arrayListImp.add(8);
        arrayListImp.add(7);
        System.out.println(arrayListImp.toString());
        arrayListImp.remove(7);
        arrayListImp.add(17);
        System.out.println(arrayListImp.get(1));
        System.out.println(arrayListImp.toString());

    }
}
