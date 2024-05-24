package vuhso.bookinglabor.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vuhso.bookinglabor.dto.PostDto;
import vuhso.bookinglabor.form.PostCreateForm;
import vuhso.bookinglabor.form.PostUpdateForm;

import java.util.List;

public interface PostService {
    PostDto createPost(PostCreateForm form);
    Page<PostDto> findAll(Pageable pageable);

    PostDto findById(Long id);

    PostDto update(PostUpdateForm form, Long id);

    void deleteById(Long id);
}
