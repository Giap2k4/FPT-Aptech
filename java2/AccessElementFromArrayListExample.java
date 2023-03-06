package array;

import java.util.ArrayList;
import java.util.List;

public class AccessElementFromArrayListExample {
    public static void main(String[] args) {
        List<String> topCompains = new ArrayList<>();
        System.out.println("Is the topCompains list empty? : "+ topCompains.isEmpty());
        topCompains.add("Goodle");
        topCompains.add("Apple");
        topCompains.add("Microsoft");
        topCompains.add("Amazon");
        topCompains.add("Facebook");

        System.out.println("Here are the top "+topCompains.size()+" compains in the world");
        System.out.println(topCompains);

        String bestCompany = topCompains.get(0);
        String secondBestCompany = topCompains.get(1);
        String lastCompany = topCompains.get(topCompains.size()-1);

        System.out.println("Best company: "+bestCompany);
        System.out.println("Second best company: "+secondBestCompany);
        System.out.println("Last company: "+lastCompany);

        topCompains.set(4,"Walmart");
        System.out.println(topCompains);

    }
}
