package operatiicrud;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import tabele.Corpuri_de_iluminat;
import tabele.HibernateUtil;

public class Corpuri_de_iluminat_manager extends HibernateUtil {

	public Corpuri_de_iluminat add(Corpuri_de_iluminat corpuri_de_iluminat) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(corpuri_de_iluminat);
		session.getTransaction().commit();
		return corpuri_de_iluminat;
	}
	public Corpuri_de_iluminat delete(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Corpuri_de_iluminat corpuri_de_iluminat = (Corpuri_de_iluminat) session.load(Corpuri_de_iluminat.class, id);
		if(null !=corpuri_de_iluminat) {
			session.delete(corpuri_de_iluminat);
		}
		session.getTransaction().commit();
		return corpuri_de_iluminat;
	}

	public List<Corpuri_de_iluminat> list() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Corpuri_de_iluminat> corpuri_de_iluminat_list = null;
		try {
			
			corpuri_de_iluminat_list = (List<Corpuri_de_iluminat>)session.createQuery("from Corpuri_de_iluminat").list();
			
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		return corpuri_de_iluminat_list;
	}
}