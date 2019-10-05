# A project created using Java graphics (AWT and Swing) in VS Code

In a jungle there exist 4 kinds of animals, corresponding to 4 types of habitats as follows:

* `Rabbit` - `Grassland`

* `Lion` - `Savannah`

* `Jackal` - `Desert`

* `Fish` - `Water`

Each time the program is run, a scene with a blank display to the right will be created procedurally and 4 types of habitats will be allocated randomly in the jungle with their corresponding 4 kinds of animals, according to the following specifications:

* `Grassland` : accounts for 1/2, painted different shades of green (they still have elements of red and blue in them but these should have smalller values obviously), movement cost is (g - 100)/50 (g is the value of the green element) and populated with white `Rabbit`

* `Savannah` : accounts for 1/6, painted orange, movement cost is 10 and populated with red `Lion`

* `Desert` : accounts for 1/6, painted yellow, movement cost is 1 and populated with green `Jackal`

* `Water` : accounts for 1/6, painted blue, movement cost is 100 and populated with yellow `Fish`

When a user moves the mouse over a cell, its information will appear on the display in the following format:

* `Animal: ...`

* `Habitat: ...`

* `Movement cost: ...`
