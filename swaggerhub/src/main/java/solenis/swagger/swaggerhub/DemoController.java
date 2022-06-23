package solenis.swagger.swaggerhub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoController {

	@GetMapping("/hello")
	public String demoController() {
		return "Succcess Response from Controller";

	}
	@GetMapping("/test")
	public String demoController2() {
		return "Success from Test .... Welcome to Swagger Hub";

	}
	
	@GetMapping("/testSwagger")
	public String demoController3() {
		return "Success from TestSwagger .... Welcome to Swagger Hub 2";

	}

}
