
import org.springframework.stereotype.Component;

@Component
public class Person {

	public void speak() {
		System.out.println("person speaking");
	}
	
	public Person() {
		System.out.println("person constructor");
	}
}
