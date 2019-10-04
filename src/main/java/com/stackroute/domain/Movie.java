package com.stackroute.domain;



public class Movie {
    private Actor actor;

    public Movie() {
    }

    public Movie(Actor actor1) {
        this.actor = actor1;
    }


    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie-Actor " + actor;
    }


}
