package com.cinecolombia.compra.userinterfaces;

import org.codehaus.groovy.control.messages.LocatedMessage;

import com.cinecolombia.compra.questions.NameMovie;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

public class InformOfMovie {
	public static String nameMovie="";
	public static final Target CINE_HORA = Target.the("Hour").locatedBy("//*[@id='todas-las-funciones']/div[2]/div/div/div[2]/div[2]/span");
	public static final Target CINE = Target.the("cine").locatedBy("//*[@id='todas-las-funciones']/div[2]/h3");
	public static final Target TITTLE_MOVIE=Target.the("Tittle of de movie").located(By.name(nameMovie));

	
}
