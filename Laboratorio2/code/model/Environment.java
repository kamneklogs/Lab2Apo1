package model;
public class Environment {
	
	
	//declaracion de atributos
	
	private String nameEnvironment;
	
	//relaciones
	
	private Animal kangaroo1;
	private Animal kangaroo2;
	private Animal kangaroo3;
	private Animal dragon1;
	private Animal dragon2;  //Crear getter and setter
	
	//metodo contructor
	
	public Environment (String nameEnvironment){
		this.nameEnvironment = nameEnvironment;
	}
	
	//getters and setters
	
	public String getNameEnvironment(){
		return nameEnvironment;
	}
    
	public void setNameEnvironment( String nameEnvironment){
		this.nameEnvironment = nameEnvironment; 
	}
	
	/*public int getNumAnimals (){
		return numAnimals;
	}
	
	public void setNumAnimals ( int numAnimals){
		this.numAnimals = numAnimals;
	}*/
	
	
	//GyT relaciones
	public Animal getKangaroo1(){
		return kangaroo1;
	}
	
	public void setKangaroo1(Animal kangaroo1){
		this.kangaroo1 = kangaroo1;
	}
	
	public Animal getKangaroo2(){
		return kangaroo2;
	}
	
	public void setKangaroo2(Animal kangaroo2){
		this.kangaroo2 = kangaroo2;
	}
	
	public Animal getKangaroo3(){
		return kangaroo3;
	}
	
	public void setKangaroo3(Animal kangaroo3){
		this.kangaroo3 = kangaroo3;
	}
	
	public Animal getDragon1(){
		return dragon1;
	}
	
	public void setDragon1(Animal dragon1){
		this.dragon1 = dragon1;
	}
	
		public Animal getDragon2(){
		return dragon2;
	}
	
	public void setDragon2(Animal dragon2){
		this.dragon2 = dragon2;
	}
	
	public double calculateAreaKAcum (){
		double areaAcum=0;
		
		if(kangaroo1 != null){
			areaAcum += kangaroo1.calculateAreaK();
		}
		if(kangaroo2 != null){
			areaAcum += kangaroo2.calculateAreaK();
		}
		if(kangaroo3 != null){
			areaAcum += kangaroo3.calculateAreaK();
		}
		
		return areaAcum;
	}
	
	public double calculateFoodKAcum (){
		
		double foodAcum = 0;
		
		if(kangaroo1 != null){
			foodAcum += kangaroo1.calculateFoodK();
		}
		if(kangaroo2 != null){
			foodAcum += kangaroo2.calculateFoodK();
		}
		if(kangaroo2 != null){
			foodAcum += kangaroo2.calculateFoodK();
		}
		
		return foodAcum;
		
	}
	
	public double calculateWaterKAcum(){
		double waterAcum = 0;
		
		if(kangaroo1 != null){
			waterAcum += kangaroo1.calculateWaterK();
		}
		if(kangaroo2 != null){
			waterAcum += kangaroo2.calculateWaterK();
		}
		if(kangaroo2 != null){
			waterAcum += kangaroo2.calculateWaterK();
		}
		return waterAcum;
	}
	
	public double calculateWaterDAcum(){
		double waterAcum = 0;
		
		if(dragon1 != null){
			waterAcum += dragon1.calculateWaterD();
		}
		if(dragon2 != null){
			waterAcum += dragon2.calculateWaterD();
		}
		return waterAcum;
	}
	
	public boolean evaluation(){
		boolean sexP = true;
		
			if(kangaroo1 != null){
				if(kangaroo1.getSex() == 'm'){
					sexP = false;
				}
			}
			
			if(kangaroo2 != null){
				if(kangaroo2.getSex() == 'm'){
					sexP = false;
				}
			}
			
			if(kangaroo3 != null){
				if(kangaroo3.getSex() == 'm'){
					sexP = false;
				}
			}
		
		return sexP;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} 