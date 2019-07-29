package co.grandcircus.mileagecalculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RepeatMessageController {

	@RequestMapping("/repeatmessage-form")
	public ModelAndView showRepeatMessageForm() {

		return new ModelAndView("repeatmessage-form");
	}

	@RequestMapping("/repeatmessage-result")
	public ModelAndView showRepeatMessage(@RequestParam("msg") String message, @RequestParam("repeat") int repeat) {

		String strOutput = "";
		for (int i = 0; i < repeat; i++) {
			strOutput += message + " ";
		}
		ModelAndView mav = new ModelAndView("repeatmessage-result");
		mav.addObject("msg", message);
		mav.addObject("repeat", repeat);
		mav.addObject("output", strOutput);
		return mav;
	}
}
