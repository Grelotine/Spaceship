import spock.lang.*

class ProjectSpec extends Specification {
  def actionwords = Actionwords.newInstance()

  def "Allumage avec carburant"() {
    // Tags: Lot_1


    given:
    actionwords.leGenerateurEstEteint()
    actionwords.ilResteDuCarburant()
    when:
    actionwords.jappuieSurLeBoutonDallumage()
    then:
    actionwords.leGenerateurSallume()
  }
  def "Extinction"() {

    given:
    actionwords.leGenerateurEstAllume()
    when:
    actionwords.jappuieSurLeBoutonDextinction()
    then:
    actionwords.leGenerateurSeteint()
  }
  def "Allumage sans carburant"() {
    // Tags: Lot_1


    given:
    actionwords.leGenerateurEstEteint()
    actionwords.ilNeRestePlusDeCarburant()
    when:
    actionwords.jappuieSurLeBoutonDallumage()
    then:
    actionwords.leGenerateurResteEteint()
  }
  def "Générer une trajectoire"() {

    given:
    actionwords.leGenerateurEstAllume()
    when:
    actionwords.jeSelectionneLaFonctionnaliteDeGenerationDeTrajectoire()
    actionwords.jeSelectionneUneDestination("| Destination |\n| Terre |\n| Mars |\n| Venus |\n| Lune |\n| Soleil |")
    then:
    actionwords.laTrajectoireARespecterMestAffichee()
  }
}