
package ui;

import java.util.Scanner;
import model.*;

public class Main{
	
	//relaciones
	
	private Exhibition zooExhibition;
	
	//constructor
	
	public Main (){
	
	}
	
	//getters and setters
	
	public void init(){
		
		
		zooExhibition = new Exhibition("Australia: Donde el agua es oro");
		zooExhibition.setKZone(new Zone("Zonas de los canguros"));
		zooExhibition.setDZone(new Zone("Zonas de los dragones"));
		zooExhibition.getKZone().setEnvironmentKangaroo1(new Environment("Ambiente C1"));
		zooExhibition.getKZone().setEnvironmentKangaroo2(new Environment("Ambiente C2"));
		zooExhibition.getKZone().setEnvironmentKangaroo3(new Environment("Ambiente C3"));
		zooExhibition.getDZone().setEnvironmentDragon1(new Environment("Ambiente D1"));

		
		
		zooExhibition.getKZone().getEnvironmentKangaroo1().setKangaroo1(new Animal("golu", 70, 1.70, 'm', "AB", "canguro", 12, 9, 2018));
		zooExhibition.getKZone().getEnvironmentKangaroo1().setKangaroo2(new Animal("edasa", 68, 1.56, 'h', "A", "canguro", 02, 10, 2009));
		
		zooExhibition.getKZone().getEnvironmentKangaroo2().setKangaroo1(new Animal("gash", 70, 7.70, 'h', "A", "canguro", 12, 21, 2005));
		zooExhibition.getKZone().getEnvironmentKangaroo2().setKangaroo2(new Animal("Olaska", 80, 2.70, 'm', "AB", "canguro", 5, 5, 2018));
		
		zooExhibition.getKZone().getEnvironmentKangaroo3().setKangaroo1(new Animal("ana", 70, 3.70, 'h', "A", "canguro", 12, 11, 2012));
		zooExhibition.getKZone().getEnvironmentKangaroo3().setKangaroo2(new Animal("iris", 80, 2.20, 'm', "AB", "canguro", 12, 12, 2012));
		
	}
	
	public static void menu(){
		System.out.println(" _________________________________________________________ ");
		System.out.println("|                                                         |");
		System.out.println("|         ZOOLOGICO DE CALI - SISTEMA DE MONITOREO        |");	 
		System.out.println("|     NUEVA EXHIBICION:AUSTRALIA, DONDE EL AGUA ES ORO    |");
		System.out.println("|_________________________________________________________| \n");
		System.out.println(" Digite el numero de la tarea que desea realizar: \n");	
		System.out.println("1. Calcular area requerida de un ambiente");
		System.out.println("2. Consultar tiempo que falta para vacuna del canguro");
		System.out.println("3. Calcular cantidad de alimento para los canguros");
		System.out.println("4. Calcular IMC de los animales");
		System.out.println("5. Determinar riesgo cardiaco de un canguro");
		System.out.println("6. Calcular consumo de agua de los canguros");
		System.out.println("7. Calcular consumo de agua de los dragones");
		System.out.println("9. Agregar canguro a un ambiente");
		System.out.println("10. Eliminar un canguro");
		System.out.println("11. Cambiar a un canguro de ambiente");
		System.out.println("12. Listar los canguros con que inician y terminan con una vocal en su nombre\n");
		
		
		
		/*Scanner  optMenu = new Scanner (System.in);
		int optMenu1 = optMenu.nextInt();
		
		if (optMenu1 == 1 ){
			double rAreaK = 0;
			rAreaK = m.zooExhibition.getKZone().getEnvironmentKangaroo1().calculateAreaKAcum();
			System.out.println("El area requerida es: " + rAreaK);
		}*/
		
	
	}
	
