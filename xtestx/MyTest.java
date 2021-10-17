import java.io.IOException;

public class MyTest {
	public static void main(String[] args) throws IOException {
		System.out.println( new String( MyTest.class.getResourceAsStream( "/myres" ).readAllBytes() ) );
	}
}
