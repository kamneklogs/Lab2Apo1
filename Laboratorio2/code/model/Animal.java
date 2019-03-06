package model;
public class Animal 
{
	
	//Constantes
	public final static String ANIMAL_KANGAROO = "canguro";
	public final static String ANIMAL_DRAGON = "dragon";
	public final static String BLOOD_A = "a";
	public final static String BLOOD_AB = "ab";
	public final static String BLOOD_B = "b";
	public final static String BLOOD_O = "o";
	//declaracion de atributos
	
	private String name;
	private double weight;
	private double height;
	private char sex;
	private String bloodType;
	private String animalType;
	private int birdDay;
	private int birdMonth;
	private int birdYear;
	
	
	//Relaciones
	// private Date birdDateK;
	
	
	//metodo constructor
	
	public Animal (String name, double weight, double height, char sex, String bloodType, String animalType, int birdDay, int birdMonth, int birdYear){
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.sex = sex;
		this.bloodType = bloodType;
		this.animalType = animalType;
		this.birdDay = birdDay;
		this.birdMonth = birdMonth;
		this.birdYear = birdYear;
	}
	
	//getters and setters
	
	
	public String getName(){
		return name;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public double getHeight(){
		return weight;
	}
	
	public char getSex(){
		return sex;
	}
	
	public String getBloodType(){
		return bloodType;
	}	
	
	public String getAnimalType(){
		return animalType;
	}
	
	
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	
	
	public void setSex(char sex){
		this.sex = sex;
	}
	
	public void setBloodType(String bloodType){
		this.bloodType = bloodType;
	}
	
	public void setAnimalType(String animalType){
		this.animalType = animalType;
	}
	/*
	public Animal getBirdDateK(){
		return birdDateK;
	}
	
	public void setBirdDateK(Date birdDateK){
		this.birdDateK = birdDateK;
	}
	*/
	
	public int getBirdDay(){
		return birdDay;
	}
	
	public void setBirdDay(int birdDay){
		this.birdDay = birdDay;
	}
	
	public int getBirdMonth(){
		return birdMonth;
	}
	
	public void setBirdMonth(int birdMonth){
		this.birdMonth = birdMonth;
	}
	
	public int getBirdYear(){
		return birdYear;
	}
	
	public void setBirdYear(int birdYear){
		this.birdYear = birdYear;
	}
	
	
	//metodo que calcula el Indice de Masa Corporal
	public double calculateBMI(){
		return weight * (height * 2);
		
	}
	
	//Calcula el area requerida por cada canguro
	public double calculateAreaK(){
		return height*8;
	}
	
	//calcula el alimento requerido por cada canguro
	public double calculateFoodK( ){
		double food = 0;
		if(animalType.equals(ANIMAL_KANGAROO)){
			if( weight <30 ){
				food = (weight / 100) * 8;		
		}  
		else if(weight >= 30 && weight <= 48 ){
			food = weight + ((weight / 100) * 10);
		} 
		else {
			food = 40 + (0.4 * (weight - 40));
			}
		}
		return food;
	}
	
	//genera notificacion para el alimento de los Dragones Barbados
	public String notificationFoodD(double scales){
		String foodNotification = "No requiere alimento";
		if ( animalType.equals(ANIMAL_DRAGON)){
			if(scales < 5){
				foodNotification = "Requiere alimento";
			}
		}
		return foodNotification;
	}
	
	// determina si un carguro es propenso a enfermedades cardiacas
	public String sortOutRisk(){
		String cardiacRisk = "No Aplica";
		double bMI = calculateBMI();
		if(bMI < 18){ //
			if(bloodType.equals(BLOOD_A) || bloodType.equals(BLOOD_AB)){
				cardiacRisk = "BAJO";
				}
				else {cardiacRisk = "MODERADO";	
				}
			}
			else if(bMI >= 18 && bMI <= 25){
				cardiacRisk = "BAJO";
			}
			else if(bloodType.equals(BLOOD_A) || bloodType.equals(BLOOD_B) || bloodType.equals(BLOOD_O)){
				cardiacRisk = "ALTO";
			}
			else {
				cardiacRisk = "MODERADO";
			}
			return cardiacRisk;
	}
	
	//calcula el agua requerida por cada canguro
	public double calculateWaterK(){
		double waterK = 0;
		if(animalType.equals(ANIMAL_KANGAROO)){
		waterK = calculateBMI () * 1.5;
		} 
		return waterK;
	}
	
	//calcula el agua requerida por cada dragon barbado
	public double calculateWaterD(){
		double waterD = 0;
		if(animalType.equals(ANIMAL_DRAGON)){
			waterD = (calculateBMI() / 100) * 75;
		}
		return waterD;
	}
	
	
	//calcula tiempo restante de vacunacion para los canguros
	public String vaccinateK(int actualDay, int actualMonth, int actualYear){
		
		String vaccinate = "No Requiere Vacunar";
		int numADay = 0;
		int numBDay = 0;
		int rDay = 0;
		int rWeek = 0;
		
			if(actualYear > birdYear){
				numADay = (actualYear * 365) + (actualMonth * 30) + actualDay;
				numBDay = (birdYear * 365) + (birdMonth * 30) + birdDay;
				rDay = numADay - numBDay;
			}
			else {
				numADay = (actualYear * 365) + (actualMonth * 30) + actualDay;
				numBDay = (birdYear * 365) + (birdMonth * 30) + birdDay;
				rDay = numBDay - numADay;
			}
			
			if (rDay < 365){
				rWeek = rDay / 7;
				rDay = rDay % 7;
				vaccinate = "Faltan " + rWeek + " Semanas" + " y " + rDay + " dias./n" ;
			}
			
			return vaccinate;
			
		
		
		
	}
	
	public boolean  nameWVocals() {
		
		boolean  revision;
		int nl = name.length()-1;
		
		revision = (name.charAt(0) == 'A' || name.charAt(0) == 'E' || name.charAt(0)=='I' || name.charAt(0)=='O'  || name.charAt(0)=='U' || name.charAt(0) == 'a' || name.charAt(0) == 'e'|| name.charAt(0) == 'i' || name.charAt(0) == 'o' || name.charAt(0) == 'u') && (name.charAt(nl) == 'a' || name.charAt(nl) == 'e'|| name.charAt(nl) == 'i' || name.charAt(nl) == 'o' || name.charAt(nl) == 'u');
		
		return revision;
	}
	
	
	
	
	
	
	
	
	
	
	
} 