package h1;

public class H1_main {
    public static void main(String[] args) {
        // Willkommen in der wundervollen Welt der Bedingten Subtraktion.
        // Spoiler: Wir ziehen einfach stumpf 10 ab, wenn der Wert zu groß ist.
        int z = 18; // Beliebiger Startwert. Ändern, wenn du dich kreativ fühlst.

        if (z > 10) {
            // Wenn der Mensch mal wieder übertreibt, einfach ein bisschen runterschrauben.
            z = z - 10;
        }

        System.out.println("Endwert von z: " + z);
    }
}
