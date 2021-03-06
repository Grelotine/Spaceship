package org.spaceshipadventures;

import junit.framework.TestCase;

public class AllumageTest extends TestCase {
    
        public Actionwords actionwords = new Actionwords();
        // 
    // Tags: Automated
    public void testAllumageAvecCarburantUidf784729103d94a0ba8d7ba33e919e1b5() {
        // Given le générateur est éteint
        actionwords.leGenerateurEstEteint();
        // And il reste du carburant
        actionwords.ilResteDuCarburant();
        // When j'appuie sur le bouton d'allumage
        actionwords.jappuieSurLeBoutonDallumage();
        // Then le générateur s'allume
        actionwords.leGenerateurSallume();
    }

    public void testAllumageSansCarburantUid34b2d1caa03b4b4692669ddef4886ed2() {
        // Given le générateur est éteint
        actionwords.leGenerateurEstEteint();
        // And il ne reste plus de carburant
        actionwords.ilNeRestePlusDeCarburant();
        // When j'appuie sur le bouton d'allumage
        actionwords.jappuieSurLeBoutonDallumage();
        // Then le générateur reste éteint
        actionwords.leGenerateurResteEteint();
    }


}