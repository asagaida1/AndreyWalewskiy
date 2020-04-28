package ua.asagayda.homeWork.task02MeetPeople;

public class Main {
    public static void main(String[] args) {
        Cache cache = new Cache();
        RegistrationNewMember2 reg2 = new RegistrationNewMember2(Gender.MALE, "Nikolay", 18, "Kiev", 0 );
        RegistrationNewMember2 reg3 = new RegistrationNewMember2();
//        reg3.gender;
        cache.regCasche.add(reg2);
        RegistrationNewMember2 reg4 = new RegistrationNewMember2(Gender.MALE, "Sergey", 40, "Kharkiv", 2 );
        cache.regCasche.add(reg4);
        RegistrationNewMember2 reg5 = new RegistrationNewMember2(Gender.MALE, "Illya", 30, "Odessa", 1 );
        cache.regCasche.add(reg5);
        RegistrationNewMember2 reg6 = new RegistrationNewMember2(Gender.MALE, "Vladimir", 50, "Lviv", 3 );
        cache.regCasche.add(reg6);
        RegistrationNewMember2 reg7 = new RegistrationNewMember2(Gender.FEMALE, "Svetlana", 32, "Dnepr", 1 );
        cache.regCasche.add(reg7);
        RegistrationNewMember2 reg8 = new RegistrationNewMember2(Gender.FEMALE, "Rita", 18, "Kherson", 0 );
        cache.regCasche.add(reg8);
        RegistrationNewMember2 reg9 = new RegistrationNewMember2(Gender.FEMALE, "Galya", 40, "Donetsk", 1 );
        cache.regCasche.add(reg9);

        for (RegistrationNewMember2 r2: cache.regCasche) {
            System.out.println(r2.toString());
        }

    }
}
