package me.whiteship.designpatterns._01_creational_patterns._04_builder._01_before;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        /**
         * 객체 생성시 일관된 프로세스가 없다
         * days 와 nights 를 항상 같이 입력 하도록 강제하고 싶은 경우 불가능
         * 불완전한 객체가 생성되는 경우가 발생 가능하다
         * 만약 생성자로 객체를 만들게 된다면 케이스에 따라 생성자가 굉장히 늘어나게 된다
         */

        TourPlan shortTrip = new TourPlan();
        shortTrip.setTitle("세종시 여행");
        shortTrip.setStartDate(LocalDate.of(2022,11,28));

        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("방콕 여행");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2022, 12, 1));
        tourPlan.setWhereToStay("호텔");
        tourPlan.addPlans(0,"체크인");
        tourPlan.addPlans(0,"짐 풀고 저녁 식사");
        tourPlan.addPlans(1,"조식 뷔페 식사");
        tourPlan.addPlans(1,"주변 핫 플레이스 구경");
        tourPlan.addPlans(1,"주변 로컬 맛집에서 점심 식사");
        tourPlan.addPlans(1,"점심 식사 후 낮잠");
        tourPlan.addPlans(1,"레스토랑에서 저녁 식사");
        tourPlan.addPlans(2,"체크아웃");

        System.out.println("tourPlan = " + tourPlan);
    }
}
