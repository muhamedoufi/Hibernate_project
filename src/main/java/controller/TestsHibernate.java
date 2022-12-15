package controller;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import jakarta.servlet.http.HttpServlet;
import models.webscope.Pays;
public class TestsHibernate extends HttpServlet{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/**
* Objet Session de Hibernate
*/
private Session session;
final String VUES = "/Vue/hibernate/";

/**
* Constructeur établissant une connexion avec Hibernate
*/


public TestsHibernate() {
	
Configuration configuration = new Configuration().configure();
ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
.applySettings(configuration.getProperties()).build();
SessionFactory sessionFactory = configuration
.buildSessionFactory(serviceRegistry);
session = sessionFactory.openSession();
TestsHibernate tstHiber = new TestsHibernate();
Pays monPays = new Pays();
monPays.setCode("is");
monPays.setNom("Islande");
monPays.setLangue("islandais");


tstHiber.insertPays(monPays);
//maVue = VUES + "insertion.jsp";




}
public void insertPays(Pays pays) {
	session.beginTransaction();
	session.save(pays);
	session.getTransaction().commit();
}

}

