package enums;

public enum EmotionalCondition {
    FEAR ("страх"),
    ANGRY ("сердитость"),
    CALM ("в спопокойном состоянии"),
    PERK ("оживление"),
    ALLEMOTIONS("cтрах","оживление", "сердитость", "оживление");
    private String title;
    private String sum;
    EmotionalCondition(String title) {
        this.title = title;
    }
    EmotionalCondition(String em1, String em2, String em3, String em4){
        this.sum = em1 + " " + em2 + " " + em3 + " " + em4;

    }

    public String getTitle() {
        return title;
    }
    public String getSum(){
        return sum;
    }

    @Override
    public String toString() {
        return "EmotionalCondition{" +
                "title='" + title + '\'' +
                ", sum='" + sum + '\'' +
                '}';
    }
}
