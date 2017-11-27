package store;

public enum Genre {
    COMEDY, DRAMA, HORROR, ROMANCE, FANTASY, CRIME;

    public String toString() {
        switch(this) {
            case COMEDY:
                return "Comedy";
            case DRAMA:
                return "Drama";
            case HORROR:
                return "Horror";
            case ROMANCE:
                return "Romance";
            case FANTASY:
                return "Fantasy";
            case CRIME:
                return "Crime";
            default:
                return "Genre";
        }
    }
}
