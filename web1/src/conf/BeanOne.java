

import org.springframework.stereotype.Component;

@Component
public class BeanOne implements BeanInterface {
	
	
	public BeanOne() {
		System.out.println("bean one");
	}
	
	public void speak() {
		System.out.println("bean one speak");
	}

}
