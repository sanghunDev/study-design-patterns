package me.whiteship.designpatterns._01_creational_patterns._04_builder._02_after;

import me.whiteship.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public interface TourPlanBuilder {
    // TourPlanBuilder 리턴으로 이후 TourPlanBuilder 에 있는 다른 메서드 연속적으로 호출 가능
    TourPlanBuilder title(String title);

    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    TourPlan getPlan();
}
