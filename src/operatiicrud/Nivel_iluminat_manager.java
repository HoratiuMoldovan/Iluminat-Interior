package operatiicrud;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import tabele.Nivel_iluminat;
import tabele.HibernateUtil;

public class Nivel_iluminat_manager extends HibernateUtil {

	public Nivel_iluminat add(Nivel_iluminat nivel_iluminat) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(nivel_iluminat);
		session.getTransaction().commit();
		return nivel_iluminat;
	}
	public Nivel_iluminat delete(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Nivel_iluminat nivel_iluminat = (Nivel_iluminat) session.load(Nivel_iluminat.class, id);
		if(null != nivel_iluminat) {
			session.delete(nivel_iluminat);
		}
		session.getTransaction().commit();
		return nivel_iluminat;
	}

	public List<Nivel_iluminat> list() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Nivel_iluminat> nivel_iluminat_list = null;
		try {
			
			nivel_iluminat_list = (List<Nivel_iluminat>)session.createQuery("from Nivel_iluminat").list();
			
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		return nivel_iluminat_list;
	}

	public Nivel_iluminat selectbyId(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Nivel_iluminat nivel_iluminat = (Nivel_iluminat) session.load(Nivel_iluminat.class, id);
		session.getTransaction().commit();
		return nivel_iluminat;
	}
}
