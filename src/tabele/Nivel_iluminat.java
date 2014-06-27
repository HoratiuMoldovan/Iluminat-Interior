package tabele;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name = "nivel_iluminat")
public class Nivel_iluminat  implements Serializable {
    
private static final long serialVersionUID = -8767337896773261247L;

    Long id;
	String tipul_destinatie;
	String locatie;
	int indice_orbire;
	int iluminare_medie;
	int indice_redare_culoare;
	int inaltime_plan_lucru;
	String observatii;

public Nivel_iluminat(){
	
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

@Column(name="TIPUL_DESTINATIEI")
public String getTipul_destinatie() {
	return tipul_destinatie;
}

public void setTipul_destinatie(String tipul_destinatie) {
	this.tipul_destinatie = tipul_destinatie;
}

@Column(name="LOCATIE")
public String getLocatie() {
	return locatie;
}

public void setLocatie(String locatie) {
	this.locatie = locatie;
}

@Column(name="INDICE_ORBIRE")
public int getIndice_orbire() {
	return indice_orbire;
}

public void setIndice_orbire(int indice_orbire) {
	this.indice_orbire = indice_orbire;
}

@Column(name="ILUMINARE_MEDIE")
public int getIluminare_medie() {
	return iluminare_medie;
}

public void setIluminare_medie(int iluminare_medie) {
	this.iluminare_medie = iluminare_medie;
}

@Column(name="INDICE_REDARE_CULOARE")
public int getIndice_redare_culoare() {
	return indice_redare_culoare;
}

public void setIndice_redare_culoare(int indice_redare_culoare) {
	this.indice_redare_culoare = indice_redare_culoare;
}

@Column(name="INALTIME_PLAN_LUCRU")
public int getInaltime_plan_lucru() {
	return inaltime_plan_lucru;
}

public void setInaltime_plan_lucru(int inaltime_plan_lucru) {
	this.inaltime_plan_lucru = inaltime_plan_lucru;
}

@Column(name="OBSERVATII")
public String getObservatii() {
	return observatii;
}

public void setObservatii(String observatii) {
	this.observatii = observatii;
} 



}
