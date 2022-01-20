package com.example.mwtrade_web_api.Repositories;

import com.example.mwtrade_web_api.Entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository
        extends JpaRepository<Brand, Long> {
}
