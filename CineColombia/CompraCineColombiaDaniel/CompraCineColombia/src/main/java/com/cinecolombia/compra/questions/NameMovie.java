package com.cinecolombia.compra.questions;

import com.cinecolombia.compra.userinterfaces.InformOfMovie;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class NameMovie implements Question<String>{

	private String nameMovie;
	public NameMovie(String _nameMovie) {
		// TODO Auto-generated constructor stub
		this.nameMovie=_nameMovie;
	}
	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		InformOfMovie.nameMovie=this.nameMovie;
		return Text.of(InformOfMovie.TITTLE_MOVIE).viewedBy(actor).asString();
		//return Text.of(InformOfMovie.TITTLE_MOVIE).toString();
		}

	public static Question<String> Is(String _nameMovie) {
		// TODO Auto-generated method stub
		return new NameMovie(_nameMovie);
	}
	

}
