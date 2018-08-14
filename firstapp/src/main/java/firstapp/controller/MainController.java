package firstapp.controller;

import firstapp.service.TestService;
import firstapp.domain.Seed;
import firstapp.service.SeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@Autowired
	private TestService testService;

	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String springTest() {
		return testService.test();
	}

	@Autowired
	private SeedService seedService;

	@RequestMapping(value = "seed")
	public ModelAndView mybatis() throws Exception {
		Seed seed = seedService.selectByID(1);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("seed", seed);

		modelAndView.setViewName("seed");
		return modelAndView;
	}
}
