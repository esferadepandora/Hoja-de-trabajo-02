public class Calculadora {
	/**
	 * @param archivo
	 * Funciona para meter el string del archivo a un string atributo
	 */
	public void setString(String archivo);
	/**
	 * Aqui recorre la string para pushearla 
	 */
	public void meterVector();
	/**
	 * Aqui se hacen las operaciones, luego guarda el resultado en un atributo, en caso que no este incorreccto el archivo el boolean se devuelve como falso
	 * @return
	 */
	public boolean calcularVector();
	/**
	 * Devuelve el resultado final
	 * @return
	 */
	public int getResultado();

}
