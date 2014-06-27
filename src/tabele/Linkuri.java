package tabele;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="linkuri")
public class Linkuri implements Serializable{
	
private static final long serialVersionUID = -8767337896773261247L;

private Long id;
String link;
String descriere;

public Linkuri(){
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

@Column(name="link")
public String getLink() {
	return link;
}

public void setLink(String link) {
	this.link = link;
}

@Column(name="descriere")
public String getDescriere() {
	return descriere;
}

public void setDescriere(String descriere) {
	this.descriere = descriere;
}


}