package bean.transaction1;

import com.cango.db.dao.PeopleDAO;
import com.cango.db.dto.People;
import com.cango.db.service.PeopleHistoryService;
import com.cango.db.service.PeopleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Created by BJY on 2014/7/6.
 */
public class TransactionConfig_Example {
    public static void main(String[] args) {
        try {
            exercise_two_transaction3();
        }catch (Exception e) {
            System.out.println(e);
        }
        exercise1();

    }
    public static void exercise1() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TransactionConfig.class);
        applicationContext.scan("com.cango.db");
//        applicationContext.refresh();
        PeopleDAO peopleDAO = applicationContext.getBean(PeopleDAO.class);
        List<People> peoples = peopleDAO.getPeoples();
        System.out.print(peoples);
    }
    public static void exercise2() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TransactionConfig.class);
        applicationContext.scan("com.cango.db");
//        applicationContext.refresh();
        PeopleService peopleService = applicationContext.getBean(PeopleService.class);
        int resultId  = peopleService.updateName(1l, "cango_new");
        System.out.print(resultId);
    }
    public static void exercise_throw_runtime_exception() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TransactionConfig.class);
        applicationContext.scan("com.cango.db");
//        applicationContext.refresh();
        PeopleService peopleService = applicationContext.getBean(PeopleService.class);
        int resultId  = peopleService.updateNameThrowRuntimeException(1l, "cango_runtime_exception");
        System.out.print(resultId);
    }

    public static void exercise_throw_exception() throws  Exception{
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TransactionConfig.class);
        applicationContext.scan("com.cango.db");
//        applicationContext.refresh();
        PeopleService peopleService = applicationContext.getBean(PeopleService.class);
        int resultId  = peopleService.updateNameThrowException(1l, "cango_exception");
        System.out.print(resultId);
    }
    public static void exercise_throw_exception_and_with_rollbackfor() throws  Exception{
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TransactionConfig.class);
        applicationContext.scan("com.cango.db");
//        applicationContext.refresh();
        PeopleService peopleService = applicationContext.getBean(PeopleService.class);
        int resultId  = peopleService.updateNameThrowExceptionWithSetRollbackFor(1l, "updateNameThrowExceptionWithSetRollbackFor");
        System.out.print(resultId);
    }
    public static void exercise_two_transaction() throws  Exception{
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TransactionConfig.class);
        applicationContext.scan("com.cango.db");
//        applicationContext.refresh();
        PeopleHistoryService peopleService = applicationContext.getBean(PeopleHistoryService.class);
        peopleService.updatePeople();

    }
    public static void exercise_two_transaction2() throws  Exception{
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TransactionConfig.class);
        applicationContext.scan("com.cango.db");
//        applicationContext.refresh();
        PeopleHistoryService peopleService = applicationContext.getBean(PeopleHistoryService.class);
        peopleService.updatePeople_2();

    }

    public static void exercise_two_transaction3() throws  Exception{
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TransactionConfig.class);
        applicationContext.scan("com.cango.db");
//        applicationContext.refresh();
        PeopleHistoryService peopleService = applicationContext.getBean(PeopleHistoryService.class);
        peopleService.updatePeople_3();

    }

    public static void exercise_two_transaction3_2() throws  Exception{
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TransactionConfig.class);
        applicationContext.scan("com.cango.db");
//        applicationContext.refresh();
        PeopleHistoryService peopleService = applicationContext.getBean(PeopleHistoryService.class);
        peopleService.updatePeople_3_2();

    }
}
