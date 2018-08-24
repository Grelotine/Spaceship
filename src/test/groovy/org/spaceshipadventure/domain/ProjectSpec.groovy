package org.spaceshipadventure.domain

import spock.lang.*

class ProjectSpec extends Specification {
  def actionwords = Actionwords.newInstance()

  def "Allumage avec carburant"() {
    // Tags: Lot_1


    actionwords.ilResteDuCarburant()
    when:
    actionwords.jappuieSurLeBoutonDallumage()
    then:
    actionwords.leGenerateurSallume()
  }
  def "Extinction"() {

    when:
    actionwords.jappuieSurLeBoutonDextinction()
    then:
    actionwords.leGenerateurSeteint()
  }
  def "Allumage sans carburant"() {
    // Tags: Lot_1


    actionwords.ilNeRestePlusDeCarburant()
    when:
    actionwords.jappuieSurLeBoutonDallumage()
    then:
    actionwords.leGenerateurResteEteint()
  }
  def "Générer une trajectoire"() {

    when:
    actionwords.jeSelectionneLaFonctionnaliteDeGenerationDeTrajectoire()
    actionwords.jeSelectionneUneDestination("| Destination |\n| Terre |\n| Mars |\n| Venus |\n| Lune |\n| Soleil |")
    then:
    actionwords.laTrajectoireARespecterMestAffichee()
  }
}