package iluminat_interior;
import java.util.ArrayList;
import java.util.List;

import operatiicrud.Corpuri_de_iluminat_manager;
import tabele.Corpuri_de_iluminat;
import tabele.Nivel_iluminat;

public class Predeterminare {

public String destinatia_cldirii;
public String tipul_icaperii;
public String getDestinatia_cldirii() {
	return destinatia_cldirii;
}
public void setDestinatia_cldirii(String destinatia_cldirii) {
	this.destinatia_cldirii = destinatia_cldirii;
}
public String getTipul_icaperii() {
	return tipul_icaperii;
}
public void setTipul_icaperii(String tipul_icaperii) {
	this.tipul_icaperii = tipul_icaperii;
}

public List<Corpuri_de_iluminat> predetermina(Nivel_iluminat nivel_ilum){
	
Corpuri_de_iluminat_manager corp_manager;
List<Corpuri_de_iluminat> lista_completa;
List<Corpuri_de_iluminat> lista_predeterminata;
String tip_destinatie;


corp_manager = new Corpuri_de_iluminat_manager();
lista_completa = corp_manager.list();
lista_predeterminata = new ArrayList<Corpuri_de_iluminat>();
tip_destinatie = nivel_ilum.getTipul_destinatie().toLowerCase();

for(Corpuri_de_iluminat corp_curent : lista_completa)
{
	String destinatii;
	destinatii = corp_curent.getDestinatii().toLowerCase();
	
	if (destinatii.contains(tip_destinatie))
	{
		lista_predeterminata.add(corp_curent);
	}	
}
 return lista_predeterminata;  
}

}
