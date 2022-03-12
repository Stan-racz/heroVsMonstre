package partie;

import java.util.concurrent.ThreadLocalRandom;

public class De {
	int max = 6;

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
	public int lance(int max){
		return ThreadLocalRandom.current().nextInt(max);
	}

}
