package com.example.postbacks.repo;


import com.example.postbacks.models.PostbackLeads;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadsRepo extends JpaRepository<PostbackLeads, Long> {

}
