package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import galaxyraiders.core.physics.Vector2D

class Explosion(
  initialPosition: Point2D,
  initialVelocity: Vector2D,
  radius: Double,
  mass: Double,
) : SpaceObject("Explosion", '*', initialPosition, initialVelocity, radius, mass) {

  var isTriggered: Boolean = true
  var ticks: Int = 100

  fun tick() {
    ticks -= 1
    if(ticks <= 0) {
      isTriggered = false
    }
  }
}