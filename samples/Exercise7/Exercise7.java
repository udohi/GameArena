import java.util.*;

public class Exercise7
{
	public static void main(String[] args)
	{
        Random random = new Random();
		GameArena a;
        Ball balls[];
        int ballCount;
        int maxSpeed = 5;
       
        try
        {
            ballCount = Integer.parseInt(args[0]);
            balls = new Ball[ballCount];
            
        }
        catch (Exception e)
        {
            System.out.println("\nUsage: java Exercise7 <number_of_balls>\n\n");        
            return;
        }

        a = new GameArena(1000,800);

        for (int i=0; i<balls.length; i++)
        {
            double x = random.nextDouble() * a.getArenaWidth();
            double y = random.nextDouble() * a.getArenaHeight();
            double s1 = maxSpeed - random.nextDouble()*maxSpeed*2;
            double s2 = maxSpeed - random.nextDouble()*maxSpeed*2;

		    balls[i] = new Ball(x, y, 2, "#FF0000");
            balls[i].setXSpeed(s1);
            balls[i].setYSpeed(s2);

		    a.addBall(balls[i]);
        }

		while(true)
		{
            for (int i=0; i<balls.length; i++)
			    balls[i].gravity(a.getArenaWidth(), a.getArenaHeight());

			a.pause();
		}
	}
}
