
public class Board {
	
	String[][] markers = new String[3][3];
	
	public Board(){
		
	}
	
	public boolean IsBoardEmpty(){
		int zaehlvariable = 0;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(markers[i][j] == ""){
					zaehlvariable++;
					if(zaehlvariable == 9){
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public void setMark(String mark, int x, int y) throws InvalidPositionException{
		if (x < 0 && x > 2 || y < 0 && y > 2 ){
			throw new InvalidPositionException("falsche Koordinaten");
		}
		else{
		markers[x][y] = mark;
		}
	}
	
	public boolean hasWinner() {
		int dreiGleiche1 = 0;
		int dreiGleiche2 = 0;
		int dreiGleiche3 = 0;
		int dreiGleiche4 = 0;
		int dreiGleiche5 = 0;
		int dreiGleiche6 = 0;
		
		for(int i = 0; i < 3; i++){
			if (markers[0][i] == "X" || markers[0][i] == "O"){
				dreiGleiche1++;
				if(dreiGleiche1 == 3){
					return true;
				}
			}
			else if(markers[1][i] == "X" || markers[1][i] == "O"){
				dreiGleiche2++;
				if(dreiGleiche2 == 3){
					return true;
				}
			}
			else if(markers[2][i] == "X" || markers[2][i] == "O"){
				dreiGleiche3++;
				if(dreiGleiche3 == 3){
					return true;
				}
			}
			else if(markers[i][0] == "X" || markers[i][0] == "O"){
				dreiGleiche4++;
				if(dreiGleiche4 == 3){
					return true;
				}
			}
			else if(markers[i][1] == "X" || markers[i][1] == "O"){
				dreiGleiche5++;
				if(dreiGleiche5 == 3){
					return true;
				}
			}
			else if(markers[i][2] == "X" || markers[i][2] == "O"){
				dreiGleiche6++;
				if(dreiGleiche6 == 3){
					return true;
				}
			}
		}
		if(markers[0][0]== "X"  && markers[1][1]== "X"  && markers[2][2] == "X" || 
				markers[0][0]== "O" && markers[1][1]== "O" && markers[2][2] == "O" ){
			return true;
		}
		if(markers[0][2]== "X"  && markers[1][1]== "X"  && markers[2][0] == "X" || 
				markers[0][2]== "O" && markers[1][1]== "O" && markers[2][0] == "O" ){
			return true;
		}
		return false;
	}
	
}
