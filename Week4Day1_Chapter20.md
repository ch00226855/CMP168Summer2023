# Week 4 Day 1

# Chapter 20 GUI (Continued)

## Swing GUI Components
<img src="https://github.com/ch00226855/CMP168Summer2021/raw/main/images/chp14_SwingComponents.png" width="600">

**Adding Components to a GUI**:
1. Create the components using its constructor. Ex: `JButton button = new JButton("Click Me");`
2. Use available methods to customize the component. Ex: `button.setBackground(Color.YELLOW);`
3. Add components to their containers. Ex: `panel.add(button);`

## Layout Managers
<img src="https://github.com/ch00226855/CMP168Summer2021/raw/main/images/chp14_Layouts.png" width="600">

- `BoarderLayout`: Assign components to `NORTH`, `SOUTH`, `CENTER`, `EAST`, `WEST`.
- `GridLayout`: Create a grid to contain components. `GridLayout(3, 2)`
- `GridBagLayout`: Most detailed layout manager. (Figure 14.3.1, Table 14.3.1)

## Action Listeners
User input is handled by various action listeners.

<img src="https://github.com/ch00226855/CMP168Summer2021/raw/main/images/chp14_Listeners.png" width="600">

1. Choose the appropriate listener based on the event to be monitored.
2. Define a class that implements the listener.
3. Connect the listener with the graphical component by calling the add method (`addActionListener`, `addMouseListener`, ...)

<img src="https://github.com/ch00226855/CMP168Summer2021/raw/main/images/chp14_ListenersMethods.png" width="600">

<img src="https://github.com/ch00226855/CMP168Summer2021/raw/main/images/chp14_ListenersMethods2.png" width="600">
