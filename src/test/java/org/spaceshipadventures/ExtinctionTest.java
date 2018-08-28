package org.spaceshipadventures;

import junit.framework.TestCase;

public class ExtinctionTest extends TestCase {
    
        public Actionwords actionwords = new Actionwords();
        public void extinction(String role) {
        // Given je suis un "role"
        actionwords.jeSuisUnRole("role");
        // And le générateur est allumé
        actionwords.leGenerateurEstAllume();
        // When j'appuie sur le bouton d'extinction
        actionwords.jappuieSurLeBoutonDextinction();
        // Then le générateur s'éteint
        actionwords.leGenerateurSeteint();
    }

    public void testExtinctionCommandantUide3df5244e7e441af907c5ffaa44ca9e4() {
        extinction("commandant");
    }

    public void testExtinctionMembreDequipageUid85529f0eae254e668b35667a0b22cc92() {
        extinction("membre d\'équipage");
    }

    public void testExtinctionInconnuUiddf5bff6382eb4e279ebbb8f66e0d93a9() {
        extinction("inconnu");
    }




}