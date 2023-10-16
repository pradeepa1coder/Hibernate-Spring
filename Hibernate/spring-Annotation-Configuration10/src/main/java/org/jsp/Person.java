package org.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired//Dependency injection
	private PanCard card;

	public void displayPanCard()
	{
		card.display();
	}


	@Autowired// second way
	public void setCard(PanCard card) {
		this.card = card;
	}
	@Autowired//third way
	public Person(PanCard card) {
		this.card = card;
	}

}
