package launch;

import adapter.FootballAdapter;
import athletes.FootballPlayer;
import sportsnews.NewsPrinter;

public class TestNews
{
    public static void main(String[] args)
    {
        FootballPlayer player = new FootballPlayer("Captain Munnerlyn",
                "Carolina Panthers");
        player.addStat("tackles", 10);
        player.addStat("interceptions", 1);

        NewsPrinter printer = new NewsPrinter(new FootballAdapter(player));
        printer.printAthleteStats();
    }
}
