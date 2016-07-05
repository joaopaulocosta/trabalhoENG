class A{
	private int A1;
	private float A2;
	private String A3;
	private String Aprinc4;
	
	public void setA1(int a1){
		this.A1 = a1;
	}
	
	public int getA1(){
		return this.A1;
	}
	
	public void setA2(float a2){
		this.A2 = a2;
	}
	
	public float getA2(){
		return this.A2;
	}
	
	public void setA3(String a3){
		this.A3 = a3;
	}
	
	public String getA3(){
		return this.A3;
	} 
	
	public float soma(){
		return (float)A1 + A2;
	}
	
	public String getAprinc4(){
		return this.Aprinc4;
	}
	
	public void setAprinc4(String a4){
		this.Aprinc4 = a4;
	}
	
}