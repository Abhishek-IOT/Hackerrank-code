import java.util.Scanner;

class Player {
    private String playerName;
    private String userName;
    private String level;
    private int score;

    public Player(String playerName, String userName, String level, int score) {
        this.playerName = playerName;
        this.userName = userName;
        this.level = level;
        this.score = score;
    }

    public String getUserName() {
        return userName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return getPlayerName() + "\t" + getUserName() + "\t" + getLevel() + "\t" + getScore();
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine().trim();
        Player[] players = new Player[n];
        if (n > 0 && n <= 100) {
            for (int i = 0; i < n; i++) {
                String playerName = sc.nextLine().trim();
                String userName = sc.nextLine().trim();
                String level = sc.nextLine().trim();
                int score = sc.nextInt();
                sc.nextLine().trim();
                players[i] = new Player(playerName, userName, level, score);
            }
            System.out.println("Playername\tUsername\tLevel\tScore");
            for (int i = 0; i < n; i++)
                System.out.println(players[i]);
        }


    }
}

