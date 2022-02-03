package com.pedelriomarron.simulator.classes;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Setter
public class Region {

    private String code;
    private String name;
    private String flag;



}
