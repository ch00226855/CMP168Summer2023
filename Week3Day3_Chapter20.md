# Week 3 Day 1
# Chapter 20 GUI

Java provides several packages for creating a program with **graphical user interface (GUI)**. In this class we will learn tools from `java.awt` (the abstract window toolkit) and `javax.swing` (the swing toolkit) to create graphical objects such as windows, buttons, labels, text fields, etc.

## JFrame
```java
import javax.swing.JFrame;

public class EmptyFrame {
   public static void main(String[] args) {

      JFrame appFrame = new JFrame();

      appFrame.setSize(400, 250);

      appFrame.setTitle("An Empty Frame");
      
      appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      appFrame.setVisible(true);
   }
}
```
- `javax.swing.JFrame`: A **top-level container** of graphical objects.
- `setSize(400, 250)`: Set the frame's width (400) and height (250) in pixels
- `setTitle()`: Set the frame title
- `setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)`: Ask the program to terminate when the window is closed.
- `setVisible(true)`: Make the window visible.

## JComponent
To add content to the window, we need to create classes extending `javax.swing.JComponent` and implement its `paintComponent()` method.

**Template**:

```java
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class MyCustomJComponent extends JComponent {

   @Override
   public void paintComponent(Graphics g) {
      // Cast to Graphics2D for additonal methods
      Graphics2D graphicsObj = (Graphics2D)g;

      // Write your drawing instructions
   }
}
```

**Add a JComponent to a JFrame**:

```java
public class **** {
   public static void main(String[] args) {
      JFrame appFrame = new JFrame();
      ***Component c1 = new ***Component();
      
      ...
      
      // Add the c1 object to the frame
      appFrame.add(c1);
      
      ...
   }
}
```

Another popular class for representing a graphical component is `javax.swing.JPanel`. Its `paint()` method is used to describe what to draw.

## Graphics2D
Classes `java.awt.Graphics` and `java.awt.Graphics2D` act as paint brushes. `Graphics2D` provides the following graphing methods:
- Draw shapes: `drawLine()`, `drawRect()`, `drawOval()`, `drawRoundRect()`, `drawPolygon()`, `drawArc()`
- Draw shapes filled with color: `fillRect()`, `fillOval()`, `fillRoundRect()`, `fillPolygon()`, `fillArc()`
- Draw text: `drawString()`
- Color and Font: `setColor()`, `setFont()`
- Stroke property: `setStroke()`

**Example**: Create the histogram in Figure 14.1.5.

## Color and Font
`java.awt.Color`:
- Built-in colors: `BLACK`, `BLUE`, `CYAN`, `DARK_GRAY`, `GRAY`, `GREEN`, `LIGHT_GRAY`, `MAGENTA`, `ORANGE`, `PINK`, `RED`, `WHITE`, `YELLOW`
- Color constructor: `Color(int r, int g, int b)` - creates a color with red, green, and blue values between 0 and 255.

`java.awt.Font`
- Constructor: `Font(String name, int style, int size)`
- Font names: `Serif`, `SansSerif`, `Monospaced`, `Dialog`
- Font styles: `Font.PLAIN`, `Font.ITALIC`, `Font.BOLD`, `Font.ITALIC + Font.BOLD`

**Example**: Can you draw the following images?

![Pac Man](images/PacMan.png)


![Snowman](images/SnowMan.png)

## The MVC Framework
A Java graphical application is created based on a **model-view-controller (MVC)** framework:
- **Model**: stores data and its related logic.
- **View**: describes the presentation of the application.
- **Controller**: handles user interaction.

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/MVC-Process.svg/1200px-MVC-Process.svg.png" width="600">

## Built-In GUI Components

The `javax.swing` package provides a lot of built-in graphical objects for programmers to use.

**JLabel**: a display area for a short text string or an image
- Constructor: `JLable(String)`

**JTextField**: a single line of user-interactible text
- Constructor:
   - `JTextField(int)`: an empty text field with specified length
   - `JTextField(String)`: an empty text field with specified text
- Methods:
   - `setText()`
   - `setEditable()`
   - `setFont()`
   - `getText()`

**JButton**: a clickable button
- Constructor: `JButton(String)`
- Methods: `addActionListener(ActionListener)`

In order to interact with `JButton`, the container class must implement interface `ActionListener` and implement its `actionPerformed(ActionEvent)` method.

**GridBagLayout**: a layout manager that decribes the location of every graphical object
- Syntax: `(JFrame).setLayout(new GridBagLayout())`

**GridBagConstraints**: describes the properties of every graphical object
- Syntax: `(JFrame).add(JComponent, GridBagConstraints)`
- Attributes: `gridx`, `gridy`, `insets`, `fill(HORIZONTAL, BOTH)`, `gridWidth`, `gridHeight`, `anchor(LINE_END)`

**Exercise**: Build a salary calculator with GUI that displays yearly salary when user enters hourly wage.
