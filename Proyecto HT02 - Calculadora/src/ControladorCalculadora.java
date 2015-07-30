public class ControladorCalculadora implements Calculadora {

	
	private String cadena;
	private int resultado;
	Stack<Character> miStack = new StackVector<Character>();
	
	public ControladorCalculadora()
	{
		cadena="";
		resultado=0;
	}
	
	/* (non-Javadoc)
	 * @see Calculadora#setString(java.lang.String)
	 */
	@Override
	public void setString(String archivo) {
		// TODO Auto-generated method stub
		cadena=archivo;
		
	}

	/* (non-Javadoc)
	 * @see Calculadora#meterVector()
	 */
	public void meterVector() {
		// TODO Auto-generated method stub
		for(int i=(cadena.length()-1);i>=0;i--)
		{
			miStack.push(cadena.charAt(i));
		}
	}

	/* (non-Javadoc)
	 * @see Calculadora#calcularVector()
	 */
	@Override
	public boolean calcularVector() {
		
		int operando1=0;//Funciona como primer operando y/o acumulador
		int operando2=0;//Aqui se carga el segundo operando o el siguiente a leer
		boolean bOperando=false;//Bandera que utilizo para saber si ya tengo 2 operandos para la operacion
		int lCadena=cadena.length()-1;
		char caracter=0;
		boolean bandera=true;//Sirve para saber que se hagan los ifs
		
		//caracter=miStack.peek();
		try
		{
			if(miStack.peek()<48||miStack.peek()>57&& bandera==true)
			{
				bandera=false;
			}
			else
			{
				/*try
				{*/
					caracter=miStack.peek();
					
				if(miStack.peek()>=48&&miStack.peek()<=57)
				{
					caracter=miStack.pop();
					operando1=Character.getNumericValue(caracter);
					lCadena-=1;
					while(bandera==true&&lCadena>=0)
					{
							/*try
							{*/
								if(miStack.peek()==32)
								{
									caracter=miStack.pop();
									lCadena-=1;
									if(miStack.peek()>=48&&miStack.peek()<=57&&bOperando==false)
									{
										caracter=miStack.pop();
										operando2=Character.getNumericValue(caracter);
										lCadena-=1;
										bOperando=true;
									}
									else if (miStack.peek()=='+'||miStack.peek()=='-'||miStack.peek()=='*'||miStack.peek()=='/'&&bOperando==true)
									{
										caracter=miStack.pop();
										lCadena-=1;
										bOperando=false;
										/*try
										{*/
											if(caracter=='+')
												operando1=operando1+operando2;
											if(caracter=='-')
												operando1=operando1-operando2;
											if(caracter=='*')
												operando1=operando1*operando2;
											if(caracter=='/'&&operando2!=0)
												operando1=operando1/operando2;
											if(caracter=='/'&&operando2==0)
											{
												System.out.println("Error,division por cero!");
												bandera=false;
											}
											
										/*}
										catch(Exception e)
										{
											bandera=false;
											lCadena-=1;
										}*/
									}
									else if (miStack.peek()!='+'||miStack.peek()!='-'||miStack.peek()!='*'||miStack.peek()!='/'&&bandera==true)
									{
										bandera=false;
									}
									
								}
								else if(miStack.peek()!=32)
								{
									bandera=false;
								}
								
							/*}
							catch (Exception e)
							{
								bandera=false;
							}*/
					}//Aqui termina el while
				}
				/*}
				catch (Exception e)
				{
					bandera=false;
				}*/
			}
	}
	catch (Exception e)
	{
		bandera=false;
	}
		resultado=operando1;	
		return bandera;
	}

	/* (non-Javadoc)
	 * @see Calculadora#getResultado()
	 */
	@Override
	public int getResultado() {
		// TODO Auto-generated method stub
		return resultado;
	}
}
