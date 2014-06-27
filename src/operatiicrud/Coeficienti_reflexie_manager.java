package operatiicrud;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import tabele.HibernateUtil;
import tabele.Coeficienti_reflexie;


public class Coeficienti_reflexie_manager extends HibernateUtil {

	public Coeficienti_reflexie add(Coeficienti_reflexie coeficienti_reflexie) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(coeficienti_reflexie);
		session.getTransaction().commit();
		return coeficienti_reflexie;
	}
	public Coeficienti_reflexie delete(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Coeficienti_reflexie coeficienti_reflexie = (Coeficienti_reflexie) session.load(Coeficienti_reflexie.class, id);
		if(null != coeficienti_reflexie) {
			session.delete(coeficienti_reflexie);
		}
		session.getTransaction().commit();
		return coeficienti_reflexie;
	}

	public List<Coeficienti_reflexie> list() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Coeficienti_reflexie> coeficienti_reflexie_list = null;
		try {
			
			coeficienti_reflexie_list = (List<Coeficienti_reflexie>)session.createQuery("from Coeficienti_reflexie").list();
			
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		return coeficienti_reflexie_list;
	}
}
