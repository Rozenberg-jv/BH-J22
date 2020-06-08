package by.belhard.j22.lessons.guntchart;

import java.time.LocalDate;

public class Interval {

    private LocalDate start;

    private LocalDate end;

    public Interval(LocalDate start, LocalDate end) {

        if (start != null && end != null && start.isBefore(end)) {
            this.start = start;
            this.end = end;
        } else {
            throw new RuntimeException();
        }
    }

    boolean isIn(LocalDate localDate) {

        return start.isBefore(localDate) && end.isAfter(localDate);
    }

    boolean hasYear(int year) {

        return start.getYear() == year || end.getYear() == year;
    }

    LocalDate getStart() {

        return start;
    }

    LocalDate getEnd() {

        return end;
    }

}