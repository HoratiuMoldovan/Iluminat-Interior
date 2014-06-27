package operatiicrud;

import java.util.List;

import operatiicrud.Users_manager;
import tabele.Users;
import com.opensymphony.xwork2.ActionSupport;

public class Users_action extends ActionSupport{ 

	private static final long serialVersionUID = 9149826260758390091L;
	private Users users;
	private List<Users> users_list;
	private Long id;
	private Users_manager linkController;

	public Users_action() {
		linkController = new Users_manager();
	}

	

	public Users getUsers() {
		return users;
	}



	public void setUsers(Users users) {
		this.users = users;
	}



	public List<Users> getUsers_list() {
		return users_list;
	}



	public void setUsers_list(List<Users> users_list) {
		this.users_list = users_list;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String execute() {
		this.users_list = linkController.list();
		return SUCCESS;
	}

	public String add() {
		
		try {
			linkController.add(getUsers());
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.users_list = linkController.list();
		return SUCCESS;
	}

	public String delete() {
		linkController.delete(getId());
		this.users_list = linkController.list();
		return SUCCESS;
	}
}
