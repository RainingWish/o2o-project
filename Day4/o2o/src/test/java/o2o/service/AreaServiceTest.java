//Qinyao Zhang 12.6.2019

package o2o.service;

import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import o2o.BaseTest;
import o2o.entity.Area;

public class AreaServiceTest extends BaseTest {

	@Autowired
	private AreaService areaService;

	@Test
	public void testGetAreaList() {
		List<Area> areaList = areaService.getAreaList();

		assertEquals("Downtown", areaList.get(0).getAreaName());

	}

}
