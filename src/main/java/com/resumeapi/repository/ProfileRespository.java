package com.resumeapi.repository;

import com.resumeapi.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRespository  extends JpaRepository<Profile, Long> {

    @Query(value = "SELECT * FROM profile ORDER BY id DESC LIMIT 1", nativeQuery = true)
    Profile findLatestProfile();



}
