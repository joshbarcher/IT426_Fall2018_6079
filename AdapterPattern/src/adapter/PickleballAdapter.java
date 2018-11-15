package adapter;

import athletes.PickleballPlayer;
import sportsnews.IAthlete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickleballAdapter implements IAthlete
{
    private PickleballPlayer player;

    public PickleballAdapter(PickleballPlayer player)
    {
        this.player = player;
    }

    @Override
    public String provideFullName()
    {
        return player.getFirstName() + " " + player.getLastName();
    }

    @Override
    public String provideTeam()
    {
        return player.getTeam();
    }

    @Override
    public List<String> provideStats()
    {
        String[] parts = {"Aces: " + player.getAces(),
                "Forehand: " + player.getForehand(),
                "Backhand: " + player.getBackhand()};

        return new ArrayList<>(
                Arrays.asList(parts));
    }
}
