package Leetcode_Bourne.AlgoExport.arrays;

import java.util.*;

public class TournamentWinner {
  public static void main(String[] args){
    ArrayList<ArrayList<String>> competitions1 = new ArrayList<ArrayList<String>>();
    competitions1.add(new ArrayList<String>(Arrays.asList("HTML", "C#")));
//    competitions1.add(new ArrayList<String>(Arrays.asList("C#", "Python")));
//    competitions1.add(new ArrayList<String>(Arrays.asList("Python", "HTML")));
//    ArrayList<Integer> results1 = new ArrayList<Integer>(Arrays.asList(0, 0, 1));
    ArrayList<Integer> results1 = new ArrayList<Integer>(Arrays.asList(0));

    TournamentWinner tw1 = new TournamentWinner();
    String bestTeam1 = tw1.tournamentWinner2(competitions1, results1);
    System.out.println(bestTeam1);
  }

  public String tournamentWinner2(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    HashMap<String, Integer> scores = new HashMap<String, Integer>();
    String bestTeam = competitions.get(0).get(0);

    for(int idx = 0; idx < competitions.size(); idx++){
      for(int teamIdx = 0; teamIdx < 2; teamIdx++){
        String team = competitions.get(idx).get(teamIdx);
        int newScore = (((results.get(idx) !=0) ^ (teamIdx != 0)) ? 3 : 0);
        int currentScore = 0;

        // update scores
        if(scores.containsKey(team)){
          currentScore = scores.get(team) + newScore;
        }else {
          currentScore = newScore;
        }
        scores.put(team, currentScore);

        // find the best team
        if(currentScore > scores.get(bestTeam)){
          bestTeam = team;
        }
      }
    }
    return bestTeam;
  }

  public int HOME_TEAM_WON = 1;

  public String tournamentWinner_ref(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    String currentBestTeam = "";
    HashMap<String, Integer> scores = new HashMap<String, Integer>();
    scores.put(currentBestTeam, 0);
    for (int idx = 0; idx < competitions.size(); idx++) {
      ArrayList<String> competition = competitions.get(idx);
      int result = results.get(idx);
      String homeTeam = competition.get(0);
      String awayTeam = competition.get(1);
      String winningTeam = (result == HOME_TEAM_WON) ? homeTeam : awayTeam;
      updateScores(winningTeam, 3, scores);
      if (scores.get(winningTeam) > scores.get(currentBestTeam)) {
        currentBestTeam = winningTeam;
      }
    }
    return currentBestTeam;
  }

  public void updateScores(String team, int points, HashMap<String, Integer> scores) {
    if (!scores.containsKey(team)) {
      scores.put(team, 0);
    }
    scores.put(team, scores.get(team) + points);
  }

}
