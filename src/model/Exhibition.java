package model;
public class Exhibition 
    //aqui se abre la clase
{
	//declaracion de atributos
	private String nameExhibition;
	
	//Relaciones
	private Zone kZone;
	private Zone dZone;
	
	//metodo constructor
	
	public Exhibition (String theName){
		this.nameExhibition = theName;
	}
	
	//getter and setters
	
	public String getNameExhibition(){
		return nameExhibition;
	}
    
	public void setNameExhibition( String theName){
		nameExhibition = theName; 
	}	
	//setters and getters of relations
	public Zone getKZone(){
		return kZone;
	}
	
	public void setKZone(Zone kZone){
		this.kZone = kZone;
	}
	
	public Zone getDZone(){
		return dZone;
	}
	
	public void setDZone (Zone dZone){
		this.dZone = dZone;
		
	}
	
	public String nameWithVList(){
		
		String v = "";
		
		if(getKZone().getEnvironmentKangaroo1().getKangaroo1() != null  && (getKZone().getEnvironmentKangaroo1().getKangaroo1().nameWVocals() == true)){
			v += getKZone().getEnvironmentKangaroo1().getKangaroo1().getName() + "\n";	
		}
		
		if (getKZone().getEnvironmentKangaroo1().getKangaroo2() != null && (getKZone().getEnvironmentKangaroo1().getKangaroo2().nameWVocals() == true)){
			v += getKZone().getEnvironmentKangaroo1().getKangaroo2().getName() + "\n";
		}
		
		if (getKZone().getEnvironmentKangaroo1().getKangaroo3() != null && (getKZone().getEnvironmentKangaroo1().getKangaroo3().nameWVocals() == true)){
			v += getKZone().getEnvironmentKangaroo1().getKangaroo3().getName() + "\n";
		}
		
		
		if (getKZone().getEnvironmentKangaroo2().getKangaroo1() != null && (getKZone().getEnvironmentKangaroo2().getKangaroo1().nameWVocals() == true)){
			v += getKZone().getEnvironmentKangaroo2().getKangaroo1().getName() + "\n";
		}
		
		if (getKZone().getEnvironmentKangaroo2().getKangaroo2() != null && (getKZone().getEnvironmentKangaroo2().getKangaroo2().nameWVocals() == true)){
			v += getKZone().getEnvironmentKangaroo2().getKangaroo2().getName() + "\n";
		}
		
		if (getKZone().getEnvironmentKangaroo2().getKangaroo3() != null && (getKZone().getEnvironmentKangaroo2().getKangaroo3().nameWVocals() == true)){
			v += getKZone().getEnvironmentKangaroo2().getKangaroo3().getName() + "\n";
		}
		
		
		if (getKZone().getEnvironmentKangaroo3().getKangaroo1() != null && (getKZone().getEnvironmentKangaroo3().getKangaroo1().nameWVocals() == true)){
			v += getKZone().getEnvironmentKangaroo3().getKangaroo1().getName() + "\n";
		}
		
		if (getKZone().getEnvironmentKangaroo3().getKangaroo2() != null && (getKZone().getEnvironmentKangaroo3().getKangaroo2().nameWVocals() == true)){
			v += getKZone().getEnvironmentKangaroo3().getKangaroo2().getName() + "\n";
		}
		
		if (getKZone().getEnvironmentKangaroo3().getKangaroo3() != null && (getKZone().getEnvironmentKangaroo3().getKangaroo3().nameWVocals() == true)){
			v += getKZone().getEnvironmentKangaroo3().getKangaroo3().getName() + "\n";
		}
		
		
		
		
		
		return v;
	}
	
	
	
	

}