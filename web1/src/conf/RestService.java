
import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/Rest")
public class RestService {
	
	@GetMapping("/hello")
	public String sayHello() {
		System.out.println("hello world");
		return "hello world";				
	}
	
	@GetMapping("/divide")
	public String divide(@RequestParam String firstParam, @RequestParam String secondParam) {
		System.out.println("hello world");
		
		int result=Integer.valueOf(firstParam)/Integer.valueOf(secondParam);
		
		return "hello world" + result;				
	}

	@ExceptionHandler(IllegalStateException.class)
	public String errorHandler() {
		//throw new IllegalStateException();
		System.out.println("error handleser");
		return "error occured";
	}
	
	
	/*@GetMapping("/hello")
	public String sayHelloX(@CookieValue "JSESSIONID" String cookie) {
		
		return "hello world";				
	}*/

	
	/*@RequestMapping("/cookieValue")
	  public void getCookieValue(@CookieValue "JSESSIONID" String cookie){
	}*/
}