	public static void main(String[] args){
		
		Main m = new Main();
		m.init();
	
		
		System.out.println("ingrese dia actual:");
		Scanner  a = new Scanner (System.in);
		int actualDay = a.nextInt();
	
		System.out.println("ingrese mes actual:");
		
		int actualMonth = a.nextInt();
	
		System.out.println("ingrese año actual:");
		
		int actualYear = a.nextInt();
	
		System.out.println(actualDay+" "+actualMonth+" "+ actualYear );
	
		//	String jhxgdhe = zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo1(). notificationFoodD(a);
	
	

	
		

	
		menu();
		int optMenu = a.nextInt();
		
		switch ( optMenu ) {
		
		default:
			System.out.println("Error en la matrix \0__0/");
		break;	
		
		case 1:
	  
			System.out.println("Elija el ambiente:\n");
			System.out.println("1. Ambiente C1");
			System.out.println("2. Ambiente C2");
			System.out.println("3. Ambiente C3");
			System.out.println("4. Volver a inicio\n");
			
			optMenu = a.nextInt();
           
		   
			switch ( optMenu ) {
				default:
					System.out.println("Error en la matrix -0_0-");
					break;
				case 1:
					double rAreaK = m.zooExhibition.getKZone().getEnvironmentKangaroo1().calculateAreaKAcum();
					System.out.println("El area requerida es: " + rAreaK);
					break;
				case 2:
					rAreaK = m.zooExhibition.getKZone().getEnvironmentKangaroo2().calculateAreaKAcum();
					System.out.println("El area requerida es: " + rAreaK);
					break;
				case 3:
					rAreaK = m.zooExhibition.getKZone().getEnvironmentKangaroo3().calculateAreaKAcum();
					System.out.println("El area requerida es: " + rAreaK);
					break;
				case 4:
					m.menu();
			}			
				
         break; 
		   
		   
		   
		case 2:
			System.out.println("Elija el ambiente:\n");
			System.out.println("1. Ambiente C1");
			System.out.println("2. Ambiente C2");
			System.out.println("3. Ambiente C3");
			System.out.println("4. Volver a inicio\n");
			
			optMenu = a.nextInt();
			
			switch ( optMenu ) {
				default:
					System.out.println("Error en la matrix 0_0");
				break;
				
				case 1:
					System.out.println("Eliga el canguro");
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo1() != null){
							System.out.println("1. " + m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo1().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo2() != null){
							System.out.println("2. " + m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo2().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo3() != null){
							System.out.println("3. " + m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo3().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						System.out.println("4. Volver a inicio\n");
							optMenu = a.nextInt();
							switch (optMenu){
								default:
									System.out.println("Error en la matrix");
								break;
								case 1:
									String vaccinateKWaD = m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo1().vaccinateK(actualDay, actualMonth, actualYear);
									System.out.println(vaccinateKWaD);
								break;
								case 2:
									vaccinateKWaD = m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo2().vaccinateK(actualDay, actualMonth, actualYear);
									System.out.println(vaccinateKWaD);
								break;
								case 3:
									vaccinateKWaD = m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo3().vaccinateK(actualDay, actualMonth, actualYear);
									System.out.println(vaccinateKWaD);
								break;
								case 4:
									m.menu();
								break;
								
							}
				break;
				
				case 2:
					System.out.println("Eliga el canguro");
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo1() != null){
							System.out.println("1. " + m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo1().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo2() != null){
							System.out.println("2. " + m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo2().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo3() != null){
							System.out.println("3. " + m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo3().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						System.out.println("4. Volver a inicio\n");
							optMenu = a.nextInt();
							switch (optMenu){
								default:
									System.out.println("Error en la matrix");
								break;
								case 1:
									String vaccinateKWaD = m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo1().vaccinateK(actualDay, actualMonth, actualYear);
									System.out.println(vaccinateKWaD);
								break;
								case 2:
									vaccinateKWaD = m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo2().vaccinateK(actualDay, actualMonth, actualYear);
									System.out.println(vaccinateKWaD);
								break;
								case 3:
									vaccinateKWaD = m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo3().vaccinateK(actualDay, actualMonth, actualYear);
									System.out.println(vaccinateKWaD);
								break;
								case 4:
									m.menu();
								break;
								
							}
				break;
				case 3:
					System.out.println("Eliga el canguro");
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo1() != null){
							System.out.println("1. " + m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo1().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo2() != null){
							System.out.println("2. " + m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo2().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo3() != null){
							System.out.println("3. " + m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo3().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						System.out.println("4. Volver a inicio\n");
							optMenu = a.nextInt();
							switch (optMenu){
								default:
									System.out.println("Error en la matrix");
								break;
								case 1:
									String vaccinateKWaD = m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo1().vaccinateK(actualDay, actualMonth, actualYear);
									System.out.println(vaccinateKWaD);
								break;
								case 2:
									vaccinateKWaD = m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo2().vaccinateK(actualDay, actualMonth, actualYear);
									System.out.println(vaccinateKWaD);
								break;
								case 3:
									vaccinateKWaD = m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo3().vaccinateK(actualDay, actualMonth, actualYear);
									System.out.println(vaccinateKWaD);
								break;
								case 4:
									m.menu();
								break;
								
							}
				break;
				case 4:
					m.menu();
				
				
			}
			
			
		break;
		case 3:
			
			System.out.println("Elija el ambiente:\n");
			System.out.println("1. Ambiente C1");
			System.out.println("2. Ambiente C2");
			System.out.println("3. Ambiente C3");
			System.out.println("4. Volver a inicio\n");
			
			optMenu = a.nextInt();
			
			switch (optMenu){
				
				default:
					System.out.println("Error en la matrix \0__0/");
					break;
				case 1:
					double rFoodK = m.zooExhibition.getKZone().getEnvironmentKangaroo1().calculateFoodKAcum();
					System.out.println("El alimento requerido para los canguros es: " + rFoodK + " kilos");
					break;
				case 2:
					rFoodK = m.zooExhibition.getKZone().getEnvironmentKangaroo2().calculateFoodKAcum();
					System.out.println("El alimento requerido para los canguros es: " + rFoodK + " kilos");
					break;
				case 3:
					rFoodK = m.zooExhibition.getKZone().getEnvironmentKangaroo3().calculateFoodKAcum();
					System.out.println("El alimento requerido para los canguros es: " + rFoodK + " kilos");
					break;
				case 4:
					m.menu();
				
			}
		break;
				
		case 4:
		
			System.out.println("Elija el ambiente\n");
			System.out.println("1. Ambiente C1");
			System.out.println("2. Ambiente C2");
			System.out.println("3. Ambiente C3");
			System.out.println("4. Volver a inicio\n");

			
			optMenu = a.nextInt();
			switch (optMenu){
				
				default:
					System.out.println("Error en la matrix \0__0/");
					break;
					
				case 1:
					System.out.println("Elija el canguro\n");
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo1() != null){
							System.out.println("1. " + m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo1().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo2() != null){
							System.out.println("2. " + m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo2().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo3() != null){
							System.out.println("3. " + m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo3().getName());
						}
						else{
							System.out.println("vacio");
						}
					
					
					
						optMenu = a.nextInt();
						
						switch (optMenu){
							
							default:
								System.out.println("Error en la matrix 0__0");
								break;
								
							case 1: 
								
								System.out.println("El IMC es: " +  m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo1().calculateBMI());
								
								break;
								
							case 2:
								System.out.println("El IMC es: " +  m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo2().calculateBMI());
								break;
								
							case 3:
								System.out.println("El IMC es: " +  m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo3().calculateBMI());
								break;

	
						}
				break;
						
				case 2:
					System.out.println("Elija el canguro\n");
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo1() != null){
							System.out.println("1. " + m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo1().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo2() != null){
							System.out.println("2. " + m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo2().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo3() != null){
							System.out.println("3. " + m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo3().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						optMenu = a.nextInt();
						
						switch (optMenu){
							
							default:
								System.out.println("Error en la matrix 0__0");
							break;
							
							case 1: 
								
								System.out.println("El IMC es: " +  m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo1().calculateBMI());
								
								break;
								
							case 2:
								System.out.println("El IMC es: " +  m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo2().calculateBMI());
								break;
								
							case 3:
								System.out.println("El IMC es: " +  m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo3().calculateBMI());
								break;

						}
				break;
				
				case 3:
					System.out.println("Elija el canguro\n");
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo1() != null){
							System.out.println("1. " + m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo1().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo2() != null){
							System.out.println("2. " + m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo2().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo3() != null){
							System.out.println("3. " + m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo3().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						optMenu = a.nextInt();
						
						switch (optMenu){
							
							default:
								System.out.println("Error en la matrix 0__0");
							break;
							
							case 1: 
								
								System.out.println("El IMC es: " +  m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo1().calculateBMI());
								
								break;
								
							case 2:
								System.out.println("El IMC es: " +  m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo2().calculateBMI());
								break;
								
							case 3:
								System.out.println("El IMC es: " +  m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo3().calculateBMI());
								break;

						}
			
				break;
				case 4:
					m.menu();
			}
		break;
		case 5:
			
			System.out.println("Elija el ambiente\n");
			System.out.println("1. Ambiente C1");
			System.out.println("2. Ambiente C2");
			System.out.println("3. Ambiente C3");
			System.out.println("4. Volver a inicio\n");

			
			optMenu = a.nextInt();
			
			switch(optMenu){
				default:
					System.out.println("Error en la matrix 0_0");
				break;
				
				case 1:
				
						System.out.println("Eliga el canguro");
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo1() != null){
							System.out.println("1. " + m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo1().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo2() != null){
							System.out.println("2. " + m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo2().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo3() != null){
							System.out.println("3. " + m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo3().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						System.out.println("4. Volver a inicio\n");
				
				
						optMenu = a.nextInt();
						
						switch (optMenu){
							default:
								System.out.println("Error en la matrix 0_0");
								
							case 1:
								System.out.println("El riesgo cardiaco que presenta este canguro es: " + m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo1().sortOutRisk());
							break;
								
							case 2:
								System.out.println("El riesgo cardiaco que presenta este canguro es: " + m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo2().sortOutRisk());
							break;
								
							case 3: 
								System.out.println("El riesgo cardiaco que presenta este canguro es: " + m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo3().sortOutRisk());
							break;
							case 4:
								m.menu();

						}
				break;
				
				case 2:
						System.out.println("Eliga el canguro");
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo1() != null){
							System.out.println("1. " + m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo1().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo2() != null){
							System.out.println("2. " + m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo2().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo3() != null){
							System.out.println("3. " + m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo3().getName());
						}
						else{
							System.out.println("vacio");
						}
						System.out.println("Volver a inicio\n");
						
						
					optMenu = a.nextInt();
						switch(optMenu){
							default:
								System.out.println("Error en la matrix =_=");
							case 1:
								System.out.println("El riesgo cardiaco que presenta este canguro es: " + m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo1(). sortOutRisk());
							break;
								
							case 2:
								System.out.println("El riesgo cardiaco que presenta este canguro es: " + m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo2(). sortOutRisk());
							break;
								
							case 3: 
								System.out.println("El riesgo cardiaco que presenta este canguro es: " + m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo3(). sortOutRisk());
							break;
							case 4:
								m.menu();
						}
				break;

				case 3:
					System.out.println("Eliga el canguro");
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo1() != null){
							System.out.println("1. " + m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo1().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo2() != null){
							System.out.println("2. " + m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo2().getName());
						}
						else{
							System.out.println("vacio");
						}
						
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo3() != null){
							System.out.println("3. " + m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo3().getName());
						}
						else{
							System.out.println("vacio");
						}
						System.out.println("4. Volver a inicio\n");
						
						
					optMenu = a.nextInt();
						switch(optMenu){
							default:
								System.out.println("Error en la matrix =_=");
							case 1:
								System.out.println("El riesgo cardiaco que presenta este canguro es: " + m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo1(). sortOutRisk());
							break;
								
							case 2:
								System.out.println("El riesgo cardiaco que presenta este canguro es: " + m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo2(). sortOutRisk());
							break;
								
							case 3: 
								System.out.println("El riesgo cardiaco que presenta este canguro es: " + m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo3(). sortOutRisk());
							break;
							case 4:
								m.menu();
						}
				break;
			}
		break;	
		case 6:
		
			System.out.println("Elija el ambiente\n");
			System.out.println("1. Ambiente C1");
			System.out.println("2. Ambiente C2");
			System.out.println("3. Ambiente C3");
			System.out.println("4. Volver a inicio\n");
			
			optMenu = a.nextInt();
			
			switch(optMenu){
				default:
					System.out.println("Error en la matrix 0_0");
				break;
				case 1:
					double rWaterK = m.zooExhibition.getKZone().getEnvironmentKangaroo1().calculateWaterKAcum();
					System.out.println("El consumo de agua de este ambiente es de:" + rWaterK + " litros.");
				break;
				
				case 2:
					rWaterK = m.zooExhibition.getKZone().getEnvironmentKangaroo2().calculateWaterKAcum();
					System.out.println("El consumo de agua de este ambiente es de:" + rWaterK + " litros.");
				break;
				
				case 3:
					rWaterK = m.zooExhibition.getKZone().getEnvironmentKangaroo3().calculateWaterKAcum();
					System.out.println("El consumo de agua de este ambiente es de:" + rWaterK + " litros.");
				break;
				
				case 4:
					m.menu();
				break;

			}
		break;
		case 7:
		
			if(m.zooExhibition.getDZone().getEnvironmentDragon1().calculateWaterDAcum() != 0 ){
				System.out.println("El consumo de agua del ambiente de los dragones es de: " + m.zooExhibition.getDZone().getEnvironmentDragon1().calculateWaterDAcum());
			}
			else{
				System.out.println("No hay dragones barbados en este ambiente \n");
				System.out.println("Presione cualquier Num. para volver al inicio");
				optMenu = a.nextInt();
				switch (optMenu){
					default:
					m.menu();
					break;
				}
			}
			
		break;
		case 9:
			System.out.println("Elija el ambiente\n");
			System.out.println("1. Ambiente C1");
			System.out.println("2. Ambiente C2");
			System.out.println("3. Ambiente C3");
			System.out.println("4. Volver a inicio\n");
				
				
				optMenu = a.nextInt();
				
				switch (optMenu){
					
					default:
						System.out.println("Error en la matrixjhdsghgabdcnljeaku2545");
					break;
					
					
					case 1:
					if((m.zooExhibition.getKZone().getEnvironmentKangaroo1().evaluation()) == false){
						System.out.println("Recuerde 0.o : Ya existe un macho en este ambiente y para evitar conflictos entre los animales NO INGRESE MACHOS");
					}
					
					System.out.println("Elija un espacio que este disponible en el ambiente");
					if(m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo1() != null){
							System.out.println("1. " + m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo1().getName());
					}
					else{
							System.out.println("1. vacio");
					}
						
					if(m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo2() != null){
							System.out.println("2. " + m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo2().getName());
					}
					else{
							System.out.println("2. vacio");
					}
						
					if(m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo3() != null){
							System.out.println("3. " + m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo3().getName());
					}
					else{
							System.out.println("3. vacio");
					}
					
					System.out.println("4. Volver a inicio\n");
					
					
					optMenu = a.nextInt();
							
					int access = optMenu;
							
						switch (optMenu){
								
							default:
							System.out.println("Error en la matrixp..f-.-x,{dhuisdf");
							break;
							case 1:
							
							//Animal (String name, double weight, double height, char sex, String bloodType, String animalType, int birdDay, int birdMonth, int birdYear)
								System.out.println("Ingrese el nombre");
								String newName11 =  a.nextLine();
								newName11 =  a.nextLine();
								System.out.println("Ingrese el peso del animal");
								double newWeight11 = a.nextDouble();
								System.out.println("Ingrese la altura del animal en centimetros");
								double newHeight11 = a.nextDouble();
								System.out.println("Ingrese el sexo del animal, 'm' si es macho y 'h' si es hembra");
								char newSex11 = a.next().charAt(0);
								System.out.println("Ingrese el tipo de sangre del animal");
								String newBloodType11 = a.nextLine();
								newBloodType11 = a.nextLine();
								System.out.println("Ingrese el nombre de la especie (canguro o dragon)");
								String newAnimalType11 = a.nextLine();
								System.out.println("Ingrese el año de nacimiento");
								int newBirdYear11 = a.nextInt();
								System.out.println("Ingrese el mes de nacimiento");
								int newBirdMonth11 = a.nextInt();
								System.out.println("Ingrese el dia de nacimiento");
								int newBirdDay11 = a.nextInt();
							
							m.zooExhibition.getKZone().getEnvironmentKangaroo1().setKangaroo1(new Animal(newName11, newWeight11, newHeight11, newSex11, newBloodType11, newAnimalType11, newBirdDay11, newBirdMonth11, newBirdYear11));
							break;
							case 2:
								System.out.println("Ingrese el nombre");
								String newName12 =  a.nextLine();
								newName12 =  a.nextLine();
								System.out.println("Ingrese el peso del animal");
								double newWeight12 = a.nextDouble();
								System.out.println("Ingrese la altura del animal en centimetros");
								double newHeight12 = a.nextDouble();
								System.out.println("Ingrese el sexo del animal, 'm' si es macho y 'h' si es hembra");
								char newSex12 = a.next().charAt(0);
								System.out.println("Ingrese el tipo de sangre del animal");
								String newBloodType12 = a.nextLine();
								newBloodType12 = a.nextLine();
								System.out.println("Ingrese el nombre de la especie (canguro o dragon)");
								String newAnimalType12 = a.nextLine();
								System.out.println("Ingrese el año de nacimiento");
								int newBirdYear12 = a.nextInt();
								System.out.println("Ingrese el mes de nacimiento");
								int newBirdMonth12 = a.nextInt();
								System.out.println("Ingrese el dia de nacimiento");
								int newBirdDay12 = a.nextInt();
							
							m.zooExhibition.getKZone().getEnvironmentKangaroo1().setKangaroo2(new Animal(newName12, newWeight12, newHeight12, newSex12, newBloodType12, newAnimalType12, newBirdDay12, newBirdMonth12, newBirdYear12));
							break;
							case 3:
							System.out.println("Ingrese el nombre");
								String newName13 =  a.nextLine();
								newName13 =  a.nextLine();
								System.out.println("Ingrese el peso del animal");
								double newWeight13 = a.nextDouble();
								System.out.println("Ingrese la altura del animal en centimetros");
								double newHeight13 = a.nextDouble();
								System.out.println("Ingrese el sexo del animal, 'm' si es macho y 'h' si es hembra");
								char newSex13 = a.next().charAt(0);
								System.out.println("Ingrese el tipo de sangre del animal");
								String newBloodType13 = a.nextLine();
								newBloodType13 = a.nextLine();
								System.out.println("Ingrese el nombre de la especie (canguro o dragon)");
								String newAnimalType13 = a.nextLine();
								System.out.println("Ingrese el año de nacimiento");
								int newBirdYear13 = a.nextInt();
								System.out.println("Ingrese el mes de nacimiento");
								int newBirdMonth13 = a.nextInt();
								System.out.println("Ingrese el dia de nacimiento");
								int newBirdDay13 = a.nextInt();
							
							m.zooExhibition.getKZone().getEnvironmentKangaroo1().setKangaroo3(new Animal(newName13, newWeight13, newHeight13, newSex13, newBloodType13, newAnimalType13, newBirdDay13, newBirdMonth13, newBirdYear13));
							break;
							
							
						}
					break;
					case 2:
						if((m.zooExhibition.getKZone().getEnvironmentKangaroo2().evaluation()) == false){
						System.out.println("Recuerde 0.o : Ya existe un macho en este ambiente y para evitar conflictos entre los animales NO INGRESE MACHOS");
						}
					
						System.out.println("Elija un espacio que este disponible en el ambiente");
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo1() != null){
							System.out.println("1. " + m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo1().getName());
						}
						else{
								System.out.println("1. vacio");
						}
							
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo2() != null){
								System.out.println("2. " + m.zooExhibition.getKZone().getEnvironmentKangaroo2().getKangaroo2().getName());
						}
						else{
								System.out.println("2. vacio");
						}
							
						if(m.zooExhibition.getKZone().getEnvironmentKangaroo1().getKangaroo3() != null){
								System.out.println("3. " + m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo3().getName());
						}
						else{
								System.out.println("3. vacio");
						}
						
						System.out.println("4. Volver a inicio\n");
						
						
						optMenu = a.nextInt();
								
						
								
							switch (optMenu){
									
								default:
								System.out.println("Error en la matrixp..f-.-x,{dhuisdf");
								break;
								case 1:
								
								//Animal (String name, double weight, double height, char sex, String bloodType, String animalType, int birdDay, int birdMonth, int birdYear)
									System.out.println("Ingrese el nombre");
									String newName21 =  a.nextLine();
									newName21 =  a.nextLine();
									System.out.println("Ingrese el peso del animal");
									double newWeight21 = a.nextDouble();
									System.out.println("Ingrese la altura del animal en centimetros");
									double newHeight21 = a.nextDouble();
									System.out.println("Ingrese el sexo del animal, 'm' si es macho y 'h' si es hembra");
									char newSex21 = a.next().charAt(0);
									System.out.println("Ingrese el tipo de sangre del animal");
									String newBloodType21 = a.nextLine();
									newBloodType21 = a.nextLine();
									System.out.println("Ingrese el nombre de la especie (canguro o dragon)");
									String newAnimalType21 = a.nextLine();
									System.out.println("Ingrese el año de nacimiento");
									int newBirdYear21 = a.nextInt();
									System.out.println("Ingrese el mes de nacimiento");
									int newBirdMonth21 = a.nextInt();
									System.out.println("Ingrese el dia de nacimiento");
									int newBirdDay21 = a.nextInt();
								
								m.zooExhibition.getKZone().getEnvironmentKangaroo2().setKangaroo1(new Animal(newName21, newWeight21, newHeight21, newSex21, newBloodType21, newAnimalType21, newBirdDay21, newBirdMonth21, newBirdYear21));
								break;
								case 2:
									System.out.println("Ingrese el nombre");
									String newName22 =  a.nextLine();
									newName22 =  a.nextLine();
									System.out.println("Ingrese el peso del animal");
									double newWeight22 = a.nextDouble();
									System.out.println("Ingrese la altura del animal en centimetros");
									double newHeight22 = a.nextDouble();
									System.out.println("Ingrese el sexo del animal, 'm' si es macho y 'h' si es hembra");
									char newSex22 = a.next().charAt(0);
									System.out.println("Ingrese el tipo de sangre del animal");
									String newBloodType22 = a.nextLine();
									newBloodType22 = a.nextLine();
									System.out.println("Ingrese el nombre de la especie (canguro o dragon)");
									String newAnimalType22 = a.nextLine();
									System.out.println("Ingrese el año de nacimiento");
									int newBirdYear22 = a.nextInt();
									System.out.println("Ingrese el mes de nacimiento");
									int newBirdMonth22 = a.nextInt();
									System.out.println("Ingrese el dia de nacimiento");
									int newBirdDay22 = a.nextInt();
								
								m.zooExhibition.getKZone().getEnvironmentKangaroo2().setKangaroo2(new Animal(newName22, newWeight22, newHeight22, newSex22, newBloodType22, newAnimalType22, newBirdDay22, newBirdMonth22, newBirdYear22));
								break;
								case 3:
								System.out.println("Ingrese el nombre");
									String newName23 =  a.nextLine();
									newName23 =  a.nextLine();
									System.out.println("Ingrese el peso del animal");
									double newWeight23 = a.nextDouble();
									System.out.println("Ingrese la altura del animal en centimetros");
									double newHeight23 = a.nextDouble();
									System.out.println("Ingrese el sexo del animal, 'm' si es macho y 'h' si es hembra");
									char newSex23 = a.next().charAt(0);
									System.out.println("Ingrese el tipo de sangre del animal");
									String newBloodType23 = a.nextLine();
									newBloodType23 = a.nextLine();
									System.out.println("Ingrese el nombre de la especie (canguro o dragon)");
									String newAnimalType23 = a.nextLine();
									System.out.println("Ingrese el año de nacimiento");
									int newBirdYear23 = a.nextInt();
									System.out.println("Ingrese el mes de nacimiento");
									int newBirdMonth23 = a.nextInt();
									System.out.println("Ingrese el dia de nacimiento");
									int newBirdDay23 = a.nextInt();
								
								m.zooExhibition.getKZone().getEnvironmentKangaroo2().setKangaroo3(new Animal(newName23, newWeight23, newHeight23, newSex23, newBloodType23, newAnimalType23, newBirdDay23, newBirdMonth23, newBirdYear23));
								break;
								}
					break;
					case 3:
					if((m.zooExhibition.getKZone().getEnvironmentKangaroo3().evaluation()) == false){
						System.out.println("Recuerde 0.o : Ya existe un macho en este ambiente y para evitar conflictos entre los animales NO INGRESE MACHOS");
					}
					
					System.out.println("Elija un espacio que este disponible en el ambiente");
					if(m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo1() != null){
							System.out.println("1. " + m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo1().getName());
					}
					else{
							System.out.println("1. vacio");
					}
						
					if(m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo2() != null){
							System.out.println("2. " + m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo2().getName());
					}
					else{
							System.out.println("2. vacio");
					}
						
					if(m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo3() != null){
							System.out.println("3. " + m.zooExhibition.getKZone().getEnvironmentKangaroo3().getKangaroo3().getName());
					}
					else{
							System.out.println("3. vacio");
					}
					
					System.out.println("4. Volver a inicio\n");
					
					
					optMenu = a.nextInt();
							
					
							
						switch (optMenu){
								
							default:
							System.out.println("Error en la matrixp..f-.-x,{dhuisdf");
							break;
							case 1:
							
							//Animal (String name, double weight, double height, char sex, String bloodType, String animalType, int birdDay, int birdMonth, int birdYear)
								System.out.println("Ingrese el nombre");
								String newName31 =  a.nextLine();
								newName31 =  a.nextLine();
								System.out.println("Ingrese el peso del animal");
								double newWeight31 = a.nextDouble();
								System.out.println("Ingrese la altura del animal en centimetros");
								double newHeight31 = a.nextDouble();
								System.out.println("Ingrese el sexo del animal, 'm' si es macho y 'h' si es hembra");
								char newSex31 = a.next().charAt(0);
								System.out.println("Ingrese el tipo de sangre del animal");
								String newBloodType31 = a.nextLine();
								newBloodType31 = a.nextLine();
								System.out.println("Ingrese el nombre de la especie (canguro o dragon)");
								String newAnimalType31 = a.nextLine();
								System.out.println("Ingrese el año de nacimiento");
								int newBirdYear31 = a.nextInt();
								System.out.println("Ingrese el mes de nacimiento");
								int newBirdMonth31 = a.nextInt();
								System.out.println("Ingrese el dia de nacimiento");
								int newBirdDay31 = a.nextInt();
							
							m.zooExhibition.getKZone().getEnvironmentKangaroo3().setKangaroo1(new Animal(newName31, newWeight31, newHeight31, newSex31, newBloodType31, newAnimalType31, newBirdDay31, newBirdMonth31, newBirdYear31));
							break;
							case 2:
								System.out.println("Ingrese el nombre");
								String newName32 =  a.nextLine();
								newName32 =  a.nextLine();
								System.out.println("Ingrese el peso del animal");
								double newWeight32 = a.nextDouble();
								System.out.println("Ingrese la altura del animal en centimetros");
								double newHeight32 = a.nextDouble();
								System.out.println("Ingrese el sexo del animal, 'm' si es macho y 'h' si es hembra");
								char newSex32 = a.next().charAt(0);
								System.out.println("Ingrese el tipo de sangre del animal");
								String newBloodType32 = a.nextLine();
								newBloodType32 = a.nextLine();
								System.out.println("Ingrese el nombre de la especie (canguro o dragon)");
								String newAnimalType32 = a.nextLine();
								System.out.println("Ingrese el año de nacimiento");
								int newBirdYear32 = a.nextInt();
								System.out.println("Ingrese el mes de nacimiento");
								int newBirdMonth32 = a.nextInt();
								System.out.println("Ingrese el dia de nacimiento");
								int newBirdDay32 = a.nextInt();
							
							m.zooExhibition.getKZone().getEnvironmentKangaroo3().setKangaroo2(new Animal(newName32, newWeight32, newHeight32, newSex32, newBloodType32, newAnimalType32, newBirdDay32, newBirdMonth32, newBirdYear32));
							break;
							case 3:
							System.out.println("Ingrese el nombre");
								String newName33 =  a.nextLine();
								newName33 =  a.nextLine();
								System.out.println("Ingrese el peso del animal");
								double newWeight33 = a.nextDouble();
								System.out.println("Ingrese la altura del animal en centimetros");
								double newHeight33 = a.nextDouble();
								System.out.println("Ingrese el sexo del animal, 'm' si es macho y 'h' si es hembra");
								char newSex33 = a.next().charAt(0);
								System.out.println("Ingrese el tipo de sangre del animal");
								String newBloodType33 = a.nextLine();
								newBloodType33 = a.nextLine();
								System.out.println("Ingrese el nombre de la especie (canguro o dragon)");
								String newAnimalType33 = a.nextLine();
								System.out.println("Ingrese el año de nacimiento");
								int newBirdYear33 = a.nextInt();
								System.out.println("Ingrese el mes de nacimiento");
								int newBirdMonth33 = a.nextInt();
								System.out.println("Ingrese el dia de nacimiento");
								int newBirdDay33 = a.nextInt();
							
							m.zooExhibition.getKZone().getEnvironmentKangaroo3().setKangaroo3(new Animal(newName33, newWeight33, newHeight33, newSex33, newBloodType33, newAnimalType33, newBirdDay33, newBirdMonth33, newBirdYear33));
							break;
							
							
						}
					break;
							
					
				}
		break;		
		case 12:
			System.out.println("Lista de animales con esta caracteristica:\n");
			System.out.println("");
		break;
			
		
		
		
      }
	
	
	
	
	
	}
	
	
	
}