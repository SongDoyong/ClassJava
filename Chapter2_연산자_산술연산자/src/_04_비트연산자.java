/*
			&(and *) |(or +) ^(xo)
		--------------------------
		00   0x0	  0+0		0
		--------------------------
		01	 0x1	  0+1		1
		--------------------------
		10 	 1x0	  1+0		1
		--------------------------
		11	 1x1	 1+1->1		0
		--------------------------
		why? 1과 0뿐이기에 2가 아닌 1
				xo연산자는 두 수가 같으면 0 다르면 1 
				
		8  &  3				8  |  3				8  ^  3
		1000				1000				1000
		0011				0011				0011
		----&				----+				----xo
		0000 --> 0			1011 --> 11			1011 --> 11
		
		13  &  6
		1101
		0110
		&0100 --> 4
		|1111 --> 15
		^1011 --> 11
*/		

public class _04_비트연산자 {
	public static void main(String[] args) {
		
	}
}
