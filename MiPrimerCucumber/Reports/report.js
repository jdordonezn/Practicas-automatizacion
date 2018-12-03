$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/BuscarEnGoogle.Feature");
formatter.feature({
  "name": "Buscar en Google",
  "description": "  Yo quiero usar google para buscar una cadena de texto",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Busqueda exitosa",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Que puedo abrir el navegador",
  "keyword": "Given "
});
formatter.match({
  "location": "BuscarEnGoogleStepDefinitions.que_puedo_abrir_el_navegador()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Voy a google y realizo una busqueda",
  "keyword": "When "
});
formatter.match({
  "location": "BuscarEnGoogleStepDefinitions.voy_a_google_y_realizo_una_busqueda()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Realizo una busqueda",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Valido que el resultado sea el esperado",
  "keyword": "Then "
});
formatter.match({
  "location": "BuscarEnGoogleStepDefinitions.valido_que_el_resultado_sea_el_esperado()"
});
formatter.result({
  "status": "skipped"
});
});