import java.util.Scanner;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.TestExecutionListeners;

import Bean.Film;
import Dao.FilmDaoImp;
import Dao.IFilmDao;

public class T {
	@Test
	public void test(){
		String[] path={"ApplicationContext.xml"};
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(path);
		IFilmDao film = (IFilmDao) classPathXmlApplicationContext.getBean("IFilmDao");
		
		Film film2 = new Film();
		//System.out.println(film.getClass());
		Scanner scanner = new Scanner(System.in);
		classPathXmlApplicationContext.start();
		System.out.println("请输入电影名称（title）：");
		film2.setTitle(scanner.nextLine());
		System.out.println("请输入电影描述（description）：");
		film2.setDescription(scanner.nextLine());
		System.out.println("请输入语言（language_id）：");
		film2.setLanguage_id(scanner.nextLong());
		film.addFilm(film2);
		classPathXmlApplicationContext.close();
	}
}
