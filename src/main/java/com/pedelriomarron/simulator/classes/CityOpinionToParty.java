package com.pedelriomarron.simulator.classes;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Setter
public class CityOpinionToParty {

    private City city;
    private double opinion;
    private Party party;
}
