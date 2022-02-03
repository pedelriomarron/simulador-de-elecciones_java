package com.pedelriomarron.simulator.classes;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Builder
@ToString
@Getter
@Setter
public class Politic {

        private String name;
        private String lastname;
        private String photo;
        private Party party;
        private Ideology ideology;




}
