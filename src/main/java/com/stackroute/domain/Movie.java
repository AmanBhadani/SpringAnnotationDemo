package com.stackroute.domain;


public class Movie {
    private Actor actor;

    public Movie() {
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }


    public Actor getActor() {
        return actor;
    }


    public void setActor(Actor setactor) {
        this.actor = setactor;
    }

    @Override
    public String toString() {
        return "Movie-Actor " + actor;
    }


}
