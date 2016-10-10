/** A six-sided die for use in games. */
public class Die {

/** The face of this Die that is showing. */
private int topFace;

/** Initialize the top face to 1. */
public Die(){
	this.topFace=1;
}

/** Return the top face of this Die. */
public int getTopFace(){
	return this.topFace;
}

/** Set the top face to the specified value. */
public void setTopFace(int topFace){
	this.topFace = topFace;
}

/**
 * Set the top face to a random integer between 1 and 6, inclusive.
 */
public void roll(){
	this.topFace=((int)(Math.random()*6))+1;
}

/** 
* Create a Die, print the top face, set the top face to 6, and
* print it again.
*/
public static void main(String[] args) {
	Die d = new Die();
	System.out.println("Before rolling: "+d.getTopFace());
	d.roll();
	System.out.println("After rolling: "+d.getTopFace());
}

}