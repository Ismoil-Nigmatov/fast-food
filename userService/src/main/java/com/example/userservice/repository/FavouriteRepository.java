package com.example.userservice.repository;

import com.example.userservice.entity.Favourite;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author "ISMOIL NIGMATOV"
 * @created 6:12 PM on 8/13/2022
 * @project fast-food
 */
public interface FavouriteRepository extends JpaRepository<Favourite,Long> {
    @Query("select f from Favourite f where f.user.id = ?1")
    Page<Favourite> findAllByUser_Id(Long user_id, Pageable pageable);
}
