/*Como para los ejercicios 3 y 4 necesitamos la excepcion ArrayIndexOutOfBoundsException
 * y para el 6 la IllegalArgumentException usaremos aquí RuntimeException que es
 * padre de las 2 anteriores*/
public class BinaryStringException extends RuntimeException{
	public BinaryStringException(String msg)
	{
		super(msg);
	}
}
