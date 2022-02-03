package com.pedelriomarron.simulator.classes;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Builder
@ToString
@Getter
@Setter
public class SystemDHondt {

    private int seats;
    private List<PartyVotes> partyVotesList;
    //private List<PartyVotes> partyVotesForSeats = new ArrayList<PartyVotes>();


    void order(){
        Collections.sort(partyVotesList, new PartyVotesForVotesComparator());


    }


    public List<PartyVotes>  startSystem(){

        System.out.println("Elecciones !");
        this.order();
        int max =0;
        int cociente =0;

        for(int i=0;i<seats;i++){
            PartyVotes pvt = null;
            for(PartyVotes pv: partyVotesList){
                cociente = (pv.getVotes() / (pv.getSeats()+1));
                //System.out.println("Cociente => "+cociente);
                if( cociente > max ){
                    max = cociente;
                    //System.out.println("Max => "+max);
                     pvt = pv;
                }
            }
            pvt.setSeats(pvt.getSeats()+1);
            // TODO: Aqui se haría el control de escaños
            System.out.println("Escaño nº"+(i+1) +":"+pvt.getParty().getName()+" con "+max+" votos");
            max = (pvt.getVotes() / (pvt.getSeats()+1));
        }

        for(PartyVotes pv: partyVotesList){
            System.out.println("Partido => "+pv.getParty().getName()+" votos=>"+pv.getVotes()+" Asientos:"+pv.getSeats() );
        }

        return partyVotesList;

    }

}



