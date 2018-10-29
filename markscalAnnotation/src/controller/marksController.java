package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class marksController {
	
	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public ModelAndView helloWorld(@RequestParam("maths") int mathsMarks,
									@RequestParam("science") int scienceMarks,
									@RequestParam("english") int englishMarks) {
		int totalMarks = mathsMarks + scienceMarks + englishMarks;
		return new ModelAndView("welcome","totalMarks",totalMarks);
	}
}
