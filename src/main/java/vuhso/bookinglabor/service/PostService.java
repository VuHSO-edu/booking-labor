package vuhso.bookinglabor.service;

import org.springframework.data.domain.Page;
import vuhso.bookinglabor.dto.PostDto;
import vuhso.bookinglabor.form.PostCreateForm;

import java.util.List;

public interface PostService {
    PostDto createPost(PostCreateForm form);
    List<PostDto> findAll();

    PostDto findById(Long id);
}
