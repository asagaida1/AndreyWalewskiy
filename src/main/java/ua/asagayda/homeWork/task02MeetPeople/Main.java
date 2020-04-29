package ua.asagayda.homeWork.task02MeetPeople;

public class Main {
    public static void main(String[] args) {
        Cache cache = new Cache();
        RegistrationNewMember reg1 = new RegistrationNewMember(Gender.MALE, "Nikolay", 18, "Kiev", 0 );
        RegistrationNewMember reg2 = new RegistrationNewMember(Gender.MALE, "Sergey", 40, "Kharkiv", 2 );
        RegistrationNewMember reg3 = new RegistrationNewMember(Gender.MALE, "Illya", 30, "Odessa", 1 );
        RegistrationNewMember reg4 = new RegistrationNewMember(Gender.MALE, "Vladimir", 50, "Lviv", 3 );
//        RegistrationNewMember reg5 = new RegistrationNewMember(Gender.FEMALE, "Svetlana", 32, "Dnepr", 1 );
//        RegistrationNewMember reg6 = new RegistrationNewMember(Gender.FEMALE, "Rita", 18, "Kherson", 0 );
//        RegistrationNewMember reg7 = new RegistrationNewMember(Gender.FEMALE, "Galya", 40, "Donetsk", 1 );

        cache.addNewMember(reg1);
        cache.addNewMember(reg2);
        cache.addNewMember(reg3);
        cache.addNewMember(reg4);
        cache.addNewMember(new RegistrationNewMember(Gender.FEMALE, "Svetlana", 32, "Dnepr", 1 ));
        cache.addNewMember(new RegistrationNewMember(Gender.FEMALE, "Rita", 18, "Kherson", 0 ));
        cache.addNewMember(new RegistrationNewMember(Gender.FEMALE, "Galya", 40, "Donetsk", 1 ));


        System.out.println("cache.allMember(): ");
        cache.allMember();
        System.out.println();

        System.out.println("cache.allMale(): ");
        cache.allMale();
        System.out.println();

        System.out.println("cache.allFemale(): ");
        cache.allFemale();
        System.out.println();

        System.out.println("cache.fiendName(\"Galya\"): ");
        cache.fiendName("Galya");
        System.out.println();

        System.out.println("cache.fiendCity(\"Kiev\"): ");
        cache.fiendCity("Kiev");
    }
}
