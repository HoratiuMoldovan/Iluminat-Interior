package operatiicrud;

import java.util.List;


import tabele.Users;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport{
	
	private static final long serialVersionUID = 9149826260758390091L;
	private String username;
	private String password;
	private Users users;
	private List<Users> users_list;
	private Users_manager linkController;
 
	
	public String authenticate() {
				linkController = new Users_manager();
		users_list=linkController.list();
	    for(Users user_curent : users_list){
			if(username==user_curent.getUserName()&&
			   password==user_curent.getUserPass()){
			break;
		 } 	
		
			return SUCCESS;

	    }
	    return SUCCESS;   
	}
	public String getUsername() {
		return username;
	}
 
	public void setUsername(String username) {
		this.username = username;
	}
 
	public String getPassword() {
		return password;
	}
 
	public void setPassword(String password) {
		this.password = password;
	}
}
