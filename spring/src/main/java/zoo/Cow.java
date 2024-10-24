package zoo;

import org.springframework.stereotype.Component;

@Component
public class Cow implements Animal{

	@Override
	public void sound() {
		System.out.println("mmaaaaahhhhhh");
		
	}

}
