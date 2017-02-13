public class Exercise6R
{
	public static void main(String[] args)
	{
		GameArena a = new GameArena(300,300);
		Rectangle r = new Rectangle(150,150, 50, 50, "GREEN");
        int speed = 2;

		a.addRectangle(r);

		while(true)
		{
            if (a.rightPressed())
			    r.setXPosition(r.getXPosition() + speed);

            if (a.leftPressed())
			    r.setXPosition(r.getXPosition() - speed);

            if (a.upPressed())
			    r.setYPosition(r.getYPosition() - speed);

            if (a.downPressed())
			    r.setYPosition(r.getYPosition() + speed);

			a.pause();
		}
	}
}
