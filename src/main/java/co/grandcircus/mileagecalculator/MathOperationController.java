package co.grandcircus.mileagecalculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mathoperation")
public class MathOperationController {

	@RequestMapping("/")
	public ModelAndView showAddForm() {

		return new ModelAndView("mathoperation-form");
	}

	@RequestMapping("/result")
	public ModelAndView calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2,
			@RequestParam("operation") String operation) {

		String result = calculateResult(num1, num2, operation);
		ModelAndView mav = new ModelAndView("mathoperation-result");
		mav.addObject("num1", num1);
		mav.addObject("num2", num2);
		mav.addObject("result", result);
		return mav;
	}

	private String calculateResult(int num1, int num2, String operation) {

		String result = "";
		if (operation.equals("add"))
			result = "The sum of " + num1 + " and " + num2 + " is " + (num1 + num2);
		else if (operation.equals("sub"))
			result = "The difference of " + num1 + " and " + num2 + " is " + (num1 - num2);
		else if (operation.equals("mul"))
			result = "The product of " + num1 + " and " + num2 + " is " + (num1 * num2);
		else if (operation.equals("div")) {
			if (num2 == 0) {
				result = "Division by 0 is not allowed. Please enter a number greater than 0";
			} else {
				result = "The quotient is " + (num1 / num2) + " and the remainder is " + (num1 % num2);
			}
		}
		return result;
	}
}
