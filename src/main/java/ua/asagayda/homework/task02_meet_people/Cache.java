package ua.asagayda.homework.task02_meet_people;

import java.util.ArrayList;
import java.util.List;

class Cache {

    private List<Member> regCasche;

    public Cache() {
        regCasche = new ArrayList<>();
    }

    void addNewMember(Member member){
        regCasche.add(member);
    }

    void allMember() {
        for (Member r : regCasche) {
            System.out.println(r);
        }
    }

    protected void allMale(Gender gender) {
        for (Member r : regCasche) {
            if (!r.gender.equals(gender)){
                System.out.println(r.toString());
            }
        }
    }
    protected void showAllFemale() {
        for (Member r : regCasche) {
            if (r.gender.equals(Gender.FEMALE)){
                System.out.println(r.toString());
            }
        }
    }

    protected void findName(String name) {
        for (Member r : regCasche) {
            if (r.getName().equals(name)){
                System.out.println(r);
            }
        }
    }

    protected void fiendCity(String city) {
        for (Member r : regCasche) {
            if (r.getCity().equals(city)){
                System.out.println(r.toString());
            }
        }
    }

}
