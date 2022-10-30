package com.iiht.ecommerce.commondataservice.model;

import lombok.*;

import java.io.Serializable;
import java.util.List;

import com.iiht.ecommerce.commondataservice.dto.SearchSuggestionForThreeAttrDTO;
import com.iiht.ecommerce.commondataservice.dto.SearchSuggestionForTwoAttrDTO;
import com.iiht.ecommerce.commondataservice.entity.sql.categories.ApparelCategory;
import com.iiht.ecommerce.commondataservice.entity.sql.categories.GenderCategory;
import com.iiht.ecommerce.commondataservice.entity.sql.categories.ProductBrandCategory;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class SearchSuggestionResponse implements Serializable {
    List<GenderCategory> genderKeywords;
    List<ProductBrandCategory> brandKeywords;
    List<ApparelCategory> apparelKeywords;
    List<SearchSuggestionForTwoAttrDTO> genderApparelKeywords;
    List<SearchSuggestionForTwoAttrDTO> genderBrandKeywords;
    List<SearchSuggestionForTwoAttrDTO> apparelBrandKeywords;
    List<SearchSuggestionForThreeAttrDTO> threeAttrKeywords;
    List<String> productKeywords;
}
