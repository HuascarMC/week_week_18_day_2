package codeclan.com.genericsdemo;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by yanren on 08/11/2017.
 */

public class LibraryTest {



    @Test
    public void testAddItem(){
        Library library = new Library<Book>();
        Book book = new Book();
        library.addItem(book);
        assertEquals(1, library.numberOfItems());
    }

    @Test

    public void testIssueBook() {

    }


}
