Feature: Eteindre le générateur du vaisseau.
En tant que pilote, ou membre d'équipage, je souhaite éteindre le générateur du vaisseau afin de l'arrêter.

Scenario: Extinction
Given je suis bord du vaisseau
When j'appuie sur le bouton d'extinction
Then le générateur s'éteint
