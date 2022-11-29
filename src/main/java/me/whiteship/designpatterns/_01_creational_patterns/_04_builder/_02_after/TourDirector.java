package me.whiteship.designpatterns._01_creational_patterns._04_builder._02_after;

import me.whiteship.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class TourDirector {

    public TourPlan bangTrip(TourPlanBuilder tourPlanBuilder) {
        return tourPlanBuilder.title("방콕 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2022, 11, 30))
                .whereToStay("펜션")
                .addPlan(0, "체크인")
                .addPlan(0, "저녁 먹기")
                .getPlan();
    }

    public TourPlan daeJeonTrip(TourPlanBuilder tourPlanBuilder) {
        return tourPlanBuilder.title("대전")
                .startDate(LocalDate.of(2022, 12, 01))
                .getPlan();
    }
}
