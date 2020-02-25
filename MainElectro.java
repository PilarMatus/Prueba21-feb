package PruebaElectrodomesticos;


public class MainElectro {

	
	public static void main(String[] args ) {
		
		  Electrodomesticos listaElectrodomesticos[]=new Electrodomesticos[10];
	        listaElectrodomesticos[0]=new Electrodomesticos(150000, 60, 'C', "rojo");
	        listaElectrodomesticos[1]=new Lavadora(200000, 30);
	        listaElectrodomesticos[2]=new Televisor(350000, 80, 'E', "negro", 42, false);
	        listaElectrodomesticos[3]=new Electrodomesticos();
	        listaElectrodomesticos[4]=new Electrodomesticos(400000, 20, 'D', "gris");
	        listaElectrodomesticos[5]=new Lavadora(250000, 40, 'Z', "blanco", 40);
	        listaElectrodomesticos[6]=new Televisor(220000, 70);
	        listaElectrodomesticos[7]=new Lavadora(340000, 100, 'A', "azul", 15);
	        listaElectrodomesticos[8]=new Televisor(200000, 60, 'C', "negro", 30, true);
	        listaElectrodomesticos[9]=new Electrodomesticos(399000, 10);
	        double sumaElectrodomesticos=0;
	        double sumaTelevisiones=0;
	        double sumaLavadoras=0;
	        for(int i=0;i<listaElectrodomesticos.length;i++){
	            if(listaElectrodomesticos[i] instanceof Electrodomesticos){
	                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
	            }
	            if(listaElectrodomesticos[i] instanceof Lavadora){
	                sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
	            }
	            if(listaElectrodomesticos[i] instanceof Televisor){
	                sumaTelevisiones+=listaElectrodomesticos[i].precioFinal();
	            }
	        }
	        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
	        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
	        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);
	    }
	}