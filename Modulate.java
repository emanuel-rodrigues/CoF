package chain_imaginarium;

public class Modulate extends FilterOp{
	
	
	int x;
	int y;
	int z;
	
	

	public Modulate(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}



	@Override
	public void op(Imagem i) throws FilterError {
		System.out.println("-modulate" + x + " " + y + " " + z + "aplicado na imagem");
		
	}

}
