package OOPs.AggregationandAssocation.Quiz;

import java.util.ArrayList;
import java.util.List;

// Player class 
class Player { 
    // Complete the implementation
    private int id;
    private String team;
    private String name;

    public Player(int id, String team, String name){
        this.id = id;
        this.team = team;
        this.name = name;
    }
  
} 
  
/* Team class contains a list of Player
Objects.*/
class Team { 
    // Complete the implementation
    private List<Player> player;
    private String name;

    public Team(String name, List<Player> player){
        this.player = player;
        this.name = name;
    }

    public List<Player> getPlayers(){
        return this.player;
    }

    
  
} 
  
/* School class contains a list of Team 
Objects.*/
class School { 
    // Complete the implementation
    private String schoolName;
    private List<Team> teams;

    public School(String schoolName, List<Team> teams){
        this.schoolName = schoolName;
        this.teams = teams;
    }

    public int getPlayersInSchool(){
        int noOfPlayers = 0; 
        // List<Player> players;

        // for(Team team : teams) { 
        // players = team.getPlayers(); 
        // for(Player p : players) { 
        //     noOfPlayers++; 
        // } 
        // } 
        for(Team team : teams){
            noOfPlayers += team.getPlayers().size();
        }
        return noOfPlayers;
    }
  
}  
  
// Main class
public class SchoolDriver { 
  
    public static void main (String[] args) { 
        // Write your code here
        
        List<Player> redPlayers = new ArrayList<>();
        redPlayers.add(new Player(1, "Red", "Harris"));
        redPlayers.add(new Player(2, "Red", "Carol"));
        List<Player> bluePlayers = new ArrayList<>();
        bluePlayers.add(new Player(1, "Blue", "Johny"));
        bluePlayers.add(new Player(2, "Blue", "Sarah"));

        List<Team> teams = new ArrayList<>();
        teams.add(new Team("Red", redPlayers));
        teams.add(new Team("Blue", bluePlayers));

        School mySchool = new School("International", teams);
        System.out.println("# Players in School is : "+mySchool.getPlayersInSchool());

    } 
  
} 