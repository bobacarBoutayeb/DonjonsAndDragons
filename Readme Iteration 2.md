# Projet “Donjons & Dragons”

Objectifs

Le but de l’ensemble des activités qui suivent est de créer un jeu, inspiré des jeux de plateaux de l’univers «Donjons et Dragons »,en utilisant le langage Java.L’ensemble des règles du jeu peut être trouvé dans le document **“Projet D&D - Règles du jeu**”.

Nous allons commencer par créer et afficher des personnages.

Compétences

- Programmer avec des variables
- Programmer une condition
- Programmer une boucle
- Programmer avec des tableaux
- Programmer une fonction et l'appeler
- Définir et utiliser une méthode
- Définir des classes
- Instancier des objets
- Générer la javadoc

**ITÉRATION 2**

Création des personnages et du plateau de jeu

Modalité

- Travail en autonomie et production individuelle.
- Durée :**2 jours** (max)

**1 — Structure du jeu et création de personnages**

Nous allons manipuler deux types de personnages : **guerrier** et **magicien** (pour le moment une seule classe, avec un attribut de type string qui vaudra “guerrier” ou “magicien”) et leur équipement par défaut (arme ou sort).

Le **guerrier** possède une arme et peut être équipé d’un bouclier pour se défendre.

Le **magicien** possède un sort et peut avoir un philtre pour se défendre.

Chaque type de personnage est caractérisé par les attributs suivants :

- *Guerrier*:  Nom, Niveau de vie (5-10), Force d’attaque (5-10),  Arme, Bouclier
- *Magicien* : Nom, Niveau de vie (3-6), Force d’attaque (8-15), Sort, Philtre

Le programme commence par vous proposer **un premier menu**:

- **Nouveau personnage ou quitter le jeu**:
- Création du personnage : le programme va demander queltype de personnage vous voulez créer, puis vous demande les informations adéquates pour créer ce personnage, avec la saisie via lecture des entrées clavier (classe [Scanner)](https://www.w3schools.com/java/java_user_input.asp), des informations du personnage (Guerrier ou Magicien).
- Pour le personnage en cours de création, un choix permettra de :
  - afficher toutes les infos du personnage
  - modifier ses infos
- Quitter le jeu : vous pouvez à tout moment quitter le jeu

CONSEILS DE DÉVELOPPEMENT

- Choisissez avec attention les types de variables permettant de représenter les attributs des personnages. Les armes et sorts sont caractérisés par un nom, et un niveau d’attaque.
- Commencez à architecturer votre code correctement en utilisant des classes :
- Une classe « Personnage » qui aura 3 constructeurs (sans paramètres, avec nom, et avec nom/niveau de vie/force d’attaque)
- Une classe « Menu » qui vous permettra de structurer correctement le déroulement du jeu et les messages pour l’utilisateur en utilisant des fonctions.

- Une classe « game » qui contiendra la logique interne du jeu ( joueurs, avancement )
- **Attention!!** Toutes vos classes devront être structurées correctement (Getters/Setters, constructeurs, méthode toString(), ...).

RESSOURCES

- *Reprenez celles données précédemment.*

**2 — Plateau de Jeu et déplacement du joueur**

- Ajouter une option dans le Menu pour démarrer la partie
- Au démarrage de la partie, le joueur se trouve sur la case 1 du plateau.
- A chaque tour de jeu le dé virtuel est jeté et le personnage se déplace de case en case tant qu’il n’est pas arrivé au bout du plateau.
- Pas de notions d’ennemis, de combats et de caisses surprises dans cette première version. Le programme doit afficher (dans la console)l’avancement du joueur sur le plateau (case n / 64).
- Une fois arrivé au bout du plateau, choisir de quitter le jeu ou de recommencer une partie.

CONSEILS DE DÉVELOPPEMENT

1. Votre méthode main doit rester **très courte** : environ 15 lignes ! Organisez votre code en conséquence.
1. L’IDE faisant bien son travail, il vous proposera régulièrement des corrections pour vos erreurs, c’est super **mais** n’acceptez **JAMAIS** (pour le moment ;-) ). La correction consiste à mettre souvent le mot clé “**static**” pour résoudre vos problèmes. Vous allez courir à votre perte. A ce stade , nous ne devons pas voir dans votre code le mot static (à part pour le main).
1. Tous vos attributs seront “**private**” par défaut et ne seront approchés que par le biais de getters et setters.

RESSOURCES

- *Ressources précédentes*

**Livrables**

- Codes commentés des classes «Main », « Personnage », «Arme », et «Menu ».  A déposer sur GitHub.
- Un glossaire des différentes syntaxes utilisées est à déposer sur votre GitHub.
4/4
