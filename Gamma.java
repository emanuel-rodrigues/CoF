package chain_imaginarium;

public class Gamma extends FilterOp{

	double gamma;
	
	
	
	public Gamma(double gamma) {
		super();
		this.gamma = gamma;
	}



	@Override
	public void op(Imagem i) throws FilterError {
		System.out.println("Gamma" + gamma + "aplicado na imagem");
		
	}

}
