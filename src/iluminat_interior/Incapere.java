package iluminat_interior;

public class Incapere {

private int lungime;
private int latime;
private int inaltime;
private int inaltime_plan_lucru;

public Incapere(){
	
}

public Incapere(int lungime, int latime, int inaltime, int inaltime_plan_lucru)
{
	this.lungime = lungime;
	this.latime  = latime;
	this.inaltime = inaltime;
	this.inaltime_plan_lucru = inaltime_plan_lucru;
}

public int getLungime() {
	return lungime;
}
public void setLungime(int lungime) {
	this.lungime = lungime;
}
public int getLatime() {
	return latime;
}
public void setLatime(int latime) {
	this.latime = latime;
}
public int getInaltime() {
	return inaltime;
}
public void setInaltime(int inaltime) {
	this.inaltime = inaltime;
}
public int getInaltime_plan_lucru() {
	return inaltime_plan_lucru;
}
public void setInaltime_plan_lucru(int inaltime_plan_lucru) {
	this.inaltime_plan_lucru = inaltime_plan_lucru;
}
public double indice(){
	double i;
	double numarator;
	double numitor;
	numarator=lungime*latime;
	numitor=(inaltime_plan_lucru*(lungime+latime));
	
i=(numarator/numitor);
System.out.println(i);
return Math.round(i);
}

}