package Alives;

public abstract class Alive implements Printable {
    enum State{
        Unborn,
        Alive,
        Death
    }

    public Alive(){
        born();
    }
    State state = State.Unborn;
    public void born(){
        this.state = State.Alive;
    }
    public void die(){
        this.state = State.Death;
    }

    public boolean isAlive(){
        return this.state == State.Alive;
    }
}
