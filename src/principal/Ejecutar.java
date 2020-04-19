package principal;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import clases.Mascota;
import clases.TipoMascota;
import clases.Venta;
import utilitario.Utilitario;

public class Ejecutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		TipoMascota tipo1= new TipoMascota(1,"Perro");
		
		ArrayList<TipoMascota> tipos = new ArrayList<TipoMascota>();	
		
		tipos.add(tipo1);
		
		//--------------------------------------------------------------
		
		Mascota mascota1= new Mascota(1,"Gorda","shitzuth",1000,tipo1);
		Mascota mascota2= new Mascota(2,"Scot","labrador",2000,tipo1);
		Mascota mascota3= new Mascota(3,"Maylo","labrador",1500,tipo1);
		
		ArrayList<Mascota> mascotas = new ArrayList<Mascota>();	
		
		mascotas.add(mascota1);
		mascotas.add(mascota2);
		mascotas.add(mascota3);
		
		//--------------------------------------------------------------
		
	
		ArrayList<Venta> canasta = new ArrayList<Venta>();	
				

		System.out.println("TIENDA DE MASCOTAS");
		System.out.println("==================");
		
		int opcion = 0;
		int idVenta = 0;
		double subtotal = 0;
		double total = 0;
		
		do {
			Scanner sc = new Scanner(System.in);
			if(opcion == 0) {
				System.out.println("MENÚ PRINCIPAL");
				System.out.println("--------------");
				
				System.out.println("(1) Lista de Mascotas");
				System.out.println("(2) Comprar Mascota");
				System.out.println("(3) Ver Canasta");
				System.out.println("(99) Salir");
				System.out.print("Ingrese opción: ");
				opcion = sc.nextInt();


			}		
						
			
			switch (opcion) {
			case 1:
				
				Utilitario.listaMascotas(mascotas);
				
				System.out.println("\nOpciones: ");
				System.out.println("(6) Agregar Mascota");  //<<<<--- IMPLEMTAR
				System.out.println("(0) Menú principal");
				
				System.out.print("Ingrese opción: ");
				opcion = sc.nextInt();
				System.out.println("\n");
				
				if(opcion == 6) {
					
					Mascota mascotaNueva = new Mascota();
					
					System.out.print("Ingrese el ID:");
					mascotaNueva.setId(sc.nextInt());
					System.out.print("Ingrese nombre: ");
					mascotaNueva.setNombre(sc.next());
					System.out.print("Ingrese raza: ");
					mascotaNueva.setRaza(sc.next()+"\t");
					System.out.print("Ingrese precio: ");
					mascotaNueva.setPrecio(sc.nextDouble());
					System.out.print("Ingrese tipo: ");
					mascotaNueva.setTipo(tipo1);
					
					mascotas.add(mascotaNueva);
					
					opcion = 1;
					
					
				}
				
				
				break;
				
			case 2:
				Utilitario.listaMascotas(mascotas);
				
				System.out.println("\nOpciones: ");
				System.out.println("(7) Comprar Mascota");
				System.out.println("(0) Menú principal");
				
				System.out.print("Ingrese opción: ");
				opcion = sc.nextInt();
				System.out.println("\n");
				
				if(opcion == 7) {
					
					System.out.print("Ingrese ID de la Mascota: ");
					int idMascota = sc.nextInt();
					
					Mascota mascotaComprada = new Mascota();
					for (Mascota m : mascotas) {
						if(m.getId() == idMascota) {
							mascotaComprada = m;
							idVenta++;
							mascotas.remove(m);
							break;
						}
					}
					
					Venta nuevaVenta = new Venta(idVenta, new Date(), mascotaComprada, mascotaComprada.getPrecio(), 1);
					
					canasta.add(nuevaVenta);
					
					System.out.println("Mascota agregada correctamente!!");
					
					opcion = 2;
					
				}
				
				
				break;
				
			case 3:
				System.out.println("\n");
				System.out.println("MI CANASTA DE COMPRAS");
				System.out.println("================\n");
				System.out.println("ID\tPRODUCTO\t\tPRECIO\t\t         CANT.\t\tSUBTOTAL");
				System.out.println("===========================================================================");
				
				if(canasta.isEmpty()) {
					System.out.println("--Su canasta está vacía--");
				}
				
				
				for (Venta ca : canasta) {
					subtotal = ca.getCantidad()*ca.getMascota().getPrecio();
					total += subtotal;
					System.out.println(ca.getId()+"\t"+ca.getMascota().getNombre()+"\t\t\t"+ca.getMascota().getPrecio()
							+"\t\t\t"+ca.getCantidad()+"\t\t"+subtotal);
					
				}
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("\t\t\t\t\t\tTOTAL S/. "+total);
				
				System.out.println();
				System.out.println("\nOpciones: ");
				System.out.println("(0) Menú principal");
				
				System.out.print("Ingrese opción: ");
				opcion = sc.nextInt();
				System.out.println("\n");
				
				break;
				
			}
			
			
		}while(opcion != 99);
		
		
		
		
		
	}

}
