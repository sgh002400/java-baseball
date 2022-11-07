package baseball.computer;

import baseball.ball.BallNumbers;
import baseball.utils.RandomAnswerBallNumberGenerator;

public class Computer {
	private static BallNumbers answerBallNumbers;

	public static void init() {
		answerBallNumbers = setAnswerBallNumbers();
	}
	private static BallNumbers setAnswerBallNumbers() {
		return RandomAnswerBallNumberGenerator.generate();
	}

}
