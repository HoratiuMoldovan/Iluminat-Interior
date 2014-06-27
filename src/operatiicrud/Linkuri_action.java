package operatiicrud;

import java.util.List;
import tabele.Linkuri;
import com.opensymphony.xwork2.ActionSupport;

public class Linkuri_action extends ActionSupport{ 

	private static final long serialVersionUID = 9149826260758390091L;
	private Linkuri linkuri;
	private List<Linkuri> linkuri_list;
	private Long id;
	private Linkuri_manager linkController;
	
	public Linkuri getLinkuri() {
		return linkuri;
	}

	public void setLinkuri(Linkuri linkuri) {
		this.linkuri = linkuri;
	}

	public List<Linkuri> getLinkuri_list() {
		return linkuri_list;
	}

	public void setLinkuri_list(List<Linkuri> linkuri_list) {
		this.linkuri_list = linkuri_list;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	 public Linkuri_action() {
		linkController = new Linkuri_manager();
	}

public String execute() {
		this.linkuri_list = linkController.list();
		return SUCCESS;
	}

	public String add() {
		
		try {
			linkController.add(getLinkuri());
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.linkuri_list = linkController.list();
		return SUCCESS;
	}

	public String delete() {
		linkController.delete(getId());
		this.linkuri_list = linkController.list();
		return SUCCESS;
	}
}
