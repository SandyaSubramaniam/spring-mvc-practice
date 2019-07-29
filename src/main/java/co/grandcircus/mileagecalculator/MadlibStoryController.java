package co.grandcircus.mileagecalculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MadlibStoryController {

	@RequestMapping("/madlib-form")
	public ModelAndView showMadlibForm() {

		return new ModelAndView("madlib-form");
	}

	@RequestMapping("/madlib-story")
	public ModelAndView showMadlibStory(@RequestParam("noun") String noun,
			@RequestParam("adjective") String adjective) {

		ModelAndView mav = new ModelAndView("madlib-story");
		mav.addObject("nounInput", noun);
		mav.addObject("adjectiveInput", adjective);
		return mav;
	}
}
