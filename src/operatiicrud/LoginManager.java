package operatiicrud;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import tabele.HibernateUtil;
import tabele.Users;

public class LoginManager extends HibernateUtil{

public List<Users> list() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Users> users_list = null;
		try {
			
			users_list = (List<Users>)session.createQuery("from Users").list();
			
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		return users_list;
	}

}
