package operatiicrud;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import tabele.HibernateUtil;
import tabele.Linkuri;

public class Linkuri_manager extends HibernateUtil {

public Linkuri add(Linkuri linkuri) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(linkuri);
		session.getTransaction().commit();
		return linkuri;
	}
	public Linkuri delete(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Linkuri linkuri = (Linkuri) session.load(Linkuri.class, id);
		if(null != linkuri) {
			session.delete(linkuri);
		}
		session.getTransaction().commit();
		return linkuri;
	}

	public List<Linkuri> list() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Linkuri> linkuri_list = null;
		try {
			
			linkuri_list = (List<Linkuri>)session.createQuery("from Linkuri").list();
			
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		return linkuri_list;
	}
	
}
