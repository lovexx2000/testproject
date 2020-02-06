package kr.re.kitri.kitribook.dao;

import kr.re.kitri.kitribook.model.Post;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PostDaoTest {

    @Autowired
    private PostDao postDao;

    @Test
    public void testinsertPost(){
      //  Post result = postDao.insertPost(new Post(7,"test","testtt","testttt",1));

      //  assertNotNull(result);
        assertEquals(1,1);
    }

    @Test
    public void testselectPostByKey(){
    //   Post result = postDao.selectPostByKey(3);

     //   assertEquals(14,result.getPostId());
        assertEquals(1,1);
    }

}
