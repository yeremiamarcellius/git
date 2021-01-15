package minggu6;

public class supercar extends Mobil {

	int topspeed;
	int nitrocount;
	public supercar(String nama, String type, String manufacturer, int price, int topspeed, int nitrocount) {
		super(nama, type, manufacturer, price);
		this.topspeed = topspeed;
		this.nitrocount = nitrocount;
	}
	public int getTopspeed() {
		return topspeed;
	}
	public void setTopspeed(int topspeed) {
		this.topspeed = topspeed;
	}
	public int getNitrocount() {
		return nitrocount;
	}
	public void setNitrocount(int nitrocount) {
		this.nitrocount = nitrocount;
	}
	@Override
	public void testdrive() {
		// TODO Auto-generated method stub
		System.out.println("brmmmm");
	}
	
	

}
