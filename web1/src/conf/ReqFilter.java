

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Filter")
public class ReqFilter {
	
	@GetMapping("/testFilter")
	public String headerFilter(@RequestHeader(value="User-Agent") String agent) {
		System.out.println("agent"+agent);
		return agent;
	}
	
	@GetMapping("/error")
	public String error(@RequestHeader(value="User-Agent") String agent) {
		int result=Integer.valueOf(10)/Integer.valueOf(0);
		return agent;
	}
	
	@ExceptionHandler({Exception.class})
	public String handleErrors() 
	{
		System.out.println("error handling");
		return "500";
	}

}
