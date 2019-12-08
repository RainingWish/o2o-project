//Qinyao Zhang 12.6.2019
package o2o.dao;

import java.util.List;

import o2o.entity.Area;

public interface AreaDao {
	
	//use to return our area list
	//@return areaList
	List<Area> queryArea();
	
}
