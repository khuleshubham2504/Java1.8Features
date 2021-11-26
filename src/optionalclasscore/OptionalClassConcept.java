package optionalclasscore;

import java.util.Optional;

public class OptionalClassConcept {
	public static void main(String[] args) {

		String cName = "Tech-Mahindra";

		Optional<String> ss = Optional.ofNullable(cName);

		if (ss.isPresent()) {
			System.out.println(cName.charAt(1));
		} else {
			System.out.println("null");
		}

	}
}
