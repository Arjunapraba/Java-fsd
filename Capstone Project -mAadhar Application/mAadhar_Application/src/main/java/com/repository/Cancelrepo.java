package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Cancel;
@Repository
public interface Cancelrepo extends JpaRepository<Cancel, String> {

}
