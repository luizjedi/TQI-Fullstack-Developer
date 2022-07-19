package strategy_pattern;

public class TestesStrategy {

	public static void main(String[] args) {

		// Strategy Padrao testes.
		IEstrategia defensiva = new EstrategiaDefensiva();
		IEstrategia padrao = new EstrategiaPadrao();
		IEstrategia agressiva = new EstrategiaAgressiva();

		Robo robo = new Robo();
		robo.setStrategy(padrao);
		robo.mover();
		robo.setStrategy(agressiva);
		robo.mover();
		robo.setStrategy(defensiva);
		robo.mover();
	}
}
