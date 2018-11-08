package adapter;

import athletes.FootballPlayer;
import sportsnews.IAthlete;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FootballAdapter implements IAthlete
{
    private FootballPlayer player;

    public FootballAdapter(FootballPlayer player)
    {
        this.player = player;
    }

    @Override
    public String provideFullName()
    {
        return player.getFullName();
    }

    @Override
    public String provideTeam()
    {
        return player.getTeam();
    }

    @Override
    public List<String> provideStats()
    {
        Map<String, Object> stats = player.getStats();
        List<String> compatibleList = new ArrayList<>();

        //move data from map to list
        for (String key : stats.keySet())
        {
            compatibleList.add(key + ": " + stats.get(key));
        }

        return compatibleList;
    }
}
