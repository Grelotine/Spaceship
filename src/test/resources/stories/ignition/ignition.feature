Feature: Allumer le générateur du vaisseau.
En tant que pilote, ou membre d'équipage, je souhaite allumer le générateur du vaisseau afin de voyager.

Scenario: Allumage
Given je suis bord du vaisseau
When j'appuie sur le bouton d'allumage
Then le générateur s'allume