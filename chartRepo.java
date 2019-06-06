//CanvasjsChartDao.java
package com.canvasjs.chart.daos;
 
import java.util.List;
import java.util.Map;
 
public interface CanvasjsChartDao {
 
	List<List<Map<Object, Object>>> getCanvasjsChartData();
 
}
 
//CanvasjsChartDaoImpl.java
package com.canvasjs.chart.daos;
 
import java.util.List;
import java.util.Map;
 
import com.canvasjs.chart.data.CanvasjsChartData;
 
public class CanvasjsChartDaoImpl implements CanvasjsChartDao {
 
	@Override
	public List<List<Map<Object, Object>>> getCanvasjsChartData() {
		return CanvasjsChartData.getCanvasjsDataList();
	}
 
}