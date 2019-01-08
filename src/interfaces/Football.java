package interfaces;

public interface Football extends Sports {
    void homeTeamScored(int points);

    void visitingTeamScored(int points);

    void endOfQuarter(int quarter);
}
