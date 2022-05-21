package com.dao;

import com.entity.Friend;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class FriendDAOImpl implements FriendDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Friend> getAllFriends() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Friend", Friend.class).getResultList();
    }

    @Override
    public Friend getFriendById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Friend.class, id);
    }

    @Override
    public void saveFriend(Friend friend) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(friend);
    }

    @Override
    public void deleteFriend(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Friend> query = session.createQuery("delete from Friend where id = :fID");
        query.setParameter("fID", id);
        query.executeUpdate();
    }
}
