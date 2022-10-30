package com.iiht.ecommerce.selleraccountservice.service;


import com.iiht.ecommerce.selleraccountservice.entity.nosql.SellerBulkInfo;
import com.iiht.ecommerce.selleraccountservice.entity.sql.SellerInfo;

public interface SellerAccountDataService {

    public SellerInfo findSellerById(Integer sellerId);

    public void save();

    public void saveInMongo();

    public SellerBulkInfo findMongoAddressById();
}

