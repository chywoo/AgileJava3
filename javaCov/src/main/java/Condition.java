// this is test
class Condition {
	
	int a, b;
	
	Condition(int v1, int v2){
		this.a = v1;
		this.b = v2;
	}
	
	int result = 0;
	void out() {
		if(a >= 10 || b >= 10) {
			result = 100;
		}
	}
	
	int getResult(){
		return result;
	}
}