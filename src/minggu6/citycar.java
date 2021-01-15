package minggu6;

public class citycar extends Mobil {
	
	private String speakertype;
	private int seatcount;
	
	
	public citycar(String nama, String type, String manufacturer, int price, String speakertype, int seatcount) {
		super(nama, type, manufacturer, price);
		this.speakertype = speakertype;
		this.seatcount = seatcount;
	}


	public String getSpeakertype() {
		return speakertype;
	}


	public void setSpeakertype(String speakertype) {
		this.speakertype = speakertype;
	}


	public int getSeatcount() {
		return seatcount;
	}


	public void setSeatcount(int seatcount) {
		this.seatcount = seatcount;
	}


	@Override
	public void testdrive() {
		// TODO Auto-generated method stub
		System.out.println("ngengggg");
	}

	
}
