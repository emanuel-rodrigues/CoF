package chain_imaginarium;

public class Colorize extends FilterOp{
	
	int colorize;
	
	
	

	public Colorize(int colorize) {
		super();
		this.colorize = colorize;
	}




	@Override
	public void op(Imagem i) throws FilterError {
		System.out.println("Colorize " + colorize + "aplicado na imagem" );
		
	}

}
