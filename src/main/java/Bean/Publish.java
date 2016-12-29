package Bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Event.AfterInsertFilmEvent;
import Event.BeforeInsertFilmEvent;

public class Publish {
	public void before(){
		String[] path={"ApplicationContext.xml"};
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(path);
		classPathXmlApplicationContext.publishEvent(new BeforeInsertFilmEvent(""));	
	}
	public void after(){
	String[] path={"ApplicationContext.xml"};
	ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(path);
	classPathXmlApplicationContext.publishEvent(new AfterInsertFilmEvent(""));
	}
}