import com.kuang.pojo.Books;
import com.kuang.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HuHu
 * @version 1.0
 * @date 2022-05-27 14:36
 */
public class MyTest {
@Test
    public void test(){
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
    for (Books books : bookServiceImpl.queryAllBook()) {
        System.out.println(books);
    }


}
}
