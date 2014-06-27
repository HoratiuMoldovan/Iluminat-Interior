package operatiicrud;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import tabele.HibernateUtil;
import tabele.Users;

public class Users_manager extends HibernateUtil {

	public Users add(Users users) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(users);
		session.getTransaction().commit();
		return users;
	}
	public Users delete(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Users users = (Users) session.load(Users.class, id);
		if(null != users) {
			session.delete(users);
		}
		session.getTransaction().commit();
		return users;
	}

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
