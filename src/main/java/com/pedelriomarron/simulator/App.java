package com.pedelriomarron.simulator;

import com.pedelriomarron.simulator.classes.*;
import com.pedelriomarron.simulator.utils.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        // Creación de Ciudad
        City city = City.builder().votePercentage(100).name("Ciudad Ejemplo").population(1000000).seats(21).build();

        // Creación de partidos
        Party partyA = Party.builder().name("Partido A").build();
        Party partyB = Party.builder().name("Partido B").build();
        Party partyC = Party.builder().name("Partido C").build();
        Party partyD = Party.builder().name("Partido D").build();
        Party partyE = Party.builder().name("Partido E").build();
        Party partyF = Party.builder().name("Partido E").build();
        Party partyG = Party.builder().name("Partido E").build();

        List<Party> parties = new ArrayList<Party>();
        parties.add(partyC);
        parties.add(partyA);
        parties.add(partyE);
        parties.add(partyF);
        parties.add(partyG);
        parties.add(partyD);
        parties.add(partyB);

        // Opinión
        List<CityOpinionToParty> cityOpinionToPartiesList = new ArrayList<CityOpinionToParty>();
        cityOpinionToPartiesList.add(CityOpinionToParty.builder().party(partyD).opinion(7.03).city(city).build());
        cityOpinionToPartiesList.add(CityOpinionToParty.builder().party(partyE).opinion(2.7).city(city).build());
        cityOpinionToPartiesList.add(CityOpinionToParty.builder().party(partyB).opinion(31.1).city(city).build());
        cityOpinionToPartiesList.add(CityOpinionToParty.builder().party(partyA).opinion(39.1).city(city).build());
        cityOpinionToPartiesList.add(CityOpinionToParty.builder().party(partyC).opinion(18.4).city(city).build());
        cityOpinionToPartiesList.add(CityOpinionToParty.builder().party(partyF).opinion(1.2).city(city).build());
        cityOpinionToPartiesList.add(CityOpinionToParty.builder().party(partyG).opinion(0.2).city(city).build());


        city.setCityOpinionToParties(cityOpinionToPartiesList);

        // Generar CityVote
        CityVote cityVote = CityVote.builder().city(city).partyList(parties).build();

        // Generar PartyVotes
        List<PartyVotes> pv = cityVote.genPartyVotes();

        // Generar sistema dhont
        SystemDHondt sh= SystemDHondt.builder().partyVotesList(pv).seats(city.getSeats()).build();
        sh.startSystem();

        System.out.println();






    }
}
