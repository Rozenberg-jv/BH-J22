package by.belhard.j22.lessons.guntchart;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Project> projects = new TreeSet<>(Comparator.comparing(p -> p.getInterval().getStart()));

        projects.add(new Project("project1", new Interval(LocalDate.of(2020, 1, 15), LocalDate.of(2020, 3, 1))));
        projects.add(new Project("project2", new Interval(LocalDate.of(2020, 5, 21), LocalDate.of(2021, 4, 11))));
        projects.add(new Project("project3", new Interval(LocalDate.of(2020, 7, 20), LocalDate.of(2020, 8, 5))));
        projects.add(new Project("project4", new Interval(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 14))));
        projects.add(new Project("project5", new Interval(LocalDate.of(2020, 6, 15), LocalDate.of(2020, 6, 17))));
        projects.add(new Project("project6", new Interval(LocalDate.of(2020, 1, 2), LocalDate.of(2020, 3, 10))));
//        projects.add(new Project("project7", new Interval(LocalDate.of(2019, 11, 15), LocalDate.of(2020, 12, 25))));
        projects.add(new Project("project8", new Interval(LocalDate.of(2020, 11, 28), LocalDate.of(2021, 1, 5))));
        projects.add(new Project("project9", new Interval(LocalDate.of(2020, 6, 7), LocalDate.now())));

        ChartConstructor chartConstructor = new ChartConstructor(projects);

        String chart = chartConstructor.constructChartByYear(2019);
        System.out.println(chart);
        System.out.println();

        chart = chartConstructor.constructChartByYear(2020);
        System.out.println(chart);
        System.out.println();

        chart = chartConstructor.constructChartByYear(2021);
        System.out.println(chart);

    }

}