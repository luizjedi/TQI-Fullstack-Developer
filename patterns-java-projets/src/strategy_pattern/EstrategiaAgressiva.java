package strategy_pattern;

public class EstrategiaAgressiva implements IEstrategia {

	@Override
	public void mover() {
		System.out.println("Movendo-se Agressivamente...");
	}
}
