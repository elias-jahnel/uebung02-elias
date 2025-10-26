package h2;
 
 public class H2_main {
 public static void main(String[] args) {
 // Hier dürfen wir uns als menschlicher Taschenrechner fühlen.
 int i = 12, j = 4, k = 20, min, max;
 
 // Minimum finden. Schön stumpf, aber funktioniert zuverlässig.
 if (i < j && i < k) {
 min = i;
 } else if (j < i && j < k) {
 min = j;
 } else {
 min = k;
 }
 
 // Maximum finden, das Gegenteil von Bescheidenheit.
 if (i > j && i > k) {
 max = i;
 } else if (j > i && j > k) {
 max = j;
 } else {
 max = k;
 }
 
 System.out.println("Min: " + min + " | Max: " + max);
 }
 }
