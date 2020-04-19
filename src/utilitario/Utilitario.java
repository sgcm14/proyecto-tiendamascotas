package utilitario;

import java.util.List;

import clases.Mascota;

public class Utilitario {
	
	
	public static void listaMascotas(List<Mascota> mascotas) {
		//pinta todas las mascotas
		
		System.out.println("\n");
		System.out.println("LISTA DE MASCOTAS");
		System.out.println("================\n");
		System.out.println("ID\tNOMBRE\t\tRAZA\t\t         PRECIO");
		System.out.println("==========================================================");
		
		for (Mascota mascota : mascotas) {
			System.out.println(mascota.getId()+"\t"+mascota.getNombre()+"\t\t"+mascota.getRaza()+"\t\t"+mascota.getPrecio());
		}
		
	}

}
