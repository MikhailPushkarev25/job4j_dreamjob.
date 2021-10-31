package ru.job4j.dream.store;

import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.model.Post;
import ru.job4j.dream.model.User;

public class MainStore {
    public static void main(String[] args) {
        Store store = DbStore.instOf();
//        store.savePost(new Post(0, "Java Job"));
//        for (Post post : store.findAllPosts()) {
//            System.out.println(post.getId() + " " + post.getName());
//        }
//        System.out.println();
//        System.out.println(store.findByIdCandidate(2).getName());
//        System.out.println(store.findByIdPost(2).getName());
//        System.out.println();
//        for (Candidate candidate : store.findAllCandidates()) {
//            System.out.println(candidate.getId() + " " + candidate.getName());
//        }

        store.saveUsers(new User(0, "Java Job", "we@mail.ru", "123"));
           for (User user : store.findAllUsers()) {
               System.out.println(user.getId() + " " + user.getName() + " " + user.getEmail() + " " + user.getPassword());
           }

    }
}
