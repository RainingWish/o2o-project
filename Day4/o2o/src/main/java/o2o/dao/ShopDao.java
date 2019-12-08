//Qinyao Zhang 12.7.2019
package o2o.dao;

import o2o.entity.Shop;

public interface ShopDao {
	
	//new shop
	int insertShop(Shop shop);
	
	//update shop information
	int updateShop(Shop shop);
}
