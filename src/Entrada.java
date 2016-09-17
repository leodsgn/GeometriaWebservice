
public class Entrada {
	int[] coord; // [0] -> coordenada x, [1] coordenada y;
	
	
	Entrada(){
		coord = new int[2];
	}


	public int[] getCoord() {
		return coord;
	}


	public void setCoord(int coordx, int coordy) {
		this.coord[0] = coordx;
		this.coord[1] = coordy;		
	}
	
}
