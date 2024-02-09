package DToOpgave;

import java.time.LocalDate;

public class IMDBmovieDTO {
    private int id;

    private String title;

    private boolean adult;

    private String overview;

    private String mediaType;

    private LocalDate releaseDate;

    private int voteCount;

    private double voteAverage;

    public IMDBmovieDTO(int id, String title, boolean adult, String overview, String mediaType, LocalDate releaseDate, int voteCount, double voteAverage) {
        this.id = id;
        this.title = title;
        this.adult = adult;
        this.overview = overview;
        this.mediaType = mediaType;
        this.releaseDate = releaseDate;
        this.voteCount = voteCount;
        this.voteAverage = voteAverage;
    }

    public static int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(double voteAverage) {
        this.voteAverage = voteAverage;
    }
}
