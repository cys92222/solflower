package solflower.choi.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String aa() {
		
		return "NewFile.jsp";
		
	}
}