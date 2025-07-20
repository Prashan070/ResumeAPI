package com.resumeapi.repository;

import com.resumeapi.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    @Query(value = "SELECT * FROM contact ORDER BY id DESC LIMIT 1", nativeQuery = true)
    Contact getContactDetails();


    /*
      @Query(value = "SELECT * FROM profile ORDER BY id DESC LIMIT 1", nativeQuery = true)
    Profile findLatestProfile();

     */
}
