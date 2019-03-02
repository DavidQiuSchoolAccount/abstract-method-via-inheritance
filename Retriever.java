import java.security.SecureRandom;

public class Retriever extends Pet {
	public String speak() {
		SecureRandom random = new SecureRandom();
		int randomInt = random.next(101);
		if (randomInt < 50){
			return "arf";
		}
		if (randomInt < 100){
			return "woof";
		}

		// Secret surprise (if lucky)
		return "I am not a dog, but a sentient human and cannot be told to speak merely one repetetive ononomatopoeia."
	}
}