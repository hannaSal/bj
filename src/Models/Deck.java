package Models;

import java.util.ArrayList;



public class Deck 
{
	
	
	private ArrayList<Card> c = new ArrayList<Card>();

	public Deck(ArrayList<Card> arrayCard)
	{
            
            
            
                this.c.add(new Card(1, "src\\AllCards\\1C.png"));
		this.c.add(new Card(2, "src\\AllCards\\2C.png"));
		this.c.add(new Card(3, "src\\AllCards\\3C.png"));
		this.c.add(new Card(4, "src\\AllCards\\4C.png"));
		this.c.add(new Card(5, "src\\AllCards\\5C.png"));
		this.c.add(new Card(6, "src\\AllCards\\6C.png"));
		this.c.add(new Card(7, "src\\AllCards\\7C.png"));
		this.c.add(new Card(8, "src\\AllCards\\8C.png"));
		this.c.add(new Card(9, "src\\AllCards\\9C.png"));
		this.c.add(new Card(10, "src\\AllCards\\10C.png"));
		this.c.add(new Card(10, "src\\AllCards\\JC.png"));
		this.c.add(new Card(10, "src\\AllCards\\QC.png"));
		this.c.add(new Card(10, "src\\AllCards\\KC.png"));
		
		this.c.add(new Card(1, "src\\AllCards\\AP.png"));
		this.c.add(new Card(2, "src\\AllCards\\2P.png"));
		this.c.add(new Card(3, "src\\AllCards\\3P.png"));
		this.c.add(new Card(4, "src\\AllCards\\4P.png"));
		this.c.add(new Card(5, "src\\AllCards\\5P.png"));
		this.c.add(new Card(6, "src\\AllCards\\6P.png"));
		this.c.add(new Card(7, "src\\AllCards\\7P.png"));
		this.c.add(new Card(8, "src\\AllCards\\8P.png"));
		this.c.add(new Card(9, "src\\AllCards\\9P.png"));
		this.c.add(new Card(10,"src\\AllCards\\10P.png"));
		this.c.add(new Card(10, "src\\AllCards\\JP.png"));
		this.c.add(new Card(10, "src\\AllCards\\QP.png"));
		this.c.add(new Card(10, "src\\AllCards\\KP.png"));
		
		
		this.c.add(new Card(1, "src\\AllCards\\AS.png"));
		this.c.add(new Card(2, "src\\AllCards\\2S.png"));
		this.c.add(new Card(3, "src\\AllCards\\3S.png"));
		this.c.add(new Card(4, "src\\AllCards\\4S.png"));
		this.c.add(new Card(5, "src\\AllCards\\5S.png"));
		this.c.add(new Card(6, "src\\AllCards\\6S.png"));
		this.c.add(new Card(7, "src\\AllCards\\7S.png"));
		this.c.add(new Card(8, "src\\AllCards\\8S.png"));
		this.c.add(new Card(9, "src\\AllCards\\9S.png"));
		this.c.add(new Card(10, "src\\AllCards\\10S.png"));
		this.c.add(new Card(10, "src\\AllCards\\JS.png"));
		this.c.add(new Card(10, "src\\AllCards\\QS.png"));
		this.c.add(new Card(10, "src\\AllCards\\KS.png"));
		
		
		this.c.add(new Card(1, "src\\AllCards\\1D.png"));
		this.c.add(new Card(2, "src\\AllCards\\2D.png"));
		this.c.add(new Card(3, "src\\AllCards\\3D.png"));
		this.c.add(new Card(4, "src\\AllCards\\4D.png"));
		this.c.add(new Card(5, "src\\AllCards\\5D.png"));
		this.c.add(new Card(6, "src\\AllCards\\6D.png"));
		this.c.add(new Card(7, "src\\AllCards\\7D.png"));
		this.c.add(new Card(8, "src\\AllCards\\8D.png"));
		this.c.add(new Card(9, "src\\AllCards\\9D.png"));
		this.c.add(new Card(10, "src\\AllCards\\10D.png"));
		this.c.add(new Card(10, "src\\AllCards\\JD.png"));
		this.c.add(new Card(10, "src\\AllCards\\QD.png"));
		this.c.add(new Card(10, "src\\AllCards\\KD.png"));
            
         
		
	}

	public ArrayList<Card> getC() {
		return c;
	}

	public void setC(ArrayList<Card> c) {
		this.c = c;
	}
	

}
