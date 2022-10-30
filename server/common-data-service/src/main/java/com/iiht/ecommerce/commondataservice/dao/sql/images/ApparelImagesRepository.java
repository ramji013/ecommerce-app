package com.iiht.ecommerce.commondataservice.dao.sql.images;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.iiht.ecommerce.commondataservice.entity.sql.images.ApparelImages;

import java.util.List;

public interface ApparelImagesRepository extends JpaRepository<ApparelImages, Integer> {

    @Query(value = "SELECT DISTINCT c FROM ApparelImages c")
    List<ApparelImages> getAllData();
}
