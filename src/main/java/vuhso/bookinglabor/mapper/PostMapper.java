package vuhso.bookinglabor.mapper;

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


import vuhso.bookinglabor.dto.PostDto;
import vuhso.bookinglabor.entity.Post;
import vuhso.bookinglabor.form.PostCreateForm;

public class PostMapper {

    public static Post map(PostCreateForm form) {
        var post = new Post();
        post.setTitle(form.getTitle());
        post.setContent(form.getContent());
        post.setImage(form.getImage());
        post.setAuthor(form.getAuthor());
        post.setMinDate(form.getMinDate());
        post.setMaxDate(form.getMaxDate());
        return post;
    }

    public static PostDto map(Post post) {
        var postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setTitle(post.getTitle());
        postDto.setContent(post.getContent());
        postDto.setImage(post.getImage());
        postDto.setAuthor(post.getAuthor());
        postDto.setMinDate(post.getMinDate());
        postDto.setMaxDate(post.getMaxDate());
        postDto.setCreatedAt(post.getCreatedAt());
        postDto.setUpdatedAt(post.getUpdatedAt());
        return postDto;
    }


}
