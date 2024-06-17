package com.example.demo.reopository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


import org.springframework.stereotype.Repository;


import com.example.demo.model.Result;

@Repository
public interface ResultRepo extends JpaRepository<Result,Integer> {

	 @Query(value = "SELECT result FROM result " +
             "WHERE CONCAT(date, ' ', time) BETWEEN :startTime AND :endTime " +
             "ORDER BY date DESC, time DESC " +
             "LIMIT 5", nativeQuery = true)
List<String> findLastFiveMinutesResults(@Param("startTime") String startTime, @Param("endTime") String endTime);
	 
	 @Query(value = "SELECT result FROM result " +
             "WHERE date = CURDATE() " +
             "AND time = (SELECT MAX(time) FROM result " +
                         "WHERE date = CURDATE() " +
                         "AND time <= :currentISTTime) " +
             "LIMIT 1", nativeQuery = true)
	 	String findLatestResult(@Param("currentISTTime") String currentISTTime);
}
