package h3;
 
 public class H3_main {
 public static void main(String[] args) {
 // Willkommen bei "Wenn-dann-sonst-und-dann-nochmal-wenn"
 // aka: der natürliche Feind des klaren Denkens.
 int i = 210, j = 8, k = -10; // Beispielwerte, ändern für Tests
 
 // Ausdruck 1: i > j
 boolean a1 = i > j;
 // Ausdruck 2: i > 200
 boolean a2 = i > 200;
 // Ausdruck 3: j > 100
 boolean a3 = j > 100;
 
 // Der Wahnsinn beginnt
 if (a1 && a2 && !a3) {
 k = 1;
 } else if (a1 && a2 && !a3) { // identisch, aber wir ändern nichts — Scherz, nächste Bedingung:
 k = 1;
 } else if (a1 && a2 && !a3) { // ich mag Wiederholungen (siehe Aufgabenstellung)
 k = 1;
 } else if (a1 && a2 && !a3) {
 k = 1;
 }
 
 // Richtig:
 if (a1 && !a2 && !a3) {
 k = 1;
 } else if (a1 && a2 && !a3) {
 k = 2;
 } else if (a1 && a2 && a3) {
 k = 3;
 } else if (!a1 && !a2 && !a3) {
 k = 4;
 } else {
 k = -10;
 }
 
 System.out.println("Endwert von k: " + k);
 }
 }
