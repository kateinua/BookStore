package store;

public enum Language {
    ENGLISH, UKRAINIAN;

    public String toString() {
        switch(this) {
            case ENGLISH:
                return "English";
            case UKRAINIAN:
                return "Ukrainian";
            default:
                return "Language";
        }
    }
}
