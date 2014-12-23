package Models;

import java.util.ArrayList;







public class Player {

	  private ArrayList<Card> PlayerCard = new ArrayList<Card>();
		
		
		
		public Player(){
			super();

	  
		}
		

		public ArrayList<Card> getC2() {
			return PlayerCard;
		}



		public void setC2(ArrayList<Card> c2) {
			this.PlayerCard = c2;
		}


	public Card[] PlayerCards()
	{
		
		Card[] c6 = new Card[10];
		c6[0] = (new Card(this.PlayerCard.get(0).getValue(),this.PlayerCard.get(0).getShape()));
		c6[1] =(new Card(this.PlayerCard.get(1).getValue(),this.PlayerCard.get(1).getShape()));
		c6[2] =(new Card(this.PlayerCard.get(2).getValue(),this.PlayerCard.get(2).getShape()));
		c6[3] =(new Card(this.PlayerCard.get(3).getValue(),this.PlayerCard.get(3).getShape()));
		c6[4] =(new Card(this.PlayerCard.get(4).getValue(),this.PlayerCard.get(4).getShape()));
	
		
		
		return c6;
			
	}
		 
	public int sum(Card[] c6)
	{
		int sum = 0 ;
		if (c6[0].getValue()==1 && c6[1].getValue() ==1)
		{
			sum += 12;
		}else if (c6[0].getValue()==1 || c6[1].getValue() ==1)
                {
                    sum += c6[0].getValue() + c6[1].getValue() + 10;
                    if (sum > 21)
                        sum -= 10;
                }
                else 
                    sum += c6[0].getValue() + c6[1].getValue();
                
		
	
		
		return sum ;
		
	}
	

}
