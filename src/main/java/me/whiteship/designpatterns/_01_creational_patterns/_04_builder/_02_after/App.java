package me.whiteship.designpatterns._01_creational_patterns._04_builder._02_after;

import me.whiteship.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        TourPlanBuilder builder = new DefaultTourBuilder();
        TourPlan bangTour = builder.title("방콕 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2022, 11, 30))
                .whereToStay("펜션")
                .addPlan(0, "체크인")
                .addPlan(0, "저녁 먹기")
                .getPlan();
        System.out.println("bangTour = " + bangTour);

        TourPlanBuilder builder2 = new DefaultTourBuilder();
        TourPlan daejeon = builder2.title("대전")
                .startDate(LocalDate.of(2022, 12, 01))
                .getPlan();
        System.out.println("daejeon = " + daejeon);
    }
}
