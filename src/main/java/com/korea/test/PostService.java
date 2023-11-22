package com.korea.test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    public void Delete(Long id){
        Post post = this.postRepository.findById(id).get();
        this.postRepository.delete(post);
    }
}
