package com.sprint.mission;

import com.sprint.mission.discodeit.entity.User;
import com.sprint.mission.discodeit.entity.Channel;
import com.sprint.mission.discodeit.entity.ChannelType;

public class Main {
    public static void main(String[] args) {

        User user = new User("Eung", "eung@gmail.com", "eung");

        System.out.printf("\n---\nUser Before\n---\n");
        System.out.println("식별번호: " + user.getId());
        System.out.println("생성시간: " + user.getCreatedAt());
        System.out.println("수정시간: " + user.getUpdatedAt());
        System.out.println("이름: " + user.getUsername());
        System.out.println("주소: " + user.getEmail());
        System.out.println("비밀번호: " + user.getPassword().equals("eung"));

        user.update("Seo", "seo@gmail.com", "seo");

        System.out.printf("\n---\nUser After\n---\n");
        System.out.println("식별번호: " + user.getId());
        System.out.println("생성시간: " + user.getCreatedAt());
        System.out.println("수정시간: " + user.getUpdatedAt());
        System.out.println("이름: " + user.getUsername());
        System.out.println("주소: " + user.getEmail());
        System.out.println("비밀번호: " + user.getPassword().equals("seo"));

        Channel publicChannel = new Channel(ChannelType.PUBLIC, "Jayu", "우린 자유다");
        Channel privateChannel = new Channel(ChannelType.PRIVATE, "Memo", "Master-Slave != Main-Admin?");

        System.out.printf("\n---\nChannel Before\n---\n");
        System.out.println("공개 식별번호: " + publicChannel.getId());
        System.out.println("공개 생성시간: " + publicChannel.getCreatedAt());
        System.out.println("공개 수정시간: " + publicChannel.getUpdatedAt());
        System.out.println("공개 타입: " + publicChannel.getType());
        System.out.println("공개 채널: " + publicChannel.getName());
        System.out.println("공개 설명: " + publicChannel.getDescription());
        System.out.println();
        System.out.println("관리 식별번호: " + privateChannel.getId());
        System.out.println("관리 생성시간: " + privateChannel.getCreatedAt());
        System.out.println("관리 수정시간: " + privateChannel.getUpdatedAt());
        System.out.println("관리 타입: " + privateChannel.getType());
        System.out.println("관리 채널: " + privateChannel.getName());
        System.out.println("관리 설명: " + privateChannel.getDescription());

        publicChannel.update("공지사항", "전체 공지 채널입니다.");
        privateChannel.update("개발일지", "관리 전용 채널입니다.");

        System.out.printf("\n---\nChannel After\n---\n");
        System.out.println("공개 식별번호: " + publicChannel.getId());
        System.out.println("공개 생성시간: " + publicChannel.getCreatedAt());
        System.out.println("공개 수정시간: " + publicChannel.getUpdatedAt());
        System.out.println("공개 타입: " + publicChannel.getType());
        System.out.println("공개 채널: " + publicChannel.getName());
        System.out.println("공개 설명: " + publicChannel.getDescription());
        System.out.println();
        System.out.println("관리 식별번호: " + privateChannel.getId());
        System.out.println("관리 생성시간: " + privateChannel.getCreatedAt());
        System.out.println("관리 수정시간: " + privateChannel.getUpdatedAt());
        System.out.println("관리 타입: " + privateChannel.getType());
        System.out.println("관리 채널: " + privateChannel.getName());
        System.out.println("관리 설명: " + privateChannel.getDescription());
    }
}
