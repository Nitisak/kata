
public class RomanClock {

	public String ConvertToRoman(int i) {
		String[] res = {"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII"};
		if( i > 0 && i < 13 ){
			return res[i-1];
		}else{
			return "ERR";
		}
	}

}
