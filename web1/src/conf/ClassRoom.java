

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClassRoom {
	
	Person person;
	
	@Autowired
	@Qualifier("beanOne")
	BeanInterface ib;
	
	public ClassRoom(Person person) {
		System.out.println("in construcgtore");
		this.person=person;
		System.out.println("me "+this.person);
		person.speak();
		
		
	}
	
	@Autowired
	public void setPerson(Person person) {
		System.out.println("in setter");
		this.person=person;
		System.out.println("new me "+this.person);
		person.speak();
		ib.speak();
	}

}
