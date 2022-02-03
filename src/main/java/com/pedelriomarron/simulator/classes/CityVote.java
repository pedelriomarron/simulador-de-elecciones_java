package com.pedelriomarron.simulator.classes;

import com.pedelriomarron.simulator.utils.RandomUtils;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Builder
@ToString
@Getter
@Setter
public class CityVote {

    private City city;
    private List<Party> partyList;


    public List<PartyVotes> genPartyVotes(){

        int variant = RandomUtils.getRandomNumberUsingInts(-5,6);
        int totalVotes = city.getPopulation();
        List<PartyVotes> partyVotesList = new ArrayList<PartyVotes>();


        for(CityOpinionToParty opinionToParty :  city.getCityOpinionToParties()){

          double multiplicator=  (opinionToParty.getOpinion()/100);
          int votesParty = (int) (totalVotes*multiplicator);
          System.out.println("Party=>"+opinionToParty.getParty().getName()+" Votes=>"+votesParty);
          partyVotesList.add(PartyVotes.builder().party(opinionToParty.getParty()).votes(votesParty).build());


        }

        return partyVotesList;



    }



}
