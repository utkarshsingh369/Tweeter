package com.amadeus.utkarsh.TweeterUserManagementService.dao;

import com.amadeus.utkarsh.TweeterUserManagementService.dto.TweetDto;
import org.springframework.data.jpa.repository.JpaRepository;
import com.amadeus.utkarsh.TweeterUserManagementService.entities.Tweet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface TweetRepository extends JpaRepository<Tweet,Integer> {
    @Query(
            value = "select * from tweet where posted_by_user_id=:user_id",
            nativeQuery = true
    )
    List<Tweet> getTweetByUserId(@Param("user_id") int user_id);
}
