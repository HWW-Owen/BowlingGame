package cn.edu.jnu.x2020101345;

public class BowlingGame {
    int pins[]=new int[21];
    int currentPinIdx=0;


    int score=0;
    public void roll(int pin) {
        pins[currentPinIdx++]=pin;
    }

    public int score() {
        int FinalScore=0;
        for(int ScoreIdx=0;ScoreIdx<pins.length;ScoreIdx++)
        {
            FinalScore+=pins[ScoreIdx];


            if(ScoreIdx<19) {
                if (isaSpare(ScoreIdx)) {
                    FinalScore += pins[ScoreIdx + 2];
                }
                if (isaStrike(ScoreIdx)) {
                    FinalScore += pins[ScoreIdx + 1];
                    FinalScore += pins[ScoreIdx + 2];
                }

            }
        }

        return FinalScore;
    }

    private boolean isaSpare(int ScoreIdx) {
        return 10 == pins[ScoreIdx] + pins[ScoreIdx + 1];
    }

    private boolean isaStrike(int ScoreIdx) {
        return 10 == pins[ScoreIdx];
    }


}
