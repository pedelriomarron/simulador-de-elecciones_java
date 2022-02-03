package com.pedelriomarron.simulator.classes;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;

@Builder
@ToString
@Getter
@Setter
public class PartyVotes {

    private int votes;
    private Party party;
    private int seats =0;


}

 class PartyVotesForVotesComparator implements Comparator<PartyVotes> {
    public int compare(PartyVotes partyVotes1, PartyVotes partyVotes2) {
        return partyVotes2.getVotes() - partyVotes1.getVotes();
    }
}
