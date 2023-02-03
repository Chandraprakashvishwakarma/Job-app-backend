package com.MySql.Controller;

import com.MySql.Model.Post;
import com.MySql.Service.PostService;
//import com.MySql.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
public class PostController {

    @Autowired
    private PostService postService;
//    @Autowired
//    private PostRepository repo;

//    @RequestMapping(value="/")
//    public void redirect(HttpServletResponse response) throws IOException{
//        response.sendRedirect("/swagger-ui.html");
//    }

    @RequestMapping("/home")
    public String Home(){
        return "This is Home page.\n Please use below requests: \n1. /add\n2. /getAll";
    }


//    @GetMapping("/allPosts")
//    public List<Post> getAllPosts(){
//        return repo.findAll();
//    }

//
//    @GetMapping("/allPosts/{text}")
//    public List<Post> search(@PathVariable String text){
//        return srepo.findByText(text);
//    }

//    @PostMapping("/addPost")
//    public Post addPost(@RequestBody Post post){
//        return repo.save(post);
//    }


    @PostMapping("/add")
    public Post add(@RequestBody Post post){
        postService.savePost(post);
        return post;
    }

    @GetMapping("/getAll")
    public List<Post> list(){
        return postService.getAllPosts();
    }

}
