package kr.re.kitri.kitribook.controller;

import kr.re.kitri.kitribook.model.Post;
import kr.re.kitri.kitribook.service.kitriBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kitribook")
public class KitriBookController {

    @Autowired private kr.re.kitri.kitribook.service.kitriBookService kitriBookService;

    // [GET]    /kitribook/books   .. 전체보기
    @GetMapping("/books")
    public List<Post> viewAllPosts(){

        return kitriBookService.viewPosts();
    }

    // [GET]    /kitribook/books/{bookId}   ..상세보기
    @GetMapping("/books/{bookId}")
    public String viewPostById() {

        return kitriBookService.viewPostById();
    }
    // [POST]   /kitribook/books  .. 글쓰기
    // [PUT]    /kitribook/books  ..글수정
    // [DELETE] /kitribook/books/{bookId}  ..글삭제


}
