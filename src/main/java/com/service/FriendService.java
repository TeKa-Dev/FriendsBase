package com.service;

import com.entity.Friend;

import java.util.List;

public interface FriendService {
    List<Friend> getAllFriends();

    Friend getFriendById(int id);

    void saveFriend(Friend friend);

    void updateFriend(Friend friend);

    void deleteFriend(int id);
}
