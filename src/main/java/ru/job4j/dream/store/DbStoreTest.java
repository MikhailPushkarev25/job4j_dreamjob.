package ru.job4j.dream.store;

import org.junit.Before;
import org.junit.Test;
import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.model.Post;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DbStoreTest {

    @Before
    public void clearTables() {
        DbStore.instOf().clear();
    }

    @Test
    public void whenCreatePost() {
        Store store = DbStore.instOf();
        Post post = new Post(0, "Java Job");
        store.savePost(post);
        Post postInDb = store.findByIdPost(post.getId());
        assertThat(postInDb.getName(), is(post.getName()));
    }

    @Test
    public void whenUpdatePost() {
        Store store = DbStore.instOf();
        Post post = new Post(0, "Java Job");
        store.savePost(post);
        Post post1 = new Post(0, "Middle Job");
        store.savePost(post1);
        Post postInDb = store.findByIdPost(post1.getId());
        assertThat(postInDb.getName(), is(post1.getName()));
    }

    @Test
    public void whenDeletePost() {
        Store store = DbStore.instOf();
        Candidate candidate = new Candidate(0, "Junior Java");
        store.saveCandidate(candidate);
        Candidate candidate1 = store.findByIdCandidate(candidate.getId());
        store.removeCandidate(candidate.getId());
        assertThat(candidate1.getId(), is(candidate.getId()));
    }

    @Test
    public void whenCreateCandidate() {
        Store store = DbStore.instOf();
        Candidate candidate = new Candidate(0, "Junior Java");
        store.saveCandidate(candidate);
        Candidate candidateInDb = store.findByIdCandidate(candidate.getId());
        assertThat(candidateInDb.getName(), is(candidate.getName()));
    }

    @Test
    public void whenUpdateCandidate() {
        Store store = DbStore.instOf();
        Candidate candidate = new Candidate(0, "Middle Java");
        store.saveCandidate(candidate);
        Candidate candidate1 = new Candidate(0, "Junior Java");
        store.saveCandidate(candidate1);
        Candidate candidateInDb = store.findByIdCandidate(candidate1.getId());
        assertThat(candidateInDb.getName(), is(candidate1.getName()));
    }
}