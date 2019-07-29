package co.grandcircus.mileagecalculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MileageCalculatorController {

	@RequestMapping("/mileage-form")
	public ModelAndView showMileageForm() {

		return new ModelAndView("mileage-form");
	}

	@RequestMapping("/mileage-result")
	public ModelAndView showMileageResult(@RequestParam("mpg") double mpg, @RequestParam("gallons") double gallons) {

		double result = mpg * gallons;
		ModelAndView mav = new ModelAndView("mileage-result");
		mav.addObject("mpg", mpg);
		mav.addObject("gallons", gallons);
		mav.addObject("result", result);
		return mav;
	}
}
