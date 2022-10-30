package com.iiht.ecommerce.commondataservice.dao.sql.images;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.iiht.ecommerce.commondataservice.entity.sql.images.BrandImages;

import java.util.List;

public interface BrandImagesRepository extends JpaRepository<BrandImages, Integer> {

    @Query(value = "SELECT DISTINCT b FROM BrandImages b")
    List<BrandImages> getAllData();
}
