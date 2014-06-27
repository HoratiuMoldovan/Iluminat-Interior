package operatiicrud;

import java.util.List;

import operatiicrud.Coef_utiliz_lampi_flourescente_manager;
import com.opensymphony.xwork2.ActionSupport;
import tabele.Coef_utiliz_lampi_flourescente;

public class Coef_utiliz_lampi_flourescente_action extends ActionSupport{ 

private static final long serialVersionUID = 9149826260758390091L;
private Coef_utiliz_lampi_flourescente coef_utiliz_lampi_flourescente;
private List<Coef_utiliz_lampi_flourescente> coef_utiliz_lampi_flourescente_list;
private Long id;
private Coef_utiliz_lampi_flourescente_manager linkController;

public Coef_utiliz_lampi_flourescente_action() {
	linkController = new Coef_utiliz_lampi_flourescente_manager();
}

public Coef_utiliz_lampi_flourescente getCoef_utiliz_lampi_flourescente() {
	return coef_utiliz_lampi_flourescente;
}

public List<Coef_utiliz_lampi_flourescente> getCoef_utiliz_lampi_flourescente_list() {
	return coef_utiliz_lampi_flourescente_list;
}

public void setCoef_utiliz_lampi_flourescente(Coef_utiliz_lampi_flourescente coef_utiliz_lampi_flourescente) {
	this.coef_utiliz_lampi_flourescente=coef_utiliz_lampi_flourescente;
}

public void setCoef_utiliz_lampi_flourescente_list(List<Coef_utiliz_lampi_flourescente> coef_utiliz_lampi_flourescente_list) {
	this.coef_utiliz_lampi_flourescente_list =coef_utiliz_lampi_flourescente_list;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String execute() {
	this.coef_utiliz_lampi_flourescente_list = linkController.list();
	return SUCCESS;
}

public String add() {
	
	try {
		linkController.add(getCoef_utiliz_lampi_flourescente());
	} catch (Exception e) {
		e.printStackTrace();
	}
	this.coef_utiliz_lampi_flourescente_list = linkController.list();
	return SUCCESS;
}

public String delete() {
	linkController.delete(getId());
	this.coef_utiliz_lampi_flourescente_list = linkController.list();
	return SUCCESS;
}

}
