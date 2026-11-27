package com.sprint.mission;

import com.sprint.mission.discodeit.entity.User;

public class Main {
    public static void main(String[] args) {

        User user = new User("Eung", "eung@gmail.com", "eung");

        System.out.printf("\n---\nBefore\n---\n");
        System.out.println("식별번호: " + user.getId());
        System.out.println("생성시간: " + user.getCreatedAt());
        System.out.println("수정시간: " + user.getUpdatedAt());
        System.out.println("이름: " + user.getUsername());
        System.out.println("주소: " + user.getEmail());
        System.out.println("비밀번호: " + user.getPassword().equals("eung"));

        user.update("Seo", "seo@gmail.com", "seo");

        System.out.printf("\n---\nAfter\n---\n");
        System.out.println("식별번호: " + user.getId());
        System.out.println("생성시간: " + user.getCreatedAt());
        System.out.println("수정시간: " + user.getUpdatedAt());
        System.out.println("이름: " + user.getUsername());
        System.out.println("주소: " + user.getEmail());
        System.out.println("비밀번호: " + user.getPassword().equals("seo"));
    }
}
