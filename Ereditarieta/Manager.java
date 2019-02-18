/*
 * Created on 18-feb-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package Ereditarieta;

/**
 * @author luciano
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
class Manager extends Impiegato {
private double bonus;
public Manager(String n,double s,int anno,int mese,int giorno){
	super(n,s,anno,mese,giorno);
	bonus=0;
}
public double getSalario(){
	double baseSalario=super.getSalario();
	return baseSalario+bonus;
}
public void setBonus(double bonus){
	this.bonus=bonus;
}
}
