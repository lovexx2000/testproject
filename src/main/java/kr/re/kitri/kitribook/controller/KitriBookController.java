package kr.re.kitri.kitribook.controller;

import kr.re.kitri.kitribook.model.Post;
import kr.re.kitri.kitribook.service.KitriBookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

@RestController
@RequestMapping("/kitribook")
public class KitriBookController {

    public static Logger logger = LoggerFactory.getLogger(KitriBookService.class);

    @Autowired
    private KitriBookService kitriBookService;

    // [GET]    /kitribook/books   .. 전체보기
    @GetMapping("/books")
    public List<Post> viewAllPosts(/*@RequestParam("size") String size
                                    ,@RequestParam("page") String page*/){
       // System.out.println("size is "+ size + " page is " + page);
        logger.debug("전체보기 수행 합니다....");
        return kitriBookService.viewPosts();
    }

    // [GET]    /kitribook/books/{bookId}   ..상세보기
    @GetMapping("/books/{bookId}")
    public Post viewPostById(@PathVariable long bookId) {
        System.out.println("path variable : " + bookId);

        return kitriBookService.viewPostById(bookId);
    }
    // [POST]   /kitribook/books  .. 글쓰기
    @PostMapping("/books")
    public Post writePost(@RequestBody Post post){
        System.out.println(post);
        kitriBookService.writePost(post);
        return post;
    }

    // [PUT]    /kitribook/books  ..글수정
    @PutMapping("/books")
    public Post updatePost(@RequestBody Post post){
        // validation check


        System.out.println(post);
        return kitriBookService.modifyPost(post);
    }
    // [DELETE] /kitribook/books/{bookId}  ..글삭제
    @DeleteMapping("/books/{bookId}")
    public long deletePost(@PathVariable long bookId){
        System.out.println(bookId);
        kitriBookService.removePost(bookId);
        return   bookId;
    }



}
