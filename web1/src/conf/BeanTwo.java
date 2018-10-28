
import org.springframework.stereotype.Component;

@Component
public class BeanTwo implements BeanInterface {
	public BeanTwo() {
		System.out.println("BeanTwo");
	}
	public void speak() {
		System.out.println("bean BeanTwo speak");
	}

}
