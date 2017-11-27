package store;

public class BookSpec {
    private String author;
    private Genre genre;
    private Type type;
    private Language language;

    public BookSpec (String author, Genre genre, Type type, Language language) {
        this.author = author;
        this.genre = genre;
        this.type = type;
        this.language = language;
    }

    public String getAuthor() {
        return author;
    }
    public Genre getGenre() {
        return genre;
    }
    public Type getType() {
        return type;
    }
    public Language getLanguage() {
        return language;
    }

    boolean matches(BookSpec otherSpec) {
        if ((author != null) && (!author.equals("")) && (!author.equals(otherSpec.author))) {
            return false;
        }
        if (genre != otherSpec.genre) {
            return false;
        }
        if (type != otherSpec.type) {
            return false;
        }
        return language == otherSpec.language;
    }
}
