package ua.asagayda.homeWork.task02MeetPeople;

import org.hamcrest.core.StringContains;

import java.util.ArrayList;
import java.util.List;

class Cache {
    RegistrationNewMember registrationNewMember;

    private List<RegistrationNewMember> regCasche = new ArrayList<>();

    protected void addNewMember(RegistrationNewMember regNewMember){
        regCasche.add(regNewMember);
    }

    protected void allMember() {
        for (RegistrationNewMember r : regCasche) {
            System.out.println(r.toString());
        }
    }

    protected void allMale() {
        for (RegistrationNewMember r : regCasche) {
            if (r.gender.equals(Gender.MALE)){
                System.out.println(r.toString());
            }
        }
    }
    protected void allFemale() {
        for (RegistrationNewMember r : regCasche) {
            if (r.gender.equals(Gender.FEMALE)){
                System.out.println(r.toString());
            }
        }
    }

    protected void fiendName(String name) {
        for (RegistrationNewMember r : regCasche) {
            if (r.getName().equals(name)){
                System.out.println(r.toString());
            }
        }
    }

    protected void fiendCity(String city) {
        for (RegistrationNewMember r : regCasche) {
            if (r.getCity().equals(city)){
                System.out.println(r.toString());
            }
        }
    }

}
