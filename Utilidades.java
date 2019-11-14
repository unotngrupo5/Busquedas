import java.security.InvalidParameterException;
import java.util.Collection;

public class Utilidades {

	public static void main(String[] args) {


	}

	public static <E> boolean sequencialSearch(Collection <E> colletion,E elemento) throws InvalidParameterException{
		if (colletion == null || elemento == null) throw new InvalidParameterException("Error");
		for(E elementoIterador : colletion) {
			if (elementoIterador.equals(elemento))
				return true;
		} return false;
	}
	public static <E> boolean binarySearch(Collection <E> collection, E elemento) throws InvalidParameterException{
		if (collection == null || elemento == null) throw new InvalidParameterException("Error");
		return false;
	}
}
