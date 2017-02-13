import java.util.*;

public class Exercise5R
{
	public static void main(String[] args)
	{
		GameArena a = new GameArena(300,300);
        Rectangle balls[] = new Rectangle[30];
        Random random = new Random();

        for (int i=0; i<balls.length; i++)
        {
            double x = random.nextDouble() * a.getArenaWidth();
            double y = random.nextDouble() * a.getArenaHeight();
            double s = 5;

		    balls[i] = new Rectangle(x, y, s, 2*s, "#00FF00");
            balls[i].setXSpeed(3);
            balls[i].setYSpeed(3);

		    a.addRectangle(balls[i]);
        }

		while(true)
		{
            for (int i=0; i<balls.length; i++)
			    balls[i].gravity(a.getArenaWidth(), a.getArenaHeight());

			a.pause();
		}
	}
}
