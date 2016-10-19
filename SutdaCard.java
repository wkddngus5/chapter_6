package chapter_6;

public class SutdaCard {
	int num;
	boolean isKwang;
	
	public SutdaCard(int num, boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	
	public SutdaCard(){
		this.num=1;
		this.isKwang=true;
	}
	
	public String info(){
		if(this.isKwang==true){
			return this.num+"K";
		}else{
			return this.num+"";
		}
	}
}
