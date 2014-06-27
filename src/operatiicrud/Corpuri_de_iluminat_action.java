package operatiicrud;

import java.util.List;

import operatiicrud.Corpuri_de_iluminat_manager;
import tabele.Corpuri_de_iluminat;

import com.opensymphony.xwork2.ActionSupport;

public class Corpuri_de_iluminat_action  extends ActionSupport{ 

	private static final long serialVersionUID = 9149826260758390091L;
	private Corpuri_de_iluminat corpuri_de_iluminat;
	private List<Corpuri_de_iluminat> corpuri_de_iluminat_list;
	private Long id;
	private Corpuri_de_iluminat_manager linkController;

	public Corpuri_de_iluminat_action() {
		linkController = new Corpuri_de_iluminat_manager();
	}



	public Corpuri_de_iluminat getCorpuri_de_iluminat() {
		return corpuri_de_iluminat;
	}



	public void setCorpuri_de_iluminat(Corpuri_de_iluminat corpuri_de_iluminat) {
		this.corpuri_de_iluminat = corpuri_de_iluminat;
	}



	public List<Corpuri_de_iluminat> getCorpuri_de_iluminat_list() {
		return corpuri_de_iluminat_list;
	}



	public void setCorpuri_de_iluminat_list(
			List<Corpuri_de_iluminat> corpuri_de_iluminat_list) {
		this.corpuri_de_iluminat_list = corpuri_de_iluminat_list;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String execute() {
		this.corpuri_de_iluminat_list = linkController.list();
		return SUCCESS;
	}

	public String add() {
		
		try {
			linkController.add(getCorpuri_de_iluminat());
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.corpuri_de_iluminat_list = linkController.list();
		return SUCCESS;
	}

	public String delete() {
		linkController.delete(getId());
		this.corpuri_de_iluminat_list = linkController.list();
		return SUCCESS;
	}

	}