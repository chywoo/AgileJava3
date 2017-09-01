// this is test
class Branch {
	
	int score;
	
	Branch(int sc){
		this.score = sc;
	}
	
	int result;
	void out() {
		
		if(score >= 100) {
			result = 100;
		} else if( score >= 80) {
			result = 80;
		} else if(score >= 60) {
			result = 60;
		} else if(score >= 40) {
			result = 40;
		} else {
			result = 0;
		}
	
	}
	
	int getResult(){
		return result;
	}
	
}
