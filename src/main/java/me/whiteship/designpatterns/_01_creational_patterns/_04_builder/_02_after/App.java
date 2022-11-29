package me.whiteship.designpatterns._01_creational_patterns._04_builder._02_after;

import me.whiteship.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

public class App {
    public static void main(String[] args) {
        TourDirector director = new TourDirector();
        TourPlan bangTrip = director.bangTrip(new DefaultTourBuilder());
        System.out.println("bangTour = " + bangTrip);

        TourPlan daeJeonTrip = director.daeJeonTrip(new DefaultTourBuilder());
        System.out.println("daejeon = " + daeJeonTrip);
    }
}
