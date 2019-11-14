import junit.framework.TestCase;
import java.util.ArrayList;

public class TestBusqueda extends TestCase{

	public static void main(String[] args) {
	}
	public void setUp() {
		//precondiciones
		//ArrayList<Integer> integer;
	}
	public void testSeqSearchEsta() {
		ArrayList<Integer> collec = new ArrayList<Integer>();
		collec.add(8);
		collec.add(3);
		collec.add(9);
		assertEquals(true, Utilidades.sequencialSearch(collec, 3));
	}

	public void testSeqSearchNoEsta() {
		ArrayList<Integer> collec = new ArrayList<Integer>();
		collec.add(8);
		collec.add(3);
		collec.add(6);
		assertEquals(false, Utilidades.sequencialSearch(collec, 9));
	}
	public void testBinSearchEsta() {

	}
	public void testBinSearchNoEsta() {

	}
	public void tearDown() {
		//postcondicions
	}
}
