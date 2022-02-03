package com.pedelriomarron.simulator.classes;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Builder
@ToString
@Getter
@Setter
public class City {

    private String code;
    private String name;
    private String flag;
    private Region region;
    private int population;
    private int votePercentage;
    private int seats;
    private List<CityOpinionToParty> cityOpinionToParties;




}
