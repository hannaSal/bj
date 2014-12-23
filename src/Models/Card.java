package Models;

import java.awt.Image;

public class Card {


	
	 private int value ;
	 private String shape ;
         

	    public Card(int value, String shape) {
	        this.value = value ;
	        this.shape = shape;
			
	        
	    }

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public String getShape() {
			return shape;
		}

		public void setShape(String shape) {
			this.shape = shape;
		}

	   

}



