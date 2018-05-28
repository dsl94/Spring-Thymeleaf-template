package com.intisa.intisia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.intisa.intisia.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
