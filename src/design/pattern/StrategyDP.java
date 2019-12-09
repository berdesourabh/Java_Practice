package design.pattern;

public class StrategyDP {

	public static void main(String[] args) {
		StrategyContext context = new StrategyContext();
		context.setStrategy(new StrategyA()); // Setting a strategy by client
		context.printStrategy();
	}

}

//Context to decide which strategy to use. Strategy will be passed by client
class StrategyContext {

	StrategyInterface strategy;

	public void setStrategy(StrategyInterface strategy) {
		this.strategy = strategy;
	}

	public void printStrategy() {
		strategy.print();
	}
}

//Abstraction will be implemented by different strategies.
interface StrategyInterface {

	public void print();
}

class StrategyA implements StrategyInterface {

	@Override
	public void print() {
		System.out.println("This is StrategyA");
	}

}

class StartegyB implements StrategyInterface {

	@Override
	public void print() {
		System.out.println("This is StrategyB");
	}

}