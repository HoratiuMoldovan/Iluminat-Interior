package operatiicrud;

import java.util.List;

import tabele.Nivel_iluminat;
import operatiicrud.Nivel_iluminat_manager;
import com.opensymphony.xwork2.ActionSupport;

public class Nivel_iluminat_action extends ActionSupport{ 

	private static final long serialVersionUID = 9149826260758390091L;
	private Nivel_iluminat nivel_iluminat;
	private List<Nivel_iluminat> nivel_iluminat_list;
	private Long id;
	private Nivel_iluminat_manager linkController;

	public Nivel_iluminat_action() {
		linkController = new Nivel_iluminat_manager();
	}

	

	public Nivel_iluminat getNivel_iluminat() {
		return nivel_iluminat;
	}



	public void setNivel_iluminat(Nivel_iluminat nivel_iluminat) {
		this.nivel_iluminat = nivel_iluminat;
	}



	public List<Nivel_iluminat> getNivel_iluminat_list() {
		return nivel_iluminat_list;
	}



	public void setNivel_iluminat_list(List<Nivel_iluminat> nivel_iluminat_list) {
		this.nivel_iluminat_list = nivel_iluminat_list;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String execute() {
		this.nivel_iluminat_list = linkController.list();
		return SUCCESS;
	}

	public String add() {
		
		try {
			linkController.add(getNivel_iluminat());
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.nivel_iluminat_list = linkController.list();
		return SUCCESS;
	}

	public String delete() {
		linkController.delete(getId());
		this.nivel_iluminat_list = linkController.list();
		return SUCCESS;
	}
	public void selectbyId(Long id) {
		int ilum_mediu=0;
		
		
		System.out.println(ilum_mediu);
	}
}
