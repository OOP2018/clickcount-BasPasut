package counter;

import java.util.Scanner;

/**
 * Test the Observer-Observable behavior for Counter object.
 * @author BasPasut
 *
 */
public class ObserverTest {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		// 1. create the subject (Observable)
		Counter counter = new Counter();
		// 2. create the observer with reference to subject.
		ConsoleView view = new ConsoleView(counter);
		// 3. add Observer to subject
		counter.addObserver(view);
		// 4. run the app.
		while(true){
			System.out.println("how much? ");
			int howmuch = console.nextInt();
			counter.add(howmuch);
		}
	}
}
