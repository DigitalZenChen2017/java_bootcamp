
public class DeskPhone implements ITelephone {
	
	private int myNumber;
	private boolean isRinging;
	
	public DeskPhone(int myNumber, boolean isRinging) {
		super();
		this.myNumber = myNumber;
		this.isRinging = isRinging;
	}
	
	public int getMyNumber() {
		return myNumber;
	}

	public void setMyNumber(int myNumber) {
		this.myNumber = myNumber;
	}

	public void setRinging(boolean isRinging) {
		this.isRinging = isRinging;
	}

	@Override
	public void powerOn() {
		System.out.println("Invalid action. Desk Phone does not have a power button.");
		
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing " + phoneNumber + "on deskphone");
		
	}
	@Override
	public void answer() {
		System.out.println("Answering the desk phone.");
		
	}
	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber == myNumber) {
			isRinging = true;
			System.out.println("Ring ring");
		} else {
			isRinging = false;
		}
		return false;
	}
	@Override
	public boolean isRinging() {
		return isRinging;
	}
	
}
