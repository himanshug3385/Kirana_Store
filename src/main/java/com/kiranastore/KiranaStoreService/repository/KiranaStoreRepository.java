package com.kiranastore.KiranaStoreService.repository;

import com.kiranastore.KiranaStoreService.model.KiranaStore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface KiranaStoreRepository extends JpaRepository<KiranaStore,String> {
  // JpaRepository<Model,id-type>


}
