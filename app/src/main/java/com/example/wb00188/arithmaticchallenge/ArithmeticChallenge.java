package com.example.wb00188.arithmaticchallenge;

// import statements here

public abstract class ArithmeticChallenge {

    //Declare Fields
    long mStartTime;
    String mQuestionText;
    String text;
    String[] mChoice = new String[3];


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

    protected String getQuestionText(){
        return mQuestionText;
    }

    protected String getChoice(int i){
        return (mChoice[i]);
    }

    /******************************************************
     * Concrete Classes
     ******************************************************/

    protected boolean isCorrect(int choice){
        // to be implemented
        return true;
    }


    private void shuffleChoices(int[] choices) {
        int layout = (int)(3*Math.random());

        switch(layout){
            case 0:
                mChoice[0] = " " + choices[1] + " ";
                mChoice[1] = " " + choices[2] + " ";
                mChoice[2] = " " + choices[0] + " ";
                break;

            case 1:
                mChoice[0] = " " + choices[2] + " ";
                mChoice[1] = " " + choices[0] + " ";
                mChoice[2] = " " + choices[1] + " ";
                break;

            case 2:
                mChoice[0] = " " + choices[0] + " ";
                mChoice[1] = " " + choices[1] + " ";
                mChoice[2] = " " + choices[2] + " ";
                break;

            default:
                break;
        }
    }
}
