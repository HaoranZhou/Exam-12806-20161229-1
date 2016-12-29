package Event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class BeforeListener implements ApplicationListener<ApplicationEvent>{

	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof BeforeInsertFilmEvent){
			System.out.println("Before Insert Film Data");
		}
	}
	
}
