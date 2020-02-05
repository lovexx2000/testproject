package kr.re.kitri.kitribook.dao;

import kr.re.kitri.kitribook.model.Post;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class PostDao {

    @Autowired
    private SqlSession session;

    public Post insertPost(Post post) {
        //insert into post values(\
        session.insert("kr.re.kitri.kitribook.dao.PostDao.insertPost" , post);
        System.out.println("insert ok....");
        return post;
    }
    public Post updatePost(Post post) {
        // update query\

        session.update("kr.re.kitri.kitribook.dao.PostDao.updatePost",post);
        System.out.println(" update ok");
        return post;
    }
    public long deletePost(long bookId) {
        // delete from post where bookid = bookid
        session.delete("kr.re.kitri.kitribook.dao.PostDao.deletePost" , bookId);
        System.out.println("delete ok");
        return bookId;
    }
    public List<Post> selectAllPosts() {
        // select * from post

    /*    List<Post> books = new ArrayList<>();
        Post book1 = new Post(1,"lee" , "no1" , "aaa" ,10);
        Post book2 = new Post(2, "kim" , "no2" , "bbb" ,10);
        Post book3 = new Post(3, "park" , "no3" , "bb" ,10);

        books.add(book1);
        books.add(book2);
        books.add(book3);*/
        List<Post> books =  session.selectList("kr.re.kitri.kitribook.dao.PostDao.selectAllPosts" );
        return books;
    }

    public Post selectPostByKey(long bookId) {
        //select * from book where bookid = bookid
        //Post post = new Post(4 ,"박찬호" , "투머치" , "돈많고 말많고" , 20);

        return session.selectOne("kr.re.kitri.kitribook.dao.PostDao.selectPostByKey", bookId);

    }

}
