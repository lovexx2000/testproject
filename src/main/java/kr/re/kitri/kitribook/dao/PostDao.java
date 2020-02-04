package kr.re.kitri.kitribook.dao;

import kr.re.kitri.kitribook.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostDao {

    public void insertPost() {

    }
    public void updatePost() {

    }
    public void deletePost() {

    }
    public List<Post> selectAllPosts() {
        // select * from post

        List<Post> books = new ArrayList<>();
        Post book1 = new Post("lee" , "no1" , "aaa" ,10);
        Post book2 = new Post("kim" , "no2" , "bbb" ,10);
        Post book3 = new Post("park" , "no3" , "bb" ,10);

        books.add(book1);
        books.add(book2);
        books.add(book3);

        return books;
    }
    public String selectPostByKey() {

        return "post by key";
    }

}
