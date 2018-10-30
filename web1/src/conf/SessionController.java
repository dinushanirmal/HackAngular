

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionController {
    @RequestMapping("/Session")//"/Session"
    public String helloAdmin() {
    	System.out.println("request recieved");
        return "hello admin";
    }
}
