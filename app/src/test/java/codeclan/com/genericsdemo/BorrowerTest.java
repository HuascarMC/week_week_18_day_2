package codeclan.com.genericsdemo;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by yanren on 08/11/2017.
 */

public class BorrowerTest {

    @Test
    public void testAddItem (){
        Borrower borrower = new Borrower<Book>();
        Book book = new Book();
        borrower.addItem(book);
        assertEquals(1, borrower.numberOfItems());

    }

    @Test

    public void testRemoveItem() {
        Borrower borrower = new Borrower<Book>();
        Book book = new Book();
        borrower.addItem(book);
        borrower.removeItem(book);
        assertEquals(0, borrower.numberOfItems());
    }
}
