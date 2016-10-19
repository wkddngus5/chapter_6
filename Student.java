package chapter_6;

public class Student {
	public String name;
	public int ban;
	public int no;
	public int kor;
	public int eng;
	public int math;
	
	
	public Student(){}
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getTotal(){
		int sum=this.kor+this.eng+this.math;;
		return sum;
	}
	
	public float getAverage(){
		float average = (float) (getTotal()/3.0);
		average=(float) (Math.round(average*10f)/10f);
		return average;
	}
	
	public String info(){
		return this.name+", "+this.ban+", "+this.no+", "+
	this.kor+", "+this.eng+", "+this.math+", "+this.getTotal()+", "+this.getAverage();
	}

}
