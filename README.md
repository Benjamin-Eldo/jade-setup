# Jade Setup

Uses Jade Lib : https://jade.tilab.com/download/jade/.

This project implements the package testAgent, with 2 agents class (OtherAgent, TestAgent) as example.

## Requirements
- Maven

## Setup
- Clone the project
- Place yourself in the root directory
- Run `mvn clean package -Dagents="<Container-name>:<agent-class>"`, each agent must be seperated by semicolons
Example : `mvn clean package -Dagents="Testing:fr.univ.lyon1.agents.testAgent.OtherAgent;OT:fr.univ.lyon1.agents.testAgent.TestAgent;"`

You can also specify agents references in `pom.xml` file, in `<properties>` `<agents>` (line 15) and run `mvn clean package`