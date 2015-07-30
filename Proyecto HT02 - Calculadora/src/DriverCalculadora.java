import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

 public class DriverCalculadora {
	
	 
	public static void main(String[] args){
		ControladorCalculadora calcu = new ControladorCalculadora();
		
		
		try
		{
			String datos = new String(Files.readAllBytes(Paths.get("datos.txt")));
			System.out.println(datos+"\n");
			calcu.setString(datos);
			calcu.meterVector();
		}
		catch (IOException e)
		{
			System.out.println("NO EXISTE ARCHIVO 'datos.txt'");
		}
		
		if(calcu.calcularVector()==true)
		{
			System.out.println("El resultado es:"+calcu.getResultado());
		}
		else if(calcu.calcularVector()==false)
			System.out.println("El formato del documento datos.txt es incorrecto, reviselo porfavor");
	}

}
