package store;

public enum Type {
    PAPERBACK, HARDCOVER, EBOOK, AUDIO;

    public String toString() {
        switch (this) {
            case PAPERBACK:
                return "Paperback";
            case HARDCOVER:
                return "Hardcover";
            case EBOOK:
                return "E-book";
            case AUDIO:
                return "Audio";
            default:
                return "Type";
        }
    }
}
