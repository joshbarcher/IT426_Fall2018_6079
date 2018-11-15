package adapter;

import athletes.BasketballPlayer;

public class AdapterFactory
{
    public static BasketballAdapter playerWithDefaults(BasketballPlayer player)
    {
        player.add("ppg", 0);
        player.add("blocks", 0);
        player.add("steals", 0);

        return new BasketballAdapter(player);
    }
}
