package ru.job4j.dream.store;

import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.model.Post;
import ru.job4j.dream.model.User;

import java.util.Collection;

public interface Store {

    Collection<Post> findAllPosts();

    Collection<Candidate> findAllCandidates();

    Collection<User> findAllUsers();

    void savePost(Post post);

    void saveUsers(User user);

    void saveCandidate(Candidate candidate);

    Post findByIdPost(int id);

    User findByIdUser(int id);

    User findByEmailUser(String email);

    Candidate findByIdCandidate(int id);

    void removeCandidate(int id);

    void removePost(int id);

    void clear();
}
