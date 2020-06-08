package by.belhard.j22.lessons.guntchart;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ChartConstructor {

    private static final int MINIMAL_TITLE_WIDTH = 5;
    private static final String[] MONTHS_SHORT = {"jn", "fb", "mr", "ap", "ma", "jn", "jl", "au", "se", "oc", "no", "de"};

    private final TreeSet<Project> projects;

    public ChartConstructor(TreeSet<Project> projects) {

        this.projects = projects;
    }

    public String constructChartByYear(int year) {

        StringBuilder result = new StringBuilder();

        //		Interval chartBounds = calcChartBounds(projects);

        List<Project> projectsByYear = projects.stream().filter(p -> p.getInterval().hasYear(year)).collect(Collectors.toList());

        int titleWidth = calcTitleWidth(projectsByYear);

        result.append(getHead(titleWidth, year));
        projectsByYear.forEach(p -> result.append(getChartRow(p, titleWidth, year)));

        return result.toString();
    }

    private String getHead(int titleWidth, int year) {

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%-" + (titleWidth + 3) + "d", year));

        LocalDate tmp = LocalDate.of(year, 1, 1);
        int tmpMonth = 0;

        while (tmp.getYear() == year) {
            if (tmp.getMonthValue() - 1 == tmpMonth) {
                sb.append(MONTHS_SHORT[tmpMonth]);
                tmpMonth++;
                tmp = tmp.plusDays(2);
            } else
                sb.append(" ");

            tmp = tmp.plusDays(2);
        }

        return sb.append("\n").toString();
    }

    private int calcTitleWidth(Collection<Project> projects) {

        return projects.stream().mapToInt(p -> p.getTitle().length()).max().orElse(MINIMAL_TITLE_WIDTH);
    }

    private String getChartRow(Project p, int titleWidth, int year) {

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%." + titleWidth + "s", p.getTitle())).append(" | ");

        Interval interval = p.getInterval();

        LocalDate tmp = LocalDate.ofYearDay(year, 1);

        while (tmp.isBefore(interval.getStart())) {
            sb.append('.');
            tmp = tmp.plusDays(2);
        }

        while (tmp.isBefore(interval.getEnd()) && tmp.getYear() == year) {
            sb.append('#');
            tmp = tmp.plusDays(2);
        }

        while (tmp.getYear() == year) {
            sb.append('.');
            tmp = tmp.plusDays(2);
        }

        return sb.append("\n").toString();
    }

	/*private Interval calcChartBounds(Collection<Project> projects) {
		LocalDate start = projects.stream().map(p -> p.getInterval().getStart()).min(Comparator.naturalOrder()).orElseThrow();
		LocalDate end = projects.stream().map(p -> p.getInterval().getEnd()).max(Comparator.naturalOrder()).orElseThrow();
		return new Interval(start, end);
	}*/

}