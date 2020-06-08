package by.belhard.j22.lessons.guntchart;

public class Project implements Comparable<Project> {

    private String title;

    private Interval interval;

    public Project(String title, Interval interval) {

        this.title = title;
        this.interval = interval;
    }

    @Override
    public int compareTo(Project o) {

        return this.getInterval().getStart().compareTo(o.getInterval().getStart());
    }

    public String getTitle() {

        return title;
    }

    public Interval getInterval() {

        return interval;
    }
}