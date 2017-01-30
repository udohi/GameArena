public class Exercise4
{
	public static void main(String[] args)
	{
		GameArena a = new GameArena(300,300);
		Ball b = new Ball(100,175, 10, "GREEN");
		double xSpeed = 3.0;
		double ySpeed = 3.0;

		a.addBall(b);

		while(true)
		{
			double x = b.getXPosition() + xSpeed;
			double y = b.getYPosition() + ySpeed;

			if (x > a.getArenaWidth() || x < 0)
				xSpeed = -xSpeed;

			if (y > a.getArenaHeight() || y < 0)
				ySpeed = -ySpeed;

			b.setXPosition(x);
			b.setYPosition(y);

			a.pause();
		}
	}
}
