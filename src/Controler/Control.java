package Controler;

import java.util.ArrayList;
import java.util.Collections;


import Models.Card;
import Models.Dealer;
import Models.Deck;
import Models.Player;

import View.BlackJackView3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Control 
{
	
	private Player player ;
	private Dealer dealer ;
	private Card card ;
	private Deck deck ;
     
        public BlackJackView3 BJV3 ;
	ArrayList<Card> allCard = new ArrayList<Card>();
	
	public Control(Player player , Dealer dealer ,  Deck deck ,  BlackJackView3 BJV3)
	{
                
            this.BJV3 = BJV3 ;
            JLabel l = this.BJV3.GetButton();
            JLabel l4 = this.BJV3.GetButton4();
            JLabel l6 =this.BJV3.GetButton6();
            JLabel l7 =this.BJV3.GetButton7();
            JTextField t1 = this.BJV3.GetText1();
            JTextField t2 = this.BJV3.GetText2();
            JTextField t3 = this.BJV3.GetText3();
            JTextField t4 = this.BJV3.GetText4();
            JTextField t5 = this.BJV3.GetText5();
            JTextField t6 = this.BJV3.GetText6();
            JLabel l10 = this.BJV3.GetLabel10();
            JLabel l11 = this.BJV3.GetLabel11();
            JLabel l12 = this.BJV3.GetLabel12() ;
                    
        
     
		this.dealer = dealer ;
		this.deck = deck ;
		this.player = player ;
		Collections.shuffle(this.deck.getC());
		this.player.setC2(this.deck.getC());
		this.dealer.setDealerCards(this.deck.getC());
	 
                
              Card[] c2=this.player.PlayerCards();
              String s1 = c2[0].getShape();
              String s2 = c2[1].getShape();
              String s6 = c2[2].getShape();
              String s7 = c2[3].getShape() ;
              l.setIcon(new javax.swing.ImageIcon(s1));
              l4.setIcon(new javax.swing.ImageIcon(s2));
              l11.setIcon(new javax.swing.ImageIcon(s6));
              l12.setIcon(new javax.swing.ImageIcon(s7));
              t1.setText(""+c2[0].getValue());
              t2.setText(""+c2[1].getValue());
              int sum = c2[0].getValue() + c2[1].getValue() ;
              this.BJV3.getSum(sum);
           
              this.BJV3.getCard(c2);
            
             
              
            
              
              t5.setText(""+this.player.sum(c2));
   
       
               
              
              
              
              Card[] c3=this.dealer.DealerCards();
              String s3 = c3[0].getShape();
              String s4 = c3[1].getShape();
              String s5 = "src\\AllCards\\cardd.jpg" ;
              l10.setIcon(new javax.swing.ImageIcon(s5));
              l6.setIcon(new javax.swing.ImageIcon(s3));
              l7.setIcon(new javax.swing.ImageIcon(s4));
              t3.setText(""+c3[0].getValue());
              t4.setText(""+c3[1].getValue());
              t6.setText(""+this.player.sum(c3));
              
		
	}
 
   



}
