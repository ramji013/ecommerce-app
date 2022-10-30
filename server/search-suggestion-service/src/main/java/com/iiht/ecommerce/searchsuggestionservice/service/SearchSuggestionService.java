package com.iiht.ecommerce.searchsuggestionservice.service;

import java.util.List;

import com.iiht.ecommerce.searchsuggestionservice.dto.SearchSuggestionKeywordInfo;

public interface SearchSuggestionService {
    void loadSearchSuggestionToMap();

    List<SearchSuggestionKeywordInfo> searchKeywordFromMap(String q);

    List<SearchSuggestionKeywordInfo> getDefaultSearchSuggestions();
}

