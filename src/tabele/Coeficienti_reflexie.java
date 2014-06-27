package tabele;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;



@Entity
@Table(name = "coeficienti_reflexie")
public class Coeficienti_reflexie implements Serializable {
        
	private static final long serialVersionUID = -8767337896773261247L;
	
	    Long id;
	    String tipul_suprafetei;
        String coeficient;
        
public Coeficienti_reflexie (){
       
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

@Column(name="TIPUL_SUPRAFETEI")
public String getTipul_suprafetei() {
    		return tipul_suprafetei;
    	}
public void setTipul_suprafetei(String tipul_suprafetei) {
    		this.tipul_suprafetei = tipul_suprafetei;
    	}

@Column(name="COEFICIENT")
public String getCoeficient() {
    		return coeficient;
    	}
public void setCoeficient(String coeficient) {
    		this.coeficient = coeficient;
    	}
}
