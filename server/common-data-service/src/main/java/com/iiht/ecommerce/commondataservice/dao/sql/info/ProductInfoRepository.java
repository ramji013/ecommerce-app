package com.iiht.ecommerce.commondataservice.dao.sql.info;

import org.javatuples.Pair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.iiht.ecommerce.commondataservice.dto.SearchSuggestionForThreeAttrDTO;
import com.iiht.ecommerce.commondataservice.dto.SearchSuggestionForTwoAttrDTO;
import com.iiht.ecommerce.commondataservice.entity.sql.info.ProductInfo;
import com.iiht.ecommerce.commondataservice.model.FilterAttributesResponse;
import com.iiht.ecommerce.commondataservice.model.HomeTabsDataResponse;

import java.util.HashMap;
import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, Integer> {

    Pair<Long, List<ProductInfo>> getProductsByCategories(HashMap<String, String> conditionMap);

    List<ProductInfo> getProductsById(String[] productIds);

    FilterAttributesResponse getFilterAttributesByProducts(HashMap<String, String> conditionMap);

    HomeTabsDataResponse getBrandsAndApparelsByGender();

    List<SearchSuggestionForThreeAttrDTO> getGenderApparelBrandByIdAndName();

    List<SearchSuggestionForTwoAttrDTO> getGenderAndApparelByIdAndName();

    List<SearchSuggestionForTwoAttrDTO> getGenderAndBrandByIdAndName();

    List<SearchSuggestionForTwoAttrDTO> getApparelAndBrandByIdAndName();

    @Query(value = "SELECT DISTINCT p.name FROM ProductInfo p")
    List<String> getProductByName();
}
