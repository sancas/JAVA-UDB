import java.util.*;
import javax.swing.JOptionPane;

public class tarea {
    
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String nombre = "";
        
        int edad;
        
        System.out.print("Ingrese su nombre: ");
        nombre = reader.nextLine();

		do {
			System.out.print("Ingrese su edad: ");
			edad = reader.nextInt();
			if (edad <= 0)
				JOptionPane.showMessageDialog(null, "Solo numeros positivos");
		} while (edad <= 0);

        edad = reader.nextInt();
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
