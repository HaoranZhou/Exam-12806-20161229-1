package Event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class AfterListener implements ApplicationListener<ApplicationEvent>{

	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof AfterInsertFilmEvent){
			System.out.println("After Insert Film Data");
		}
	}

}
