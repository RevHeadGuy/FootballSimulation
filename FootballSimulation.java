import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Player {
    String name;
    int jerseyNumber;
    int age;

    public Player(String name, int jerseyNumber) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.age = age;
    }
}

class Team {
    String name;
    List<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public Player getRandomPlayer() {
        Random random = new Random();
        int index = random.nextInt(players.size());
        return players.get(index);
    }
}

class Match {
    Team team1;
    Team team2;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void playMatch() {
        System.out.println("Match between " + team1.name + " and " + team2.name);
        
        Player scorer = team1.getRandomPlayer();
        System.out.println("Goal! " + scorer.name + " scores for " + team1.name);

        scorer = team2.getRandomPlayer();
        System.out.println("Goal! " + scorer.name + " scores for " + team2.name);

        System.out.println("Match finished!");
    }
}

    class Match1{
        Team team3;
        Team team4;

        public Match1(Team team3, Team team4){
            this.team3 = team3;
            this.team4 = team4;
        }
        public void playMatch(){
            System.out.println("Match1 between " + team3.name + " and " + team4.name);

            Player scorer = team3.getRandomPlayer();
            System.out.println("Goal!" + scorer.name + "scores for" + team3.name);

            scorer = team4.getRandomPlayer();
            System.out.println("Goal!" + scorer.name + "scores for" + team4.name);

            System.out.println("Match finished!");
        }
    }

public class FootballSimulation {
    public static void main(String[] args) {
        
        Team team1 = new Team("Team A");
        team1.addPlayer(new Player("Player1", 10));
        team1.addPlayer(new Player("Player2", 7));
        team1.addPlayer(new Player("Player3", 9));

        Team team2 = new Team("Team B");
        team2.addPlayer(new Player("Player4", 5));
        team2.addPlayer(new Player("Player5", 8));
        team2.addPlayer(new Player("Player6", 11));

        Team team3 = new Team("Team C");
        team3.addPlayer(new Player("Player7", 54));
        team3.addPlayer(new Player("Player8", 34));
        team3.addPlayer(new Player("Player9", 28));

        Team team4 = new Team("Team D");
        team4.addPlayer(new Player("Player10", 33));
        team4.addPlayer(new Player("Player11", 22));
        team4.addPlayer(new Player("Player12", 13));

        Match match = new Match(team1, team2);
        match.playMatch();

        Match1 match1 = new Match1(team3, team4);
        match1.playMatch();
    }
}
