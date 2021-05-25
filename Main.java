import javax.swing.JOptionPane;

public class Main {
	

	public static void main (String [] args) {
	String[] opciones = {"Simon","Nel"};
	String[] Tik = {"Si","No"};
	String[] game = {"LOL","Fortnite","FIFA","Ninguno"};
	String[] music = {"Reggaeton","Banda","otro"};
	String[] anime = {"Si","No","Yamete Kudasai"};
	String[] friki = {"Si","Leve","No","No porque ai covi"};
	String[] baño = {"Diario","Cada 3 dias","¿Queseso?"};
	String[] tomi = {"si", "La sangre de cristo tiene poder","Ni con todos sus subs"};
	String[] pro = {"AMD","INTEL"}; 
	String[] joahan = {"Si","No","Cada que respire","Y Rosa Delia tambien"};
	String[] renuente = {"Ni pedo","Me reuso","Tas bien¿"};
	String[] renuente2 = {"Metele nitro pa","Ya callate alv"};
	String[] bot = {"Ni modo asi es la vida","No me cuentes tu vida crack"};
	String[] reto = {"Continuar con el Test","¿Es todo lo que tienes?"};
	String[] reto2 = {"Ya ahora si amonos","Echate otro mejor"};
	String[] reto3 = {"Continuar con el Test","Estuvo bueno mi pana"}; 
	String[] Tara = {"Yo tambien ","Ya sabia","Yo no"}; 
	
	boolean seguir = false;
	int  puntuacion = 200, aleatorio, piola,a,b,c;
	int x = 0;
	String sig = "";
	long adivinar;
	float aleatorio2;
	double adivinar6, resultado2,resultado,adivinar2;
	
	/*int color = JOptionPane.showInputDialog(null,"Seleccione Un Color",
			   "COLORES", JOptionPane.QUESTION_MESSAGE, null,
			  new Object[] { "Seleccione","Amarillo", "Azul", "Rojo" },"Seleccione");*/
	
	do {
		//primer cuadro 
		int opcion = JOptionPane.showOptionDialog(null,"Bot Test para saber que tipo de Inge eres\n¿Deseas participar?","Brandon Filth",JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, opciones, opciones[00]);
		
	
		if(opcion == 0) {
			
			String nombre  = JOptionPane.showInputDialog(null, "Ingresa tu nombre: ","Brandon Filth ",JOptionPane.ERROR_MESSAGE);
			
			
			
			int elegir = JOptionPane.showOptionDialog(null,"Pregunta 1 de 10:\n¿Grabas o usas TikTok? ","Brandon Filth",JOptionPane.CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, Tik, Tik[00]);
			
				if(elegir == 0) {//si
					puntuacion -=20;
				}
				else if (elegir ==1){
					puntuacion += 5;
				}
				
			int elegir2 = JOptionPane.showOptionDialog(null,"Pregunta 2 de 10:\n¿Que prefieres? ","Brandon Filth",JOptionPane.CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, game, game[00]);
				
				if(elegir2 == 0) { //LOL
					puntuacion -=30;
				
				}
				else if (elegir2 ==1){//Fortnite
					puntuacion -=20;
				}	
				else if(elegir2==2) {//FIFA
					puntuacion -=30;
				}
				else if(elegir2==3) {//Ninguno
					puntuacion += 0;
				}
				
			int elegir3 = JOptionPane.showOptionDialog(null,"Pregunta 3 de 10:\nElije: Reggaeton, Banda u otro ","Brandon Filth",JOptionPane.CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, music, music[00]);
				
				if(elegir3 == 0) {//Reggaeton
					puntuacion -=40;
				
				}
				else if (elegir3 ==1){//banda
					puntuacion -=20;
				}	
			
				else if (elegir3 ==2){//otro
					puntuacion +=10;
				}	
			int elegir4 = JOptionPane.showOptionDialog(null,"Pregunta 4 de 10:\n¿Te gusta el anime? ","Brandon Filth",JOptionPane.CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, anime, anime[00]);
				
				if(elegir4 == 0) {//si
					puntuacion -=20;
				
				}
				else if (elegir4 ==1){//no
					puntuacion +=5;
				}	
			
				else if (elegir4 ==2){//yamete
					puntuacion -=10;
				}
			int elegir5 = JOptionPane.showOptionDialog(null,"Pregunta 5 de 10:\n¿Te gusta frecuentar la Frikiplaza? ","Brandon Filth",JOptionPane.CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, friki, friki[00]);
				
				if(elegir5 == 0) {//si 
					puntuacion -=20;
				
				}
				else if (elegir5 ==1){//leve
					puntuacion -=20;
				}	
			
				else if (elegir5 ==2){//no
					puntuacion +=10;
				}
				else if (elegir5==3) {//no porque ai covi
					puntuacion +=5;
				}
			int elegir6 = JOptionPane.showOptionDialog(null,"Pregunta 6 de 10:\n¿Cada cuando te bañas?","Brandon Filth",JOptionPane.CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, baño, baño[00]);
				
				if(elegir6 == 0) {//Todos los dias
					puntuacion +=5;
				
				}
				else if (elegir6 ==1){//cada tercer dia
					puntuacion -=20;
				}	
			
				else if (elegir6 ==2){//queseso
					puntuacion -=20;
				}
				
			int elegir7 = JOptionPane.showOptionDialog(null,"Pregunta 7 de 10:\n¿Tomi11 vencera el cancer? ","Brandon Filth",JOptionPane.CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, tomi, tomi[00]);
				
				if(elegir7 == 0) {//si
					puntuacion +=10;
				
				}
				else if (elegir7 ==1){//la sandre de cristo
					puntuacion +=10;
				}	
			
				else if (elegir7 ==2){
					puntuacion -=20;//Ni con todos sus subs
				}
				
			int elegir8 = JOptionPane.showOptionDialog(null,"Pregunta 8 de 10:\n¿AMD o INTEL? ","Brandon Filth",JOptionPane.CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, pro,pro [00]);
				
				if(elegir8 == 0) {//AMD
					puntuacion +=5;
				
				}
				else if (elegir8 ==1){//INTEL
					puntuacion -=10;
				}	
			
			
			int elegir9 = JOptionPane.showOptionDialog(null,"Pregunta 9 de 10:\n¿Que chingue a su madre Joahan? ","Brandon Filth",JOptionPane.CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null,joahan , joahan[00]);
				
				if(elegir9 == 0) {//Si
					puntuacion +=5;
				
				}
				else if (elegir9 ==1){//no
					puntuacion -=20;
				}	
			
				else if (elegir9 ==2){//cada que resire
					puntuacion +=10;
				}
				else if (elegir9 ==3){//y rosa delia tambien 
					puntuacion +=10;
				}
				do {
				String elegir10 = (String) JOptionPane.showInputDialog(null,"¿Cual es tu signo zodiacal?","Brandon Filth", JOptionPane.ERROR_MESSAGE, null,new Object[] { "Seleccione","Aries", "Tauro", "Géminis","Cáncer","Leo","Virgo","Libra","Escorpio","Sagitario","Capricornio","Acuario","Piscis" },"Seleccione");	
				
				if(elegir10 == "Aries") {
					sig="Aries";
				
				}
				else if (elegir10 =="Seleccione"){
					sig ="false";
				}
				else if (elegir10 =="Tauro"){
					sig ="Tauro";
				}	
				else if (elegir10 =="Géminis"){
					sig="Géminis";
				}
				else if (elegir10 =="Leo"){
					sig ="Leo";
					
				}else if (elegir10 =="Virgo"){
					sig="Virgo";
				}
				else if (elegir10 =="Libra"){
					sig="Libra";
				}
				else if (elegir10 =="Escorpio"){
					sig="Escorpio";
				}
				else if (elegir10 =="Sagitario"){
					sig="Sagitario";
				}
				else if (elegir10 =="Capricornio"){
					sig ="Capricornio";
				}
				else if (elegir10 =="Acuario"){
					sig ="Acuario";
				}
				}while(sig == "false");
				seguir = false;
				
				System.out.println(puntuacion);
				JOptionPane.showMessageDialog(null,nombre+" has terminado el Bot Test, estamos evaluando tus respuestas... ","Brandon Filth",JOptionPane.INFORMATION_MESSAGE);
				
				//Inicio analisis________________________
				if (puntuacion >-50 && puntuacion <=0) {
					JOptionPane.showMessageDialog(null,nombre+" tu puntuacion fue "+puntuacion+" y segun tu puntuación puedo percatarme de que eres un inge bastante deplorable,"
							+ "\nno logro comprender como es que sigues vivo y como es que entraste a la carrera,"
							+ "\nese tipo de personas no merecen estar en este planeta eres del 0.0000001% de personas\n"
							+ "que obtienen esa calificacion "
							+ "deberias comenzar a ser mas sociable,deja de consumir de ese tipo de material\n"
							+ "comestible y audiovisual que tenga efectos estupefacientes y para acabarla de chingar eres "+sig,"Brandon Filth",JOptionPane.INFORMATION_MESSAGE);
				}
				 else if(puntuacion >0 && puntuacion <=20) {
				JOptionPane.showMessageDialog(null,nombre+" tu puntuacion fue "+puntuacion+" y segun tu puntuacion puedo percatarme de que eres un inge muy raro pero soportable"
							+ "\nse nota que eres el tipico inge que no entiende lo que esta haciendo pero de algun modo sale bien\n "
							+ "esperemos que dejes de ser virgen pronto... animo pinche raro que para acabarla de chingar eres "+sig,"Brandon Filth",JOptionPane.INFORMATION_MESSAGE);
				}
				 else if(puntuacion >20 && puntuacion <=50) {
					JOptionPane.showMessageDialog(null,nombre+" tu puntuacion fue "+puntuacion+" y segun tu puntuacion puedo percatarme de que eres un inge que posee todas las caracterizticas del tipico otaku mugroso"
							+ "\nque solo se la pasa en la frikiplaza comiendo ramen, viendo hentai y jugando Yu-Gi-Oh,espero que dejes de ser virgo pronto...\n "
							+ " animo pinche otaku que ver monas chinas todo el dia no es productivo lo peor de todo es que eres "+sig,"Brandon Filth",JOptionPane.INFORMATION_MESSAGE);
				}
				 else if(puntuacion >50  && puntuacion <=80) {
					JOptionPane.showMessageDialog(null,nombre+" tu puntuacion fue "+puntuacion+" y segun tu puntuacion NEGATIVA puedo percatarme de que eres un inge que deberias comenzar a estudiar un poco mas y a hacer ejercicio\n"
							+ "el mando o teclado no es suficiente ejercicio mi pana, levanta ese trasero y ve a hacer un poco de ejercicio.. a menos de que quieras \n "
							+ "llegar a los 30 años todo obeso, calvo y virgen... animo pinche holgazan que para acabarla de chingar eres "+sig,"Brandon Filth",JOptionPane.INFORMATION_MESSAGE);
				}
				 else if(puntuacion >80 && puntuacion <=110) {
					JOptionPane.showMessageDialog(null,nombre+" tu puntuacion fue "+puntuacion+" y segun tu puntuacion puedo percatarme de que eres un inge que posee todas las caracterizticas del tipico otaku mugroso"
							+ "\nque solo se la pasa en la frikiplaza comiendo ramen, viendo hentai y jugando Yu-Gi-Oh,espero que dejes de ser virgo pronto...\n "
							+ " animo pinche otaku que para acabarla de chingar eres "+sig+" y ver monas chinas todo el dia no es productivo ","Brandon Filth",JOptionPane.INFORMATION_MESSAGE);
				}
				 else if(puntuacion >110 && puntuacion <=140) {
					JOptionPane.showMessageDialog(null,nombre+" tu puntuacion fue "+puntuacion+" me di cuenta de que eres "+sig+" pero no importa, te voy a atender de todas formas segun tu puntuacion puedo percatarme de que"
							+ "\neres el inge que no sabia que carrera elegir y termino elijiendo esto... tal vez estas aqui por influencia de terceros, tal vez estas aqui porque te interesa mucho y no sabes como o por donde empezar...\n"
							+ "sea la razon que sea animo pinche inge... Tienes que terminar lo que estas empezando porque... ¿y si no eres tu quien?","Brandon Filth",JOptionPane.INFORMATION_MESSAGE);
				}
				 else if (puntuacion >140 && puntuacion <=170) {
					 
					JOptionPane.showMessageDialog(null,nombre+" tu puntuacion fue "+puntuacion+" y segun tu puntuacion puedo percatarme de que estas medianamente dañado sicologicamente pero"
							+ "\nno estas perdido, aun queda mucho camino por recorrer... Recuerda que no estas solo y si pudiste con todo antes puedes ahora, solo es un cambio respectivo a tu madurez\n "
							+ " animo pinche "+sig+" que ese titulo no se consigue solo","Brandon Filth",JOptionPane.INFORMATION_MESSAGE);
				}
				 else if(puntuacion >170 && puntuacion <=200) {
					JOptionPane.showMessageDialog(null,nombre+" tu puntuacion fue "+puntuacion+" y segun tu puntuacion puedo percatarme de que eres un inge que posee todas las caracterizticas de tipico inge que se la pasa"
							+ "\npiediendo las tareas, pero animo... ponte a estudiar pa' que digan !Al inge le gustan las monas chinas¡\n "
							+ " animo pinche "+sig+" otaku que ver monas chinas todo el dia no es productivo... Recuerda que es mejor poco a poco todos los dias que mucho de vez en cuando...","Brandon Filth",JOptionPane.INFORMATION_MESSAGE);
				}
				 else if(puntuacion >200 && puntuacion <=220) {
					JOptionPane.showMessageDialog(null,nombre+" tu puntuacion fue "+puntuacion+" y segun tu puntuacion puedo percatarme de que eres un inge que posee todas las caracterizticas de tipico inge que se la pasa"
							+ "\nestudiando y haciendo tarea mas tiempo del que duerme, pero animo que todo ese esfuerzo sera recompensado en el futuro, no te desanimes que tu y yo sabemos de lo que eres capaz \n "
							+ " animo pinche "+sig+". Recuerda que es mejor poco a poco todos los dias que mucho de vez en cuando...","Brandon Filth",JOptionPane.INFORMATION_MESSAGE);
				
				 }
				 else if(puntuacion >220 && puntuacion <=240) {
					 JOptionPane.showMessageDialog(null,nombre+" tu puntuacion fue "+puntuacion+" y segun tu puntuacion puedo percatarme de que eres un inge un tanto habilidoso, se nota que asistes todos los domingos a misa"
								+ "\nte confiezas y comulgas como dios manda... ademas de que me pude percatar de que tienes buenos gustos, pero deja de valer tanta madre en la escuela mi pana... haz las actividades con esas ganas que\n "
								+ "te trajeron a donde estas ahora... animo pinche "+sig+" hevon que ese titulo no se va a conceguir solo... y recuerda nunca pares de aprender... vas muy bien !Animo futuro ingeniero¡","Brandon Filth",JOptionPane.INFORMATION_MESSAGE);
						
					
				}
				 else if(puntuacion >240 && puntuacion <=260) {
					 JOptionPane.showMessageDialog(null,nombre+" tu puntuacion fue "+puntuacion+" y segun tu puntuacion puedo percatarme de que casi llegas a la perfeccion, te esta faltando un poco..."
								+ "\n deberias deshacerte de los distractores y comenzar a centrarte en lo que verdaderamente importa, alimentate un poco mejor y deja de apoyar el shitpost \n "
								+ "ah... por cierto deja de usar el modo claro, se que aun lo sigues usando pinche "+sig+" enfermo","Brandon Filth",JOptionPane.INFORMATION_MESSAGE);
					
				}
				JOptionPane.showMessageDialog(null,nombre+" seas el inge que seas recuerda estos consejos para lograr tus metas:\n"
						+ "• Eres lo que mides\n"
						+ "• No te compares con nadie a menos de que te sirva de motivacion\n"
						+ "• Si alguien pudo hacerlo, tu tambien puedes y si nadie ha podido... Tu puedes ser el primero en hacerlo\n"
						+ "• Convierte tus limitaciones en nuevas opiciones\n"
						+ "• Y lo mas importante... Confia en ti, los limites los pones tu mismo","Brandon Filth",JOptionPane.INFORMATION_MESSAGE);
				break;
			
				}//Fin de caso que elija si__________________________________________
		
		 //Fin analisis_______________________________________________
		else if(opcion ==1) {//en caso de que elija no........................................................................
			int elegir = JOptionPane.showOptionDialog(null,"Me vale riata, lo vas a hacer de todos modos compa","Brandon Filth",JOptionPane.CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, renuente, renuente[00]);
				if(elegir==0) {//Primer if inicio del anidado_____________________________________________________________
					int elegir2 = JOptionPane.showOptionDialog(null,"Ves... Que te costaba?","Brandon Filth",JOptionPane.CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, renuente2, renuente2[00]);
					if(elegir2==0) {
						JOptionPane.showMessageDialog(null,"Menos 10 puntos, relajate un poco","Brandon Filth",JOptionPane.ERROR_MESSAGE);
						puntuacion-=10;
						}
					
					if(elegir2 ==1) {
						JOptionPane.showMessageDialog(null,"Menos 10 puntos, por grosero","Brandon Filth",JOptionPane.ERROR_MESSAGE);
						puntuacion-=10;
					}
					
						
						//En caso de que elija: Me reuso_______________________________________
				}
				if(elegir ==1) {
					JOptionPane.showMessageDialog(null,"Pues... Aunque no quieras, vas pa aya");
				}
				//En caso de que elija: tas bien¿
				if(elegir==2) {
					int elegir2 = JOptionPane.showOptionDialog(null,"Fui programado sin sentimientos, pero digamos que estoy bien","Brandon Filth",JOptionPane.CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, bot,bot[00]);
					if(elegir2==0 || elegir2 ==1) {
						 JOptionPane.showMessageDialog(null,"Que mala onda eres con el bot :(");
					}
				}
			
		
			do {//FilthCaptcha___________________________________________________________________________________________________________
				aleatorio = (int)(Math.random()*999999999);
			 adivinar= Integer.parseInt(JOptionPane.showInputDialog(null,"Confirma que no eres un robot:\nQue numero es este: "+aleatorio+"\n","Brandon Filth",JOptionPane.ERROR_MESSAGE));
			 if(aleatorio == adivinar) {
				 //______________________________________________________________________
				 piola = JOptionPane.showOptionDialog(null,"¡Felicidades has completado el Braptcha!","Brandon Filth",JOptionPane.CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, reto,reto[00]);
				 if(piola == 0) {
					 seguir =true;
				 }
				 else if(piola ==1) {//Es todo lo que tienes? captcha2________________________________________
				 do {
					 do {
						aleatorio2 = (int)(Math.random()*15);
					 }while(aleatorio2 ==0);
					 //do {
						adivinar2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Confirma que no eres un robot:\n¿Cual es el area de un circulo con un radio de: "+aleatorio2+"cm\n\nTip: Ingresa todos los decimales resultantes\ntomando a pi con un valor de 3.1416\n","Brandon Filth",JOptionPane.INFORMATION_MESSAGE));
						  resultado = (3.1416)*(aleatorio2*aleatorio2);
					// }while(adivinar != resultado);
						  if(resultado == adivinar2) {
							  puntuacion =+10;	
							int  piola2 = JOptionPane.showOptionDialog(null,"¡Felicidades has completado el Braptcha 2.0!","Brandon Filth",JOptionPane.CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, reto2,reto2[00]);
							 if(piola2 ==0) {
								 seguir = true;
							 }
								 if(piola2 ==1) {//Captcha3________________________________________________
								 do {
									 do {
									a = (int)(Math.random()*3);
								 	b = (int)(Math.random()*9);
									c = (int)(Math.random()*15);
									}while(a == 0 || b == 0 || c ==0 || a == 0 && b == 0 || b == 0 && c == 0 ||
										a == 0 && c == 0 || a == 0 && b == 0 && c == 0 || a>b || b>c  || b == c || a==b || a==c);
									double d = (b*b)-(4*a*c);
									
									resultado2 =((-b + Math.sqrt(d))/2*a);
									
								adivinar6 = Double.parseDouble(JOptionPane.showInputDialog(null,"Confirma que no eres un robot:\nResuelve la formula general de las ecuaciones\ncon los siguientes valores...\nA = "+a+"\nB = "+b+"\nC = "+c+"\n\nTip: Ingresa todos los decimales resultantes\ny utiliza solo el x1 o positivo a la hora de resolverlo","Brandon Filth",JOptionPane.INFORMATION_MESSAGE));
							if(adivinar6 == resultado2) {
								puntuacion =+10;
								JOptionPane.showMessageDialog(null,"se nota que eres un individuo con muy buenos gustos"
										+ "\nmuy buena cultura, gracia y exelente porte, la combinacion perfecta, sin duda el mundo necesita mas personas como tu...\n "
										+ "asi que sientete orgulloso por eso y recuerda nunca pares de aprender... vas muy bien !Animo futuro ingeniero¡","Brandon Filth",JOptionPane.INFORMATION_MESSAGE);
								piola2 = JOptionPane.showOptionDialog(null,"¡Felicidades has completado el Braptcha 3.0!","Brandon Filth",JOptionPane.CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, reto3,reto3[00]);
								
							}
							
							else{
							
								JOptionPane.showMessageDialog(null,"¡Felicidades! Eres un pendejo, respuesta incorrecta");
							}x= x+1;
								 }while(adivinar6 != resultado2 || x>5);
					
							 }//Captcha3________________________________________________________________  
							 
						  }
							 else {
								 JOptionPane.showMessageDialog(null,"¡Felicidades! Eres un pendejo, respuesta incorrecta");
							 }
						  
					}while(adivinar2!=resultado);//Captcha2_____________
				 
				 }//Fin de todo lo que tienes?______________
					
			 }//Fin del primer if correcto_______________________________
			 else {
				 JOptionPane.showMessageDialog(null,"¡Felicidades! Eres un pendejo, numero incorrecto ");
			 }//Else de el primer captcha
				}while(adivinar != aleatorio );//Fin captcha1_________________________
			
			
			
			seguir = true;
		}//Else if Caso: no____________________________________
		//Completacion del test_____________
		
	}while(seguir == true);// while primera opcion 
	}//Metodo Main
	
	
	}//Class Main
