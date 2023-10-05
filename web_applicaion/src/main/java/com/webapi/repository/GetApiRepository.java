package com.webapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapi.model.GetApi;

@Repository
public interface GetApiRepository extends JpaRepository<GetApi, Long> {
    
}
