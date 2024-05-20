package vuhso.bookinglabor.controller;

//AUTHOR:VuHSO
//                           _
//                        _ooOoo_
//                       o8888888o
//                       88" . "88
//                       (| -_- |)
//                       O\  =  /O
//                    ____/`---'\____
//                  .'  \\|     |//  `.
//                 /  \\|||  :  |||//  \
//                /  _||||| -:- |||||_  \
//                |   | \\\  -  /'| |   |
//                | \_|  `\`---'//  |_/ |
//                \  .-\__ `-. -'__/-.  /
//              ___`. .'  /--.--\  `. .'___
//           ."" '<  `.___\_<|>_/___.' _> \"".
//          | | :  `- \`. ;`. _/; .'/ /  .' ; |
//          \  \ `-.   \_\_`. _.'_/_/  -' _.' /
//===========`-.`___`-.__\ \___  /__.-'_.'_.-'================
//                        `=--=-'
//=========== Phật phù hộ không bao giờ BUG ===================

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import vuhso.bookinglabor.dto.PostDto;
import vuhso.bookinglabor.form.PostCreateForm;
import vuhso.bookinglabor.service.PostService;

import java.util.List;

@RestController
@AllArgsConstructor
public class PostController {
    private PostService postService;

    @GetMapping("vuhso/bookinglabor/posts")
    public List<PostDto> findAll() {
        return postService.findAll();
    }

    @PostMapping("vuhso/bookinglabor/posts")
    public PostDto createPost(@RequestBody PostCreateForm form) {
        return postService.createPost(form);
    }

}
