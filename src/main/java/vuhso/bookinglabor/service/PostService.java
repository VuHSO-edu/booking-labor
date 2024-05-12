package vuhso.bookinglabor.service;

import vuhso.bookinglabor.dto.PostDto;
import vuhso.bookinglabor.form.PostCreateForm;

public interface PostService {
    PostDto createPost(PostCreateForm form);
}
