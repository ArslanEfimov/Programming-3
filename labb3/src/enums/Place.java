package enums;

public enum Place {
    WHITE_BOAT ("белый пароход"),
    UNKNOWN_PLACE ("кто где"),
    HOME ("Дом Малыша");


    private String title;

    Place(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
