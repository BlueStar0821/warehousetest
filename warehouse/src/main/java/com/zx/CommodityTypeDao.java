package com.zx;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;
@Transactional 
@RestController
public interface CommodityTypeDao extends JpaRepository<CommodityType, String> {
	
	
	public CommodityType findBycommodityTypeNo(String commodityTypeNo);	

}
