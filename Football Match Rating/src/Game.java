public class Game {
    private Team home;
    private Team away;
    private boolean rivalry;
    private int homeScore;
    private int awayScore;
    private double homePossesion;
    private double awayPossesion;
    private int homeShots;
    private int awayShots;
    private int homeShotsOnTarget;
    private int awayShotsOnTarget;

    private Game(Team home, Team away, boolean rivalry){
        this.home = home;
        this.away = away;
        this.rivalry = rivalry;
    }

    public Team getWinner(){
        if (homeScore > awayScore){
            return home;
        } else if (homeScore < awayScore){
            return away;
        } else {
            return null; // null if teams tied
        }
    }

    public String getHomeTeam(){
        return home.getName();
    }

    public String getAwayTeam(){
        return away.getName();
    }

    public void setScore(int home, int away){
        homeScore = home;
        awayScore = away;
    }

    public void setRivalry(boolean rivalry){
        this.rivalry = rivalry;
    }

    public void setPossesion(double home, double away){
        homePossesion = home;
        awayPossesion = away;
    }

    public void setShots(int home, int away, int homeTarget, int awayTarget){
        this.homeShots = home;
        this.awayShots = away;
        this.homeShotsOnTarget = homeTarget;
        this.awayShotsOnTarget = awayTarget;
    }

    public String getScore(){
        return homeScore + ":" + awayScore;
    }

    public String getPossession(){
        return homePossesion + ":" + awayPossesion;
    }

    public String getShots(){
        return homeShots + ":" + awayShots;
    }

    public String getShotsOnTarget(){
        return homeShotsOnTarget + ":" + awayShotsOnTarget;
    }

    public boolean getRivalry(){
        return rivalry;
    }


}
