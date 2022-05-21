package com.controller;

import com.entity.Friend;
import com.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/friends")
public class AppCtrl {

    @Autowired
    private FriendService friendService;

    @GetMapping("/")
    public List<Friend> allFriends() {
        return friendService.getAllFriends();
    }

    @GetMapping("/{id}")
    public Friend friendById(@PathVariable int id) {
        return friendService.getFriendById(id);
    }

    @PostMapping("/")
    public Friend addFriend(@RequestBody Friend friend) {
        friendService.saveFriend(friend);
        return friend;
    }

    @PutMapping("/")
    public Friend updateFriend(@RequestBody Friend friend) {
        friendService.updateFriend(friend);
        return friend;
    }

    @DeleteMapping("/{id}")
    public String deleteFriend(@PathVariable int id) {
        friendService.deleteFriend(id);
        return "Friend with ID = " + id + " was deleted";
    }
}
