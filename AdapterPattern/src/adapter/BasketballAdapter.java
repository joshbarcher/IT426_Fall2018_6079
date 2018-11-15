package adapter;

import athletes.BasketballPlayer;
import sportsnews.IAthlete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasketballAdapter implements IAthlete
{
    private BasketballPlayer player;

    public BasketballAdapter(BasketballPlayer player)
    {
        this.player = player;
    }

    @Override
    public String provideFullName()
    {
        return player.getfName() + " " + player.getMiddleInitial() + ". "
                + player.getlName();
    }

    @Override
    public String provideTeam()
    {
        return player.getTeam();
    }

    @Override
    public List<String> provideStats()
    {
        String stats = player.getStats();

        return new ArrayList<>(
                Arrays.asList(stats.split(",")));
    }
}
