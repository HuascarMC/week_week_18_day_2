package codeclan.com.genericsdemo;

import java.util.ArrayList;

/**
 * Created by yanren on 08/11/2017.
 */

public class Library<T> {

    private ArrayList<T> item;

    public Library() {
        this.item = new ArrayList<>();
    }

    public void addItem(T something) {
        this.item.add(something);
    }

    public void issueItem(T item) {
        this.item.remove(item);

    }

    public int numberOfItems() {
        return this.item.size();
    }



}
