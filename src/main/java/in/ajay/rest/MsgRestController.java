package in.ajay.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/logincheck")
	public String loginPage() {
		return "Login Page";
	}
	
	@GetMapping("/contact")
	public String contactPage() {
		return "+91 12 34 56 78 90";
	}
	
	@GetMapping("/hi")
	public String sayHi() {
		return "Hi, How are you ?";
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, How are you ?";
	}
}
