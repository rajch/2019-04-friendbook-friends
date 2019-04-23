package com.friendbooks.friendsservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.friendbooks.friendsservice.entity.FriendRequest;

@Repository
public interface FriendDAO extends JpaRepository<FriendRequest, Long> {
 
 
}