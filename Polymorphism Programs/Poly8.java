interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Guitar");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Piano");
    }
}

public class Poly8 {
    public static void main(String[] args) {
        Playable[] instruments = { new Guitar(), new Piano() };

        for (Playable instrument : instruments) {
            instrument.play(); // Calls overridden methods
        }
    }
}
