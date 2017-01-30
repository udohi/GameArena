public class Exercise6
{
	public static void main(String[] args)
	{
		GameArena a = new GameArena(300,300);
		Ball b = new Ball(150,150, 10, "GREEN");
        int speed = 2;

		a.addBall(b);

		while(true)
		{
            if (a.rightPressed())
			    b.setXPosition(b.getXPosition() + speed);

            if (a.leftPressed())
			    b.setXPosition(b.getXPosition() - speed);

            if (a.upPressed())
			    b.setYPosition(b.getYPosition() - speed);

            if (a.downPressed())
			    b.setYPosition(b.getYPosition() + speed);

			a.pause();
		}
	}
}
