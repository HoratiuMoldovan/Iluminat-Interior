package iluminat_interior;

import java.util.List;

import iluminat_interior.Incapere;
import operatiicrud.Coef_utiliz_lampi_flourescente_manager;
import tabele.Coef_utiliz_lampi_flourescente;

public class Factor_de_utilizare {
	public double perete;
	public double tavan;
	public double pardoseala;
	
	
	Factor_de_utilizare(){
	}

	public double getPerete() {
		return perete;
	}

	public void setPerete(double perete) {
		this.perete = perete;
	}

	public double getTavan() {
		return tavan;
	}

	public void setTavan(double tavan) {
		this.tavan = tavan;
	}

	public double getPardoseala() {
		return pardoseala;
	}

	public void setPardoseala(double pardoseala) {
		this.pardoseala = pardoseala;
	}

	public double factor_utiliz(Incapere indice){
		
		Coef_utiliz_lampi_flourescente_manager coef_utiliz;
		List<Coef_utiliz_lampi_flourescente> lista_completa;
		double factor_utiliz=0;
		double indice_incapere;
		
		indice_incapere=indice.indice();
		coef_utiliz= new Coef_utiliz_lampi_flourescente_manager(); 
		lista_completa = coef_utiliz.list();
		
		for(Coef_utiliz_lampi_flourescente coef_curent : lista_completa)
		{
			if ((coef_curent.getIndice()  == indice_incapere)&&
				 (coef_curent.getPerete() == perete) &&
				 (coef_curent.getTavan()  == tavan))	
			{
				factor_utiliz = coef_curent.getCoeficient_lampi();
			}
		}
		return factor_utiliz;
		}
	}

