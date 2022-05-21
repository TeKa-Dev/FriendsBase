package com.service;

import com.dao.FriendDAO;
import com.entity.Friend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FriendServiceImpl implements FriendService{

    @Autowired
    private FriendDAO friendDAO;

    @Override
    @Transactional
    public List<Friend> getAllFriends() {
        return friendDAO.getAllFriends();
    }

    @Override
    @Transactional
    public Friend getFriendById(int id) {
        return friendDAO.getFriendById(id);
    }

    @Override
    @Transactional
    public void saveFriend(Friend friend) {
        friendDAO.saveFriend(friend);
    }

    @Override
    @Transactional
    public void updateFriend(Friend friend) {
        friendDAO.saveFriend(friend);
    }

    @Override
    @Transactional
    public void deleteFriend(int id) {
        friendDAO.deleteFriend(id);
    }
}
