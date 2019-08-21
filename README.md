# A project created using Java graphics in VS Code

A grid represents a forest in which there exist 4 kinds of animals, corresponding to 4 habitats (represented by cells) as follows:

* `Rabbit` - `Grass`

* `Lion` - `Mountain`

* `Puppy` - `Road`

* `Fish` - `Water`

Each time the program is run, a scene with a blank area to the right will be created procedurally and 4 types of cells will be allocated randomly in the grid with their corresponding animals, according to the following specifications:

* `Grass` : accounts for 1/2, painted different shades of green (they still have elements of red and blue in them but these have smalller values obviously), movement cost is (g - 100)/50 (g is the value of the green element) and populated with white `Rabbit`

* `Mountain` : accounts for 1/6, painted light grey (`rgb(204, 204, 204)`), movement cost is 10 and populated with red `Lion`

* `Road` : accounts for 1/6, painted dark grey (`rgb(102, 102, 102)`), movement cost is 1 and populated with green `Puppy`

* `Water` : accounts for 1/6, painted blue, movement cost is 100 and populated with yellow `Fish`

When a user moves the mouse over a cell, its information will be displayed to the blank area in the format:

* `Animal: ...`

* `Habitat: ...`

* `Movement cost: ...`
