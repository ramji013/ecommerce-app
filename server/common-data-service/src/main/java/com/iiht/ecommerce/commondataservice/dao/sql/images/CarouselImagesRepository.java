package com.iiht.ecommerce.commondataservice.dao.sql.images;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.iiht.ecommerce.commondataservice.entity.sql.images.CarouselImages;

import java.util.List;

public interface CarouselImagesRepository extends JpaRepository<CarouselImages, Integer> {

    @Query(value = "SELECT DISTINCT c FROM CarouselImages c")
    List<CarouselImages> getAllData();
}
