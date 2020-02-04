package kr.re.kitri.kitribook.controller;

import kr.re.kitri.kitribook.model.Post;
import kr.re.kitri.kitribook.service.KitriBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kitribook")
public class KitriBookController {

    @Autowired private KitriBookService kitriBookService;

    // [GET]    /kitribook/books   .. 전체보기
    @GetMapping("/books")
    public List<Post> viewAllPosts(@RequestParam("size") String size
                                    ,@RequestParam("page") String page){
        System.out.println("size is "+ size + " page is " + page);
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
