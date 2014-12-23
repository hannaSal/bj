package Models;

import java.util.ArrayList;



	public class Dealer
	{
		private  ArrayList<Card> DealerCards = new ArrayList<Card>();

		
		
		public Dealer()
		{
			super();
			
		}



		public ArrayList<Card> getDealerCards() {
			return DealerCards;
		}



		public void setDealerCards(ArrayList<Card> dealerCards) {
			DealerCards = dealerCards;
		}
		
		public Card[] DealerCards()
		{
			Card[] c6 = new Card[10];
			c6[0] = (new Card(this.DealerCards.get(10).getValue(),this.DealerCards.get(10).getShape()));
			c6[1] =(new Card(this.DealerCards.get(11).getValue(),this.DealerCards.get(11).getShape()));
			c6[2] =(new Card(this.DealerCards.get(12).getValue(),this.DealerCards.get(12).getShape()));
			c6[3] =(new Card(this.DealerCards.get(13).getValue(),this.DealerCards.get(13).getShape()));
			c6[4] =(new Card(this.DealerCards.get(14).getValue(),this.DealerCards.get(14).getShape()));
		
			
			
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
