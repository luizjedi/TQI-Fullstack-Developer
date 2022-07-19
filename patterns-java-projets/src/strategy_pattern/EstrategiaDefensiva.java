package strategy_pattern;

public class EstrategiaDefensiva implements IEstrategia {

	@Override
	public void mover() {
		System.out.println("Movendo-se Defensivamente...");
	}
}
