public class Exercise2
{
	public static void main(String[] args)
	{
		GameArena a = new GameArena(600,600);
		Ball b = new Ball(50,50, 10, "GREEN");

		a.addBall(b);
        b.setXSpeed(2);

		while(true)
		{
			a.pause();
            b.bounce(600,600);
		}
	}
}
