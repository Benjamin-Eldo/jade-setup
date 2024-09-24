package fr.univ.lyon1.agents.testAgent;

import jade.core.Agent;

public class OtherAgent extends Agent {
    @Override
    protected void setup() {
        super.setup();
        System.out.println("Salut de l'autre agent");
    }
}
