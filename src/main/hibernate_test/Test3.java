

import entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();

            Employee emp = new Employee("Elena", "Petrova", "Sad1", 1000);

            session.beginTransaction();
            session.persist(emp);
            session.getTransaction().commit();

            int myId = emp.getId();
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.find(Employee.class, myId);
            session.getTransaction().commit();
            System.out.println(employee);

            System.out.println("Done");


            
        }





    }
}
