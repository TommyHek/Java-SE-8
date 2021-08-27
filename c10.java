package pro_1;

public class c10 {
	public static void main(String[] args) {
		for(MilesFromBoston mfb:MilesFromBoston.values()){
			System.out.println("Boston to "+mfb+" is "+mfb.getDistance()+"miles");
			
		}
		for(CCTV cc:CCTV.values()) {
			System.out.println("Name "+cc+" Type "+cc.getType());
		}
		
	}
}
//enum practiced
enum MilesFromBoston{
	NEW_YORK(224.6),
	SAN_FRANCISCO(3097.7),
	DENVER(1969);
	private final double distance;
	private MilesFromBoston(double distance) {
		this.distance=distance;
	}
	public double getDistance(){
		return this.distance;
	}
}
enum CCTV{
	c1("one"),
	c2("two"),
	c3("Three");
	private String cctv;
	private CCTV(String s){
		this.cctv=s;
	}
	public String getType() {
		return this.cctv;
	}
}