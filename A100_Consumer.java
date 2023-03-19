import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class A100_Consumer {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("hello");
		names.add("junior");
		names.add("jol");

		Consumer<String> f = name -> System.out.println(name);
		names.forEach((name) -> {
			f.accept(name);
		});

	}
}
