package model;
public class Zone 
{
	//declaracion de atributos
	private String nameZone;
	
	//relaciones
	
	private Environment environmentKangaroo1;
	private Environment environmentKangaroo2;
	private Environment environmentKangaroo3;
	private Environment environmentDragon1;
	
	//metodo contructor
	
	public Zone (String nameZone){
		this.nameZone = nameZone;
	}
	
	//getters and setters
	
	public String getNameZone (){
		return nameZone;
	}
	
	public void setNameZone( String nameZone){
		this.nameZone = nameZone; 
	}
	
	public Environment getEnvironmentKangaroo1(){
		return environmentKangaroo1;
	}
	
	public void setEnvironmentKangaroo1(Environment environmentKangaroo1){
		this.environmentKangaroo1 = environmentKangaroo1;
	}
	
	
	public Environment getEnvironmentKangaroo2(){
		return environmentKangaroo2;
	}
	
	public void setEnvironmentKangaroo2(Environment environmentKangaroo2){
		this.environmentKangaroo2 = environmentKangaroo2;
	}
	
	
	public Environment getEnvironmentKangaroo3(){
		return environmentKangaroo3;
	}
	
	public void setEnvironmentKangaroo3(Environment environmentKangaroo3){
		this.environmentKangaroo3 = environmentKangaroo3;
	}
	
	
	public Environment getEnvironmentDragon1(){
		return environmentDragon1;
	}
	
	public void setEnvironmentDragon1(Environment environmentDragon1){
		this.environmentDragon1 = environmentDragon1;
	}
} 
