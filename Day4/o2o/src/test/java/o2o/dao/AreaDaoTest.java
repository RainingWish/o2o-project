//Qinyao Zhang 12.6.2019
package o2o.dao;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;

import o2o.BaseTest;
import o2o.entity.Area;

public class AreaDaoTest extends BaseTest{
	
	@Autowired
	private AreaDao areaDao;
	
	@Test
	public void testQueryArea() {
		List <Area> areaList = areaDao.queryArea();
		assertEquals(2,areaList.size());
	}

}
