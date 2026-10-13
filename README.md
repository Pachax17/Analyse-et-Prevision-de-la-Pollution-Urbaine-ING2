# Analyse et prévision de la pollution urbaine

Projet de groupe en ING2 à CY Tech (novembre 2025). L'idée : croiser la qualité de l'air dans le métro avec la fréquentation, la météo et les événements en ville, puis prévoir un indice de pollution par station avec Spark MLlib.

## Stack

- Scala 2.12.18
- Apache Spark 3.5 (core, SQL, MLlib)
- sbt 1.11.7

## Données

Tout est dans `Spark pollution/Data/`.

`pollution_data.csv` contient 17 280 relevés, un toutes les 15 minutes du 1er au 30 janvier 2025, sur 6 stations fictives réparties sur 3 lignes (Central Gare, Université, Hôpital Nord, Zone Industrielle, Parc Sud, Stade Ouest). Chaque relevé donne le CO2 (ppm), les PM2.5 (µg/m³), le bruit (dB), l'humidité, la température, la météo, le nombre de voyageurs, si c'est un jour férié, un éventuel événement (match, concert, manifestation) et un `pollution_index`, qui sert de variable cible.

`stations_metro2_enriched.csv` liste 404 stations du réseau francilien (source IDFM) avec leurs coordonnées, la recommandation de surveillance de la qualité de l'air et un niveau de pollution (faible, moyenne ou élevée). Le séparateur est `;`.

`emission-de-co2e-par-voyageur-kilometre-sur-le-reseau.xlsx` donne les émissions de CO2e par voyageur-kilomètre pour chaque ligne et mode de transport (chiffres RATP 2019).

## Structure

```
Spark pollution/
├── build.sbt          dépendances Spark
├── project/           version de sbt
└── Data/              les trois jeux de données
```

## Lancer le projet

Il faut un JDK (11 ou 17) et sbt.

```bash
cd "Spark pollution"
sbt compile
sbt run
```

Le dépôt ne contient pour l'instant que la configuration sbt et les données. Le code Spark (chargement, analyse, modèle de prévision) n'a pas été poussé : `sbt run` ne lancera rien tant qu'il n'y a pas de sources dans `src/main/scala/`.

## Équipe

Pachax17, Jalis Klingler ([@birdyy667](https://github.com/birdyy667)) et Simon Huang.
