package co.grandcircus.mileagecalculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DieRollController {

	@RequestMapping("/dieroll-form")
	public ModelAndView showDieRollForm() {

		return new ModelAndView("dieroll-form");
	}

	@RequestMapping("/dieroll-result")
	public ModelAndView showDieRollResult(@RequestParam("sides") int sides) {

		int die1 = rollDie(sides);
		int die2 = rollDie(sides);
		ModelAndView mav = new ModelAndView("dieroll-result");
		mav.addObject("die1", die1);
		mav.addObject("die2", die2);
		return mav;
	}

	public int rollDie(int sides) {

		return (int) (Math.floor(Math.random() * sides) + 1);
	}
}
