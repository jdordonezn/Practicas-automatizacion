$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/BuscarPelicula.feature");
formatter.feature({
  "name": "Find a movie in cine colombia",
  "description": "  As a Web User\n  I want to go t cine colombia\n  to search a movie",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search a movie in cine colombia page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "that user want to open cine colombia page",
  "keyword": "Given "
});
formatter.match({
  "location": "CineColombiaSearchMovieStepDefinition.thatUserWantToOpenCineColombiaPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user go to cartelera option",
  "keyword": "When "
});
formatter.match({
  "location": "CineColombiaSearchMovieStepDefinition.userGoToCarteleraOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he see all the movie to select",
  "keyword": "Then "
});
formatter.match({
  "location": "CineColombiaSearchMovieStepDefinition.heSeeAllTheMovieToSelect()"
});
formatter.result({
  "status": "passed"
});
});