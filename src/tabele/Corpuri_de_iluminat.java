package tabele;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;


@Entity
@Table(name ="corpuri_de_iluminat")
public class Corpuri_de_iluminat implements Serializable {
    
private static final long serialVersionUID = -8767337896773261247L;

   Long id;
   String producator;
   String montaj;
   String tip_corp;
   String tip_lampa;
   int putere_lampa;
   int numar_lampi;
   int temperatura_de_culoare;
   int indice_redare_culoare;
   int flux_lampa;
   int durata_de_functionare;
   int eficacitate_luminoasa;
   int luminanta;
   int lungime_corp;
   int latime_corp;
   int diametru_corp;
   int inaltimea_de_suspendare;
   int grad_protectie;
   String destinatii;
 
  public Corpuri_de_iluminat(){
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
  
  @Column(name="PRODUCATOR")
public String getProducator() {
	return producator;
}

public void setProducator(String producator) {
	this.producator = producator;
}

@Column(name="MONTAJ")
public String getMontaj() {
	return montaj;
}

public void setMontaj(String montaj) {
	this.montaj = montaj;
}

@Column(name="TIP_CORP")
public String getTip_corp() {
	return tip_corp;
}

public void setTip_corp(String tip_corp) {
	this.tip_corp = tip_corp;
}

@Column(name="TIP_LAMPA")
public String getTip_lampa() {
	return tip_lampa;
}

public void setTip_lampa(String tip_lampa) {
	this.tip_lampa = tip_lampa;
}

@Column(name="PUTERE_LAMPA")
public int getPutere_lampa() {
	return putere_lampa;
}

public void setPutere_lampa(int putere_lampa) {
	this.putere_lampa = putere_lampa;
}

@Column(name="NUMAR_LAMPI")
public int getNumar_lampi() {
	return numar_lampi;
}

public void setNumar_lampi(int numar_lampi) {
	this.numar_lampi = numar_lampi;
}

@Column(name="TEMPERATURA_DE_CULOARE")
public int getTemperatura_de_culoare() {
	return temperatura_de_culoare;
}

public void setTemperatura_de_culoare(int temperatura_de_culoare) {
	this.temperatura_de_culoare = temperatura_de_culoare;
}

@Column(name="INDICE_REDARE_CULOARE")
public int getIndice_redare_culoare() {
	return indice_redare_culoare;
}

public void setIndice_redare_culoare(int indice_redare_culoare) {
	this.indice_redare_culoare = indice_redare_culoare;
}

@Column(name="FLUX_LAMPA")
public int getFlux_lampa() {
	return flux_lampa;
}

public void setFlux_lampa(int flux_lampa) {
	this.flux_lampa = flux_lampa;
}

@Column(name="DURATA_DE_FUNCTIONARE")
public int getDurata_de_functionare() {
	return durata_de_functionare;
}

public void setDurata_de_functionare(int durata_de_functionare) {
	this.durata_de_functionare = durata_de_functionare;
}

@Column(name="EFICACITATE_LUMINOASA")
public int getEficacitate_luminoasa() {
	return eficacitate_luminoasa;
}

public void setEficacitate_luminoasa(int eficacitate_luminoasa) {
	this.eficacitate_luminoasa = eficacitate_luminoasa;
}

@Column(name="LUMINANTA")
public int getLuminanta() {
	return luminanta;
}

public void setLuminanta(int luminanta) {
	this.luminanta = luminanta;
}

@Column(name="LUNGIME_CORP")
public int getLungime_corp() {
	return lungime_corp;
}

public void setLungime_corp(int lungime_corp) {
	this.lungime_corp = lungime_corp;
}

@Column(name="LATIME_CORP")
public int getLatime_corp() {
	return latime_corp;
}

public void setLatime_corp(int latime_corp) {
	this.latime_corp = latime_corp;
}

@Column(name="DIAMETRU_CORP")
public int getDiametru_corp() {
	return diametru_corp;
}

public void setDiametru_corp(int diametru_corp) {
	this.diametru_corp = diametru_corp;
}

@Column(name="INALTIMEA_DE_SUSPENDARE")
public int getInaltimea_de_suspendare() {
	return inaltimea_de_suspendare;
}

public void setInaltimea_de_suspendare(int inaltimea_de_suspendare) {
	this.inaltimea_de_suspendare = inaltimea_de_suspendare;
}

@Column(name="GRAD_PROTECTIE")
public int getGrad_protectie() {
	return grad_protectie;
}

public void setGrad_protectie(int grad_protectie) {
	this.grad_protectie = grad_protectie;
}

@Column(name="DESTINATII")
public String getDestinatii() {
	return destinatii;
}

public void setDestinatii(String destinatii) {
	this.destinatii = destinatii;
} 
  
}
