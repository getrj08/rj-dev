//CanvasjsChartController.java
package com.canvasjs.chart.controllers;
 
import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import com.canvasjs.chart.services.CanvasjsChartService;
 
@Controller
@RequestMapping("/canvasjschart")
public class CanvasjsChartController {
 
	@Autowired
	private CanvasjsChartService canvasjsChartService;
 
	@RequestMapping(method = RequestMethod.GET)
	public String springMVC(ModelMap modelMap) {
		List<List<Map<Object, Object>>> canvasjsDataList = canvasjsChartService.getCanvasjsChartData();
		modelMap.addAttribute("dataPointsList", canvasjsDataList);
		return "chart";
	}
 
}  