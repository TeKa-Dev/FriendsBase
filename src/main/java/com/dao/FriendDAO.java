package com.dao;

import com.entity.Friend;

import java.util.List;

public interface FriendDAO {
    List<Friend> getAllFriends();

    Friend getFriendById(int id);

    void saveFriend(Friend friend);

    void deleteFriend(int id);
}
