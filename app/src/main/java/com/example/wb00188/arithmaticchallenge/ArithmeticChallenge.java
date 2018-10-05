package com.example.wb00188.arithmaticchallenge;

// import statements here

public abstract class ArithmeticChallenge {

    //Declare Fields
    long mStartTime;
    String mQuestionText;
    String text;
    String[] mChoice = new String[3];
    int mAnswer;
    int mScore;
    int mHighScore;
    int mProgress;


    public ArithmeticChallenge(int TOTAL_LEVELS, int TURNS_PER_LEVEL){
        // to be implemented
    }

    /******************************************************
     * Abstract Classes
     ******************************************************/

    //Abstract Methods
    abstract String createQuestion();
    abstract int[] createChoices();

    //Getters and Setters


    protected void setChoices(int[] choices) {
        shuffleChoices(choices);
        mStartTime = System.currentTimeMillis();
    }

    protected void setQuestionText(String txt){
        mQuestionText = txt;
    }

    protected void setText(String txt){
        this.text = txt;
    }

    protected void setScore(boolean rOw){
        long time = System.currentTimeMillis() - mStartTime;
        int inScore = (int)(100 - time/100);
        int score = (inScore <= 0) ? 0 : inScore;
        mScore += (rOw) ? score : 0;
    }

    protected void setProgress() {
        mProgress += 10;
    }

    protected void setHighScore(int highScore){
        mHighScore = highScore;
    }
    protected String getQuestionText(){
        return mQuestionText;
    }

    protected String getChoice(int i){
        return (mChoice[i]);
    }

    protected int getScore() {
        return mScore;
    }

    protected int getProgress(){
        return mProgress;
    }

    protected int getHighScore(){
        return mHighScore;
    }

    /******************************************************
     * Concrete Classes
     ******************************************************/

    protected boolean isCorrect(int choice){
        boolean isCorrect = (choice == mAnswer) ? true : false;
        return isCorrect;
    }


    private void shuffleChoices(int[] choices) {
        int layout = (int)(3*Math.random());

        switch(layout){
            case 0:
                mChoice[0] = " " + choices[1] + " ";
                mChoice[1] = " " + choices[2] + " ";
                mChoice[2] = " " + choices[0] + " ";
                mAnswer = 2;
                break;

            case 1:
                mChoice[0] = " " + choices[2] + " ";
                mChoice[1] = " " + choices[0] + " ";
                mChoice[2] = " " + choices[1] + " ";
                mAnswer = 1;
                break;

            case 2:
                mChoice[0] = " " + choices[0] + " ";
                mChoice[1] = " " + choices[1] + " ";
                mChoice[2] = " " + choices[2] + " ";
                mAnswer = 0;
                break;

            default:
                mAnswer = 0;
                break;
        }
    }
}
