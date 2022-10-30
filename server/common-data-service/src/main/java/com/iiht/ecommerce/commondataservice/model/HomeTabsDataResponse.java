package com.iiht.ecommerce.commondataservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

import com.iiht.ecommerce.commondataservice.dto.BrandsAndApparelsDTO;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class HomeTabsDataResponse implements Serializable {

    private BrandsAndApparelsDTO men;
    private BrandsAndApparelsDTO women;
    private BrandsAndApparelsDTO boys;
    private BrandsAndApparelsDTO girls;
    private BrandsAndApparelsDTO essentials;
    private BrandsAndApparelsDTO homeAndLiving;
}