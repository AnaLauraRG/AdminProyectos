public class Prueba {
	public static void main(String[] args) {
		int uno = 0;
		int dos = 0;
		int tres = 0;
		
		System.out.println("Hola mundo... :3");
		System.out.println("Prueba. Tarea de Administración y Proyectos de Software");
		System.out.println("Integrantes: ");
		System.out.println("Flores Constantino Diego.");
		System.out.println("Kennedy Villa Carolina.");
		System.out.println("Reynoso Galvez Ana Laura.");
		System.out.println("Rojas Castañeda Karen Arleth.");
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");			
		uno = reader.nextInt();			
		System.out.print("Introduce otro número: ");
		dos = reader.nextInt();
		System.out.println("Realizando alguna operación.... ");
		tres = uno + dos;
		System.out.println("El resultado de la operación es: " + tres);
		
		System.out.println("¿Es número par o impar?");
                
                if((tres % 2) == 0){
                    System.out.println(tres+ " es número par");
                }else System.out.println(tres + " es número impar");
		
		System.out.println("Adios, mundo! ... :3");

	}

}
