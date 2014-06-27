package tabele;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name="coef_utiliz_lampi_fluorescente")
public class Coef_utiliz_lampi_flourescente implements Serializable {
    
private static final long serialVersionUID = -8767337896773261247L;

      Long id;
      int coeficient_lampi;
      int indice;
      int perete;
      int tavan;
      
public Coef_utiliz_lampi_flourescente(){
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

@Column(name="COEFICIENT")
public int getCoeficient_lampi() {
	return coeficient_lampi;
}

public void setCoeficient_lampi(int coeficient_lampi) {
	this.coeficient_lampi =coeficient_lampi;
}

@Column(name="INDICE")
public int getIndice() {
	return indice;
}

public void setIndice(int indice) {
	this.indice = indice;
}

@Column(name="PERETE")
public int getPerete() {
	return perete;
}

public void setPerete(int perete) {
	this.perete = perete;
}

@Column(name="TAVAN")
public int getTavan() {
	return tavan;
}

public void setTavan(int tavan) {
	this.tavan = tavan;
}

}
