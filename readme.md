# Conmebol Libertadores Round of 16 Draw<br>

### Definitions:

* **Pot A:** It's composed by the eight winners of the group stage.<br>
* **Pot B:** It's composed by the eight runners-up of the group stage. <br>

### Description:

This software generates the matches of the round of 16. The system is based on the format of Libertadores da América, where the contenders of the **pot A** play against the contenders of the **pot B**.

### Process in real life:

The top two from each of the eight groups advance to the round of 16. For the draw, the teams are divided in pot A and B, being the key leaders in the first pot and the vices in the second pot. Teams ranked first, decide the duel at home.

### How does the software work?

To simulate the real-life process, both groups are shuffled and the equivalent positions of each shuffled group will play against each other. To exemplify: 

* Initially the equips will be divided into two pots.

		pot A: Palmeiras, Internacional, Barcelona SC, Fluminense, Racing, Argentinos Jr, Flamengo, Atlético-MG.
		pot B: Defensa y Justicia, Olimpia, Boca Juniors, River Plate, São Paulo, Universidad Católica, Vélez, Cerro Porteño.

* Then the software will suffle the groups, altering the previous order of the teams.

		pot A: Atlético-MG, Barcelona SC, Internacional, Flamengo, Palmeiras, Racing, Argentinos Jr, Fluminense.
		pot B: Universidad Católica, Defensa y Justicia, Cerro Porteño, Boca Juniors, River Plate, Olimpia, São Paulo, Vélez.

* Then the software will match-up the teams. The first one of the pot A is going to play against the first one of the pot B. The second will play against the second and so on. In that case, it'll be like this: <br><br>

							Atlético-MG	  x     Universidad Católica
							Barcelona SC	  x     Defensa y Justicia
							Internacional	  x     Cerro Porteño
							Flamengo 	  x     Boca Juniors
							Palmeiras  	  x     River Plate
							Racing 	 	  x     Olimpia
							Argentinos Jr     x     São Paulo
							Fluminense  	  x     Vélez
