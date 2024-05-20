package vuhso.bookinglabor.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vuhso.bookinglabor.dto.PostDto;
import vuhso.bookinglabor.entity.Post;
import vuhso.bookinglabor.form.PostCreateForm;
import vuhso.bookinglabor.mapper.PostMapper;
import vuhso.bookinglabor.repository.PostRepository;

import java.util.LinkedList;
import java.util.List;

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

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService {
    //Service : Business Logic

    private PostRepository postRepository;

//    @Autowired
//    public PostServiceImpl(PostRepository postRepository) {
//        this.postRepository = postRepository;
//    }

    @Override
    public PostDto createPost(PostCreateForm form) {
        var post = PostMapper.map(form); //Map form to entity
        var savePost = postRepository.save(post); //Save to database
        return PostMapper.map(savePost); //Map entity to dto
    }

    @Override
    public List<PostDto> findAll() {
        var dtos = new LinkedList<PostDto>();
        for (Post post : postRepository.findAll()) {
            var dto = PostMapper.map(post);
            dtos.add(dto);
        }
        return dtos;
    }
}
