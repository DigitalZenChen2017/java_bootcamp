package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class GreetingController {
	@GetMapping("/greeting") // specific requests - gets and posts
	public String greeting(@RequestParam(name="name", required = false, 
							defaultValue="World") String name, 
							Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
}
