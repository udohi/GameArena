public class Exercise3
{
	public static void main(String[] args)
	{
		GameArena a = new GameArena(300,300);
		Ball b = new Ball(150,150, 10, "GREEN");
		double speed = 1.0;

		a.addBall(b);

		while(true)
		{
			double x = b.getXPosition() + speed;

			if (x > a.getArenaWidth())
				x = 0;

			b.setXPosition(x);
			a.pause();
		}
	}
}
