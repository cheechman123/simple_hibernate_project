import org.hibernate.Session;

/**
 * Created by Денис on 25.11.2018.
 */
public class Main {
    public static void main(String[] args) {
        Session session =  HibernateUtil.getSessionFactory().openSession();

            session.beginTransaction();
//            TypedQuery query = session.createQuery("From hibername_computer");
//            ArrayList list = (ArrayList) query.getResultList();
//            System.out.println(Arrays.asList(list.toArray()).toString());

//            session.getTransaction().commit();


        User user = new User();
        user.setId(2);
        user.setFirstName("Denis");
        user.setLastName("Lavrenov");
        user.setAge(19);

        Computer computer = new Computer();
        computer.setId(2);
        computer.setName("Asus");
        computer.setCost(10000);


        session.save(user);
        session.save(computer);
        session.getTransaction().commit();
        HibernateUtil.shutdown();



        session.close();

//            session.getTransaction().rollback();
//
//            session.close();

    }

}
