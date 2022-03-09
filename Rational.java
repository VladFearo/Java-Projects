package lab2;

public class Rational {
	
	private int numinator;
	private int denuminator;
	
	public Rational(int numinator, int denuminator) {
		if(denuminator==0) {
			 throw new ArithmeticException("division by 0.");
		}
		int gcd = GCD(numinator,denuminator);
		this.numinator = numinator/gcd;
		this.denuminator = denuminator/gcd;
	}
	private int GCD(int n1, int n2) {
	    if (n2 == 0) {
	        return n1;
	    }
	    return Math.abs(GCD(n2, n1 % n2));
	}
	public void Plus(Rational other) {
		if(this.denuminator==other.denuminator) {
			this.numinator += other.numinator;
		}
		else{
			int temp = this.denuminator;
			this.denuminator*=other.denuminator;
			this.numinator*=other.denuminator;
			other.numinator*=temp;
			this.numinator+=other.numinator;
			lowestTerms();

		}
		
	}
	public void Minus(Rational other) {
		if(this.denuminator==other.denuminator) {
			this.numinator -= other.numinator;
		}
		else {
			int temp = this.denuminator;
			this.denuminator*=other.denuminator;
			this.numinator*=other.denuminator;
			other.numinator*=temp;
			this.numinator-=other.numinator;
			lowestTerms();
			 
		}
	}
	public void Multiply(Rational other) {
		this.numinator*=other.numinator;
		this.denuminator*=other.denuminator;
		lowestTerms();
		
	}
	public void Divide(Rational other) {
		this.numinator*= other.denuminator;
		this.denuminator*=other.numinator;
		lowestTerms();
	}
	private void lowestTerms() {
		int gcd = GCD(this.numinator,this.denuminator); 
		this.numinator /= gcd;
		this.denuminator /= gcd;
	}
	public boolean equals(Rational other) {
		int gcd = GCD(other.numinator,other.denuminator);
		return (this.numinator == other.numinator/gcd && this.denuminator == other.denuminator);
	}
	public String toString() {
		if(this.numinator==0) {
			return "0";
		}
		else if(this.denuminator==1) {
			return String.valueOf(this.numinator);
		}
		else return String.valueOf(this.numinator).concat("/").concat(String.valueOf(this.denuminator));
		
	}
	public void print() {
		System.out.println(this.numinator + "/" + this.denuminator);
	}

}
