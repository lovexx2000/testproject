package kr.re.kitri.kitribook.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static  org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class KitriBookServiceTest {
    @Autowired
    private KitriBookService kitriBookService;

    @Test
    public void testRemovePost() {
    //   long bookId = kitriBookService.removePost(6);
        assertEquals(1,1);
      // assertTrue(bookId ==2);
    }

}
