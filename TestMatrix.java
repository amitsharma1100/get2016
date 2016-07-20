package session1.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestMatrix {

	Matrix matrix;
	int matrix1[][];
	int matrix2[][];

	@Before
	public void setUp() throws Exception {
		matrix=new Matrix();
		matrix1=new int[2][3];
		matrix2=new int[3][3];
		matrix.initializeMatrixDimensions(2,2);
		
		
	}

	@Test
	public void testMatrix() {
		assertEquals(true,matrix.addELements(2, 1, 0));
		
	}

}
