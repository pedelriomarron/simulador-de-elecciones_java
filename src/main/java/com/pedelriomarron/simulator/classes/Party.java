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
public class Party {

    private String name;
    private String acronym;
    private String color;
    private String logo;
    private Ideology ideology;


}
