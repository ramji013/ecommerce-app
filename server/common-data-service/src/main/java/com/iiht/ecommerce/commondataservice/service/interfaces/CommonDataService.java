package com.iiht.ecommerce.commondataservice.service.interfaces;

import java.util.HashMap;
import java.util.List;

import com.iiht.ecommerce.commondataservice.dto.ProductInfoDTO;
import com.iiht.ecommerce.commondataservice.entity.sql.info.ProductInfo;
import com.iiht.ecommerce.commondataservice.model.FilterAttributesResponse;
import com.iiht.ecommerce.commondataservice.model.HomeTabsDataResponse;
import com.iiht.ecommerce.commondataservice.model.MainScreenResponse;
import com.iiht.ecommerce.commondataservice.model.SearchSuggestionResponse;

public interface CommonDataService {

    MainScreenResponse getHomeScreenData(String apiName);

    FilterAttributesResponse getFilterAttributesByProducts(String queryParams);

    ProductInfoDTO getProductsByCategories(String queryParams);

    HashMap<Integer, ProductInfo> getProductsById(String queryParams);

    HomeTabsDataResponse getBrandsAndApparelsByGender(String apiName);

    SearchSuggestionResponse getSearchSuggestionList();
}

