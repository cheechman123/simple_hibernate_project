import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    private static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory(){

        try{
            return new Configuration().configure().buildSessionFactory();
        }catch (Throwable e){
            throw new ExceptionInInitializerError(e);
        }
    }
    public static void shutdown(){
        getSessionFactory().close();
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}



/*
static{
//        Configuration configuration = new Configuration().configure();
//
//        StandardServiceRegistryBuilder builder
//                = new StandardServiceRegistryBuilder()
//                .applySettings(configuration.getProperties());
//
//        sessionFactory = configuration.buildSessionFactory(builder.build());
}
 */