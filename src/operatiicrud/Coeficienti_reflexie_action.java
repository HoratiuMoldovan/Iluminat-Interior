package operatiicrud;

import java.util.List;

import operatiicrud.Coeficienti_reflexie_manager;
import tabele.Coeficienti_reflexie;
import com.opensymphony.xwork2.ActionSupport;

public class Coeficienti_reflexie_action extends ActionSupport{ 

private static final long serialVersionUID = 9149826260758390091L;
private Coeficienti_reflexie coeficienti_reflexie;
private List<Coeficienti_reflexie> coeficienti_reflexie_list;
private Long id;
private Coeficienti_reflexie_manager linkController;

public Coeficienti_reflexie_action() {
	linkController = new Coeficienti_reflexie_manager();
}

public Coeficienti_reflexie getCoeficienti_reflexie() {
	return coeficienti_reflexie;
}

public List<Coeficienti_reflexie> getCoeficienti_reflexie_list() {
	return coeficienti_reflexie_list;
}

public void setCoeficienti_reflexie(Coeficienti_reflexie coeficienti_reflexie) {
	this.coeficienti_reflexie = coeficienti_reflexie;
}

public void setCoeficienti_reflexie_list(List<Coeficienti_reflexie> coeficienti_reflexie_list) {
	this.coeficienti_reflexie_list = coeficienti_reflexie_list;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String execute() {
	this.coeficienti_reflexie_list = linkController.list();
	return SUCCESS;
}

public String add() {
	
	try {
		linkController.add(getCoeficienti_reflexie());
	} catch (Exception e) {
		e.printStackTrace();
	}
	this.coeficienti_reflexie_list = linkController.list();
	return SUCCESS;
}

public String delete() {
	linkController.delete(getId());
	this.coeficienti_reflexie_list = linkController.list();
	return SUCCESS;
}

}

