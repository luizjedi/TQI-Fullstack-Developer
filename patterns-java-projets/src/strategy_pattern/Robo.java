package strategy_pattern;

public class Robo {

	private IEstrategia strategy;

	public void setStrategy(IEstrategia strategy) {
		this.strategy = strategy;
	}

	public void mover() {
		strategy.mover();
	}
}
