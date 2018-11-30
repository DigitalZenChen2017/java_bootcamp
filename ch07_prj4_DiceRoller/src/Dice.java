
public class Dice {
	private Die die1;
	private Die die2;
	
	public Dice(Die die1, Die die2) {
		this.die1 = die1;
		this.die2 = die2;
	}

	public Die getDie1() {
		return die1;
	}

	public void setDie1(Die die1) {
		this.die1 = die1;
	}

	public Die getDie2() {
		return die2;
	}

	public void setDie2(Die die2) {
		this.die2 = die2;
	}
	
	public int getSum() {
		return die1.getValue() + die2.getValue();
	}
	
	public void roll() {
		die1.roll();
		die2.roll();
	}
	
	public String printRoll() {
		String str = "Die 1: "+die1.getValue()+"\n" + 
					 "Die 2: "+die2.getValue()+"\n" + 
				     "Total: "+getSum()+"\n";
		if (getSum()==2) {
			str+="Snake eyes!";
		}
		else if (getSume()==7) {
			str+="Craps!";
		}
		else if (getSum() == 12) {
			str+="Box cars!";
		}
		return str;
	}
}
