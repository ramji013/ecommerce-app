package com.iiht.ecommerce.selleraccountservice.dao.sql;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iiht.ecommerce.selleraccountservice.entity.sql.SellerInfo;

public interface SellerInfoRepository extends JpaRepository<SellerInfo, Integer> {
}
