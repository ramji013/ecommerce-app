package com.iiht.ecommerce.selleraccountservice.dao.nosql;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iiht.ecommerce.selleraccountservice.entity.nosql.SellerBulkInfo;

public interface SellerBulkInfoRepository extends MongoRepository<SellerBulkInfo, Integer> {
}
