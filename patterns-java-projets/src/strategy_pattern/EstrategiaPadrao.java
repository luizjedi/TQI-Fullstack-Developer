package strategy_pattern;

public class EstrategiaPadrao implements IEstrategia {

	@Override
	public void mover() {
		System.out.println("Movendo-se normalmente...");
	}
}
