package com.iiht.ecommerce.commondataservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

import com.iiht.ecommerce.commondataservice.dto.ApparelImagesDTO;
import com.iiht.ecommerce.commondataservice.dto.BrandImagesDTO;
import com.iiht.ecommerce.commondataservice.entity.sql.images.CarouselImages;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MainScreenResponse implements Serializable {

    private List<BrandImagesDTO> brands;
    private List<ApparelImagesDTO> apparels;
    private List<CarouselImages> carousels;

    public MainScreenResponse(List<BrandImagesDTO> brands,
                              List<ApparelImagesDTO> apparels,
                              List<CarouselImages> carousels) {
        this.brands = brands;
        this.apparels = apparels;
        this.carousels = carousels;
    }
}
