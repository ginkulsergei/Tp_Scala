package tondeuse
// création d'un Class avec les variables des position et orientation de la tondeuse
class Tondeuse(var x: Int, var y: Int, var orient: Char){
  override def toString: String = s"($x, $y, $orient)"


/// creation de la fonction du mouvement de la tondeuse selon du character fourni
  // "A" - avancer
  // "D" - tourner à droite
  // "G" - tourner à gouche
  // var h va permetre de faire les changement des coordiantes x et y ne que une fois pour chaque character
  def movement(command: Char): Unit =
  {var h = 0
    if (command == 'A')
          {
            if (orient == 'E') {
              x = x + 1
            }
            if (orient == 'W') {
              x = x - 1
            }
            if (orient == 'N') {
              y = y + 1
            }
            if (orient == 'S') {
              y = y - 1
            }
          }
    if (command == 'G' && h == 0)
          {
            if (orient == 'E' && h == 0) {
              orient = 'N'
              h = 1
            }
            if (orient == 'N' && h == 0) {
              orient = 'W'
              h = 1
            }
            if (orient == 'W' && h == 0) {
              orient = 'S'
              h = 1
            }
            if (orient == 'S' && h == 0) {
              orient = 'E'
              h = 1
            }
          }
    if (command == 'D' && h == 0)
            {
              if (orient == 'E' && h == 0) {
                orient = 'S'
                h = 1
              }
              if (orient == 'N' && h == 0) {
                orient = 'E'
                h = 1
              }
              if (orient == 'W' && h == 0) {
                orient = 'N'
                h = 1
              }
              if (orient == 'S' && h == 0) {
                orient = 'W'
                h = 1
              }
            }



  }





}





