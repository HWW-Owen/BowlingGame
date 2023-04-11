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
        int CurrentFrameScoreIdx=0;

        for(int CurrentFrame=0;CurrentFrame<10;CurrentFrame++)
        {
            FinalScore+=pins[CurrentFrameScoreIdx];
            FinalScore += pins[ CurrentFrameScoreIdx + 1];

            if (isaStrike( CurrentFrameScoreIdx)) {

                FinalScore += pins[ CurrentFrameScoreIdx + 2];
            }

            else  if (isaSpare(CurrentFrameScoreIdx)) {

                FinalScore += pins[CurrentFrameScoreIdx + 2];
                CurrentFrameScoreIdx++;
            }
            else
            {

                CurrentFrameScoreIdx++;
            }
            CurrentFrameScoreIdx++;

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
