package tabele;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name="users")
public class Users  implements Serializable {
    
private static final long serialVersionUID = -8767337896773261247L;

    Long id;
	String userName;
	String userType;
	String userPass;
	String e_mail;
	String nume;
	
	public Users(){
		
	}	
	
	@Id
	@GeneratedValue
	@Column(name="id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

@Column(name="userName")
public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

@Column(name="userType")
public String getUserType() {
	return userType;
}

public void setUserType(String userType) {
	this.userType = userType;
}

@Column(name="userPass")
public String getUserPass() {
	return userPass;
}

public void setUserPass(String userPass) {
	this.userPass = userPass;
}

@Column(name="e_mail")
public String getE_mail() {
	return e_mail;
}

public void setE_mail(String e_mail) {
	this.e_mail = e_mail;
}

@Column (name="nume")
public String getNume() {
	return nume;
}

public void setNume(String nume) {
	this.nume = nume;
}	
	
}
