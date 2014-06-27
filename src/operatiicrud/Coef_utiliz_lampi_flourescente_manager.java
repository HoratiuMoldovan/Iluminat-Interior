package operatiicrud;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import tabele.HibernateUtil;
import tabele.Coef_utiliz_lampi_flourescente;

public class Coef_utiliz_lampi_flourescente_manager extends HibernateUtil {

	public Coef_utiliz_lampi_flourescente add(Coef_utiliz_lampi_flourescente coef_utiliz_lampi_flourescente) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(coef_utiliz_lampi_flourescente);
		session.getTransaction().commit();
		return coef_utiliz_lampi_flourescente;
	}
	public Coef_utiliz_lampi_flourescente delete(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Coef_utiliz_lampi_flourescente coef_utiliz_lampi_flourescente = (Coef_utiliz_lampi_flourescente) session.load(Coef_utiliz_lampi_flourescente.class, id);
		if(null != coef_utiliz_lampi_flourescente) {
			session.delete(coef_utiliz_lampi_flourescente);
		}
		session.getTransaction().commit();
		return coef_utiliz_lampi_flourescente;
	}

	public List<Coef_utiliz_lampi_flourescente> list() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Coef_utiliz_lampi_flourescente> coef_utiliz_lampi_flourescente_list = null;
		try {
			
			coef_utiliz_lampi_flourescente_list = (List<Coef_utiliz_lampi_flourescente>)session.createQuery("from Coef_utiliz_lampi_flourescente").list();
			
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		return coef_utiliz_lampi_flourescente_list;
	}
}