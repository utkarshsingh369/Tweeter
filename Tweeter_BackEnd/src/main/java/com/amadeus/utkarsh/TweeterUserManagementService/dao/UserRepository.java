package com.amadeus.utkarsh.TweeterUserManagementService.dao;

import com.amadeus.utkarsh.TweeterUserManagementService.entities.User;
//import com.amadeus.utkarsh.TweeterUserManagementService.helper.TweetInsertHelper;
//import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;


@Component
public interface UserRepository extends CrudRepository<User,Integer>{


    @Query(
            value = "select password from user_credentials where username=:uname",
            nativeQuery = true
    )
    List<Object> getCredentialsByUsername(@Param("uname")String username);

    @Query(
            value = "select ud_id,first_name,last_name,bio,is_verified from user_details where cred_cred_id = (select cred_id from user_credentials where username=:uname)",
            nativeQuery = true
    )
    List<String> getDetailsAfterLogin(@Param("uname") String username);

    @Query(
            value = "select user_id from users where user_details_ud_id =:ud_id",
            nativeQuery = true
    )
    int getUserIdByUD(@Param("ud_id") int ud_id);

    @Query(
            value = "select count(*) from users_followers where followed_by_user_id =:user_id",
            nativeQuery = true
    )
    int getFollowingCount(@Param("user_id")int user_id);

    @Query(
            value = "select count(*) from users_followers where followers_user_id =:user_id",
            nativeQuery = true
    )
    int getFollowerCount(@Param("user_id")int user_id);

}












//    @Query(
//            value = "select ud_id, first_name,last_name, bio,is_verified from user_details " +
//                    "where ud_id in (select user_details_ud_id from users " +
//                    "where user_id in (select followers_user_id from users_followers " +
//                    "where followed_by_user_id =:nid))",
//            nativeQuery = true
//    )
//    List<Object> getFollowingsById(@Param("nid") int id);

//    @Query(
//            value = "select ud_id, first_name,last_name, bio,is_verified from user_details where ud_id in (select followed_by_user_id from users_followers where followers_user_id =:nid)",
//            nativeQuery = true
//    )
//    List<Object> getFollowersById(@Param("nid") int id);

//    @Query(
//            value = "select username from user_credentials where cred_id = (select cred_cred_id from user_details where ud_id =:ud_id)",
//            nativeQuery = true
//    )
//    String getUsernameByUD(@Param("ud_id")String ud_id);


//    @Modifying
//    @Query(
//            value = "insert into tweet (tweet_id,posted_by_user_id,caption) values (:ti,:pbui,:c)",
//            nativeQuery = true
//    )
//    @Transactional
//    void insertTweet(@Param("ti") int ti, @Param("pbui") int pbui, @Param("c") String c);


