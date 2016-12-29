package Event;

import org.springframework.context.ApplicationEvent;

public class BeforeInsertFilmEvent extends ApplicationEvent{

	public BeforeInsertFilmEvent(Object source) {
		super(source);
	}
	
}
