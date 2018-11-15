package launch;

import adapter.AdapterFactory;
import adapter.BasketballAdapter;
import adapter.FootballAdapter;
import adapter.PickleballAdapter;
import athletes.BasketballPlayer;
import athletes.FootballPlayer;
import athletes.PickleballPlayer;
import sportsnews.NewsPrinter;

public class TestNews
{
    public static void main(String[] args)
    {
        FootballPlayer player = new FootballPlayer("Captain Munnerlyn",
                "Carolina Panthers");
        player.addStat("tackles", 10);
        player.addStat("interceptions", 1);

        BasketballPlayer lebron = new BasketballPlayer("Lebron", "James", 'R',
                "Los Angeles Lakers");
        lebron.add("ppg", 26);
        lebron.add("blocks", 3);

        BasketballPlayer magic = new BasketballPlayer("Magic", "Johnson", '?',
                "Retired");

        PickleballPlayer simone = new PickleballPlayer("Simone", "Jardim",
                "Team Awesome", 3, 5, 6);

        NewsPrinter printer = new NewsPrinter(
                new FootballAdapter(player),
                new BasketballAdapter(lebron),
                new PickleballAdapter(simone),
                AdapterFactory.playerWithDefaults(magic));
        printer.printAthleteStats();
    }
}
