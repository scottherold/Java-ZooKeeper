// Imports Gorilla class from the package
import com.sherold.animals.Gorilla;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla g = new Gorilla();
		
		g.throwSomething();
		g.throwSomething();
		g.throwSomething();
		g.displayEnergy();
		
		g.eatBananas();
		g.eatBananas();
		g.displayEnergy();
		
		g.climb();
		g.displayEnergy();
	}

}
