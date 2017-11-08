package codeclan.com.genericsdemo;

import java.util.ArrayList;

/**
 * Created by yanren on 08/11/2017.
 */

public class Borrower<E> {


    private ArrayList<E> borrowedStuff;

    public Borrower() {
        this.borrowedStuff = new ArrayList<>();
    }

    public void addItem(E item) {
        this.borrowedStuff.add(item);
    }

    public int numberOfItems() {
        return this.borrowedStuff.size();
    }

    public void removeItem(E it){
        this.borrowedStuff.remove(it);
    }
}
