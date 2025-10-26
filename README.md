# Übung 02 – Elias Jahnel

Dieses Repository enthält die Lösungen für **Übung 02** im Rahmen des Programmierkurses (WiSe 2025/26).

## Struktur

uebung02-elias/
├── src/
│ └── main/
│ └── java/
│ ├── h1/
│ │ └── H1_main.java
│ ├── h2/
│ │ └── H2_main.java
│ └── h3/
│ └── H3_main.java
├── .gitignore
└── README.md


## Ausführen
```bash
# Beispiel:
javac -d out $(find src/main/java -name "*.java")
java -cp out h1.H1_main

Hinweise

    Getestet unter Kali Linux / OpenJDK 17

    Abgabe-Repo: https://github.com/elias-jahnel/uebung02-elias



