package MVCController;

import java.util.ArrayList;

import Controler.Control;
import Models.Card;
import Models.Dealer;
import Models.Deck;
import Models.Player;

import View.BlackJackView3;
import javax.swing.JButton;

public class MVCControl 
{
	static ArrayList<Card> c = new ArrayList<Card>();
	private static Card[] c2 ;
	private static Card[] c3 ;
	public static void main(String args[])
	{
            
                
                BlackJackView3 BlackJV3 = new BlackJackView3();
		Deck deck = new Deck(c);
		Player player = new Player();
		Dealer dealer = new Dealer();
		Control control = new Control(player, dealer, deck,BlackJV3);
		c2=player.PlayerCards();
		c3 = dealer.DealerCards();
               
                BlackJV3.setVisible(true);
            
              
	
	}

}
