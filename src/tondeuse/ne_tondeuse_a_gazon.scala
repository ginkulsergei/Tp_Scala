package tondeuse

import scala.io.StdIn
import scala.io.Source

object ne_tondeuse_a_gazon extends App{
  val debut = (0,0)
  // on import notre base des données et on la transform dans la liste des strings
      val base_de_donne = Source.fromFile("MowItNow.txt").getLines().toList
  // on prend la première string dont correspond à la limite des coordonées d'éspace du travail de la tondeuse dans le base_de_donne
      val limit = base_de_donne.take(1)

  /*---------Premère tondeuse----------------*/

  // on prend la deuxième string dans la base des données dont correspond à la position de la tondeuse
      var position_initial_1 = base_de_donne.slice(1, 2)

  // on prend la troisiéme string dans la base des données qui correspond au movement de la tondeuse
  val movement_1 = base_de_donne.slice(2, 3).head.toList

  /*----------Deuxième tondeuse-------------*/

  // on fais la même chose pour la deuxième tondeuse
  var position_initial_2 = base_de_donne.slice(3, 4)
      val movement_2 = base_de_donne.slice(4, 5).head.toList

      //println(base_de_donne)

  // on crée les deux Class r1 et r2 qui vont prendre les deux premières paramétres
  // comme les coordinates des tondeuses, et la troisième paramètre comme l'orientation dans l'éspace
  var r1 = new Tondeuse(1, 2,'N')
  var r2 = new Tondeuse(3, 3,'E')


  // on applique la fonction movement sur la Class r1, comme input paramètres dans la fonction movement on utilise les valeurs dans le liste movement_1
  // le boucle suivant va prendre toutes les  valeurs du movement_1, la fonction movement va vérifier à quelle condition correspond chaque valeur j
  // et selon de la condition la fonction va changer les variables dans le Class (x, y ,orient)

  for(j <- movement_1)
  {r1.movement(j)}

  // valeur pos1 va contenir les coordinates de la première tondeuse
  val pos1 = (r1.x,r1.y)
  // valeur orient1 va contenir l'orientation de la tondeuse 1 aprés la fin des travaux
  val orient1 = r1.orient
  println(s"la position de la tendeuse 1 est $pos1 avec la direction $orient1")

// on repete la meme principle comme pour r1
  for(i <- movement_2)
  {r2.movement(i)}


  // valeur pos2 va contenir les coordinates de la première tondeuse
   val pos2 = (r2.x,r2.y)
  // valeur orient2 va contenir l'orientation de la tondeuse 2 aprés la fin des travaux
  val orient2 = r2.orient
  println(s"la position de la tendeuse 2 est $pos2 avec la direction $orient2")




  /////      Les resultates           /////////
  println(s"Tendeuse 1 : ${r1.x} ${r1.y} ${r1.orient}")
  println(s"Tendeuse 2 : ${r2.x} ${r2.y} ${r2.orient}")






}






