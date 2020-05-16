package Observer;

public class HexObserver extends Observer {
    @Override
    public void update() {
        System.out.println(""+Integer.toHexString(subject.getState()));
    }

    public HexObserver(Subject subject){
        this.subject =subject;
        this.subject.add(this);
    }
}
