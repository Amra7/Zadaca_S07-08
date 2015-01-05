package RacingGame;
/**
 * Game objects that have moving representation.
 * Game will call speed and animateFrame on some objects they will register AnimatedGameArtifact.
 * @author emir
 *
 */

public interface AnimatedGameArtifact extends GameArtifact {
	void animateFrame(long frameNumber);
	/**
	 * Invoke speed of the objects
	 * @param speed - speed of objects
	 */
	void setSpeed(int speed);
}
