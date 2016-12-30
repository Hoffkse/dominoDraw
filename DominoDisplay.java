import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;


/**
 * Created by hoffm on 2/27/2016.
 */
public class DominoDisplay extends JFrame {
    private JLabel dominoNumbers, dominoDrawCoord, dominoSize, orientation;
    private JTextField dominoNumber1, dominoNumber2, dominoCoordinate1, dominoCoordinate2, size, spacer;
    private JRadioButton vertical, horizontal;
    private JButton draw, clear, exit;
    private JPanel menuPanel;
    private int s,xpoint, ypoint, num1, num2;
    private String orientationHold;
    public int test;
    Domino holder;

    public DominoDisplay()
    {
        super("Domino Maker V1.0");
        holder = new Domino (0,0,0,0,0, "");

        GridLayout menuGrid = new GridLayout(5, 3);
        menuPanel = new JPanel();
        menuPanel.setLayout(menuGrid);

        dominoNumbers = new JLabel("Domino Numbers");
        dominoDrawCoord = new JLabel("Enter top left (x,y)");
        dominoSize = new JLabel("Domino Size");
        orientation = new JLabel("Choose orientation");

        dominoNumber1  = new JTextField();
        dominoNumber2  = new JTextField();
        dominoCoordinate1  = new JTextField();
        dominoCoordinate2  = new JTextField();
        size  = new JTextField();
        spacer = new JTextField();

        vertical = new JRadioButton("Vertical");
        horizontal = new JRadioButton("Horizontal");
        ButtonGroup group = new ButtonGroup();
        group.add(vertical);
        group.add(horizontal);

        draw = new JButton("Draw");
        clear = new JButton("Clear");
        exit = new JButton("Exit");

        spacer.setVisible(false);

        menuPanel.add(dominoNumbers);
        menuPanel.add(dominoNumber1);
        menuPanel.add(dominoNumber2);
        menuPanel.add(dominoDrawCoord);
        menuPanel.add(dominoCoordinate1);
        menuPanel.add(dominoCoordinate2);
        menuPanel.add(dominoSize);
        menuPanel.add(size);
        menuPanel.add(spacer);
        menuPanel.add(orientation);
        menuPanel.add(vertical);
        menuPanel.add(horizontal);
        menuPanel.add(draw);
        menuPanel.add(clear);
        menuPanel.add(exit);

        add(menuPanel, BorderLayout.SOUTH);

        DrawHandler handler = new DrawHandler();
        draw.addActionListener(handler);
        clear.addActionListener(handler);
        exit.addActionListener(handler);



        setSize(500, 500);
        setVisible(true);


    }

    public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.black);
            int dynamicSize = (holder.getSize() / 5);

            //cODE TO DRAW EACH DOMINO DOT depending on number user enters, creates ellipses
            Ellipse2D.Double bottomLeftTwo = new Ellipse2D.Double((holder.getXCood() + (holder.getSize() / 1.4)), (holder.getYCood() + holder.getSize() / 10), dynamicSize, dynamicSize);
            Ellipse2D.Double topRightTwo = new Ellipse2D.Double((holder.getXCood() + (holder.getSize() / 10)), (holder.getYCood() + holder.getSize() / 1.45), dynamicSize, dynamicSize);
            Ellipse2D.Double centerOne = new Ellipse2D.Double((holder.getXCood() + (holder.getSize() / 2.3)), (holder.getYCood() + holder.getSize() / 2.3), dynamicSize, dynamicSize);
            Ellipse2D.Double topLeftFour = new Ellipse2D.Double((holder.getXCood() + (holder.getSize() / 10)), (holder.getYCood() + holder.getSize() / 10), dynamicSize, dynamicSize);
            Ellipse2D.Double bottomRightFour = new Ellipse2D.Double((holder.getXCood() + (holder.getSize() / 1.4)), (holder.getYCood() + holder.getSize() / 1.5), dynamicSize, dynamicSize);
            Ellipse2D.Double centerLeftSix = new Ellipse2D.Double((holder.getXCood() + (holder.getSize() / 2.3)), (holder.getYCood() + holder.getSize() / 10), dynamicSize, dynamicSize);
            Ellipse2D.Double centerRightSix = new Ellipse2D.Double((holder.getXCood() + (holder.getSize() / 2.3)), (holder.getYCood() + holder.getSize() / 1.45), dynamicSize, dynamicSize);
            Ellipse2D.Double centerRightDomino = new Ellipse2D.Double((holder.getXCood() + (holder.getSize() / 0.70)), (holder.getYCood() + holder.getSize() / 2.3), dynamicSize, dynamicSize);
            Ellipse2D.Double topRightRightDomino = new Ellipse2D.Double((holder.getXCood() + (holder.getSize() / .59)), (holder.getYCood() + holder.getSize() / 10), dynamicSize, dynamicSize);
            Ellipse2D.Double bottomLeftRightDomino = new Ellipse2D.Double((holder.getXCood() + (holder.getSize() / .91)), (holder.getYCood() + holder.getSize() / 1.45), dynamicSize, dynamicSize);
            Ellipse2D.Double bottomRightRightDomino = new Ellipse2D.Double((holder.getXCood() + (holder.getSize() / .59)), (holder.getYCood() + holder.getSize() / 1.45), dynamicSize, dynamicSize);
            Ellipse2D.Double topLeftRightDomino = new Ellipse2D.Double((holder.getXCood() + (holder.getSize() / .91)), (holder.getYCood() + holder.getSize() / 10), dynamicSize, dynamicSize);
            Ellipse2D.Double topCenterRightDomino = new Ellipse2D.Double((holder.getXCood() + (holder.getSize() / .71)), (holder.getYCood() + holder.getSize() / 10), dynamicSize, dynamicSize);
            Ellipse2D.Double bottomCenterRightDomino = new Ellipse2D.Double((holder.getXCood() + (holder.getSize() / .71)), (holder.getYCood() + holder.getSize() / 1.45), dynamicSize, dynamicSize);


            Ellipse2D.Double verticalLeftCenterSix = new Ellipse2D.Double((holder.getXCood() + (holder.getSize() / 10)), (holder.getYCood() + holder.getSize() / 2.3), dynamicSize, dynamicSize);
            Ellipse2D.Double verticalRightCenterSix = new Ellipse2D.Double((holder.getXCood() + (holder.getSize() / 1.4)), (holder.getYCood() + holder.getSize() / 2.3), dynamicSize, dynamicSize);
            Ellipse2D.Double centerBottomDomino = new Ellipse2D.Double((holder.getXCood() + (holder.getSize() / 2.3)), (holder.getYCood() + holder.getSize() / .7), dynamicSize, dynamicSize);
            Ellipse2D.Double topRightVerticalDomino = new Ellipse2D.Double((holder.getXCood() + (holder.getSize() / 1.4)), (holder.getYCood() + holder.getSize() / .91), dynamicSize, dynamicSize);
            Ellipse2D.Double bottomLeftVerticalDomino = new Ellipse2D.Double((holder.getXCood() + (holder.getSize() / 10)), (holder.getYCood() + holder.getSize() / .59), dynamicSize, dynamicSize);
            Ellipse2D.Double bottomRightVerticalDomino = new Ellipse2D.Double((holder.getXCood() + (holder.getSize() / 1.4)), (holder.getYCood() + holder.getSize() / .59), dynamicSize, dynamicSize);
            Ellipse2D.Double topLeftVerticalDomino = new Ellipse2D.Double((holder.getXCood() + (holder.getSize() / 10)), (holder.getYCood() + holder.getSize() / .91), dynamicSize, dynamicSize);
            Ellipse2D.Double verticalBottomCenterLeft = new Ellipse2D.Double((holder.getXCood() + (holder.getSize() / 10)), (holder.getYCood() + holder.getSize() / .7), dynamicSize, dynamicSize);
            Ellipse2D.Double verticalBottomCenterRight = new Ellipse2D.Double((holder.getXCood() + (holder.getSize() / 1.4)), (holder.getYCood() + holder.getSize() / .7), dynamicSize, dynamicSize);

            //orientation handling
            if (holder.getOrientation() == "H") {
                Rectangle rec2 = new Rectangle(holder.getXCood(), holder.getYCood(), holder.getSize() * 2, holder.getSize());
                g2d.fill(rec2);
                g2d.setColor(Color.WHITE);

                if (holder.getNum1() == 1) {
                    g2d.fill(centerOne);
                }
                if (holder.getNum1() == 2) {
                    g2d.fill(topRightTwo);
                    g2d.fill(bottomLeftTwo);

                }
                if (holder.getNum1() == 3) {
                    g2d.fill(topRightTwo);
                    g2d.fill(centerOne);
                    g2d.fill(bottomLeftTwo);
                }
                if (holder.getNum1() == 4) {
                    g2d.fill(topRightTwo);
                    g2d.fill(bottomLeftTwo);
                    g2d.fill(topLeftFour);
                    g2d.fill(bottomRightFour);
                }
                if (holder.getNum1() == 5) {
                    g2d.fill(topRightTwo);
                    g2d.fill(bottomLeftTwo);
                    g2d.fill(topLeftFour);
                    g2d.fill(bottomRightFour);
                    g2d.fill(centerOne);
                }
                if (holder.getNum1() == 6) {
                    g2d.fill(topRightTwo);
                    g2d.fill(bottomLeftTwo);
                    g2d.fill(topLeftFour);
                    g2d.fill(bottomRightFour);
                    g2d.fill(centerLeftSix);
                    g2d.fill(centerRightSix);
                }
                if (holder.getNum2() == 1) {
                    g2d.fill(centerRightDomino);
                }
                if (holder.getNum2() == 2) {
                    g2d.fill(topRightRightDomino);
                    g2d.fill(bottomLeftRightDomino);


                }
                if (holder.getNum2() == 3) {
                    g2d.fill(centerRightDomino);
                    g2d.fill(topRightRightDomino);
                    g2d.fill(bottomLeftRightDomino);
                }
                if (holder.getNum2() == 4) {
                    g2d.fill(topRightRightDomino);
                    g2d.fill(bottomLeftRightDomino);
                    g2d.fill(bottomRightRightDomino);
                    g2d.fill(topLeftRightDomino);

                }
                if (holder.getNum2() == 5) {
                    g2d.fill(topRightRightDomino);
                    g2d.fill(bottomLeftRightDomino);
                    g2d.fill(bottomRightRightDomino);
                    g2d.fill(topLeftRightDomino);
                    g2d.fill(centerRightDomino);
                }
                if (holder.getNum2() == 6) {
                    g2d.fill(topRightRightDomino);
                    g2d.fill(bottomLeftRightDomino);
                    g2d.fill(bottomRightRightDomino);
                    g2d.fill(topLeftRightDomino);
                    g2d.fill(topCenterRightDomino);
                    g2d.fill(bottomCenterRightDomino);

                }


                g2d.drawLine((holder.getXCood() + holder.getSize()), holder.getYCood(), (holder.getXCood() + holder.getSize()), (holder.getYCood() + holder.getSize()));
            } else if (holder.getOrientation() == "V") {
                Rectangle recReverse = new Rectangle(holder.getXCood(), holder.getYCood(), holder.getSize(), holder.getSize() * 2);
                g2d.setColor(Color.BLACK);
                g2d.fill(recReverse);
                g2d.setColor(Color.white);


                if (holder.getNum1() == 1) {
                    g2d.fill(centerOne);
                }
                if (holder.getNum1() == 2) {
                    g2d.fill(bottomRightFour);
                    g2d.fill(topLeftFour);

                }
                if (holder.getNum1() == 3) {
                    g2d.fill(topLeftFour);
                    g2d.fill(centerOne);
                    g2d.fill(bottomRightFour);
                }
                if (holder.getNum1() == 4) {
                    g2d.fill(topRightTwo);
                    g2d.fill(bottomLeftTwo);
                    g2d.fill(topLeftFour);
                    g2d.fill(bottomRightFour);
                }
                if (holder.getNum1() == 5) {
                    g2d.fill(topRightTwo);
                    g2d.fill(bottomLeftTwo);
                    g2d.fill(topLeftFour);
                    g2d.fill(bottomRightFour);
                    g2d.fill(centerOne);
                }
                if (holder.getNum1() == 6) {
                    g2d.fill(topRightTwo);
                    g2d.fill(bottomLeftTwo);
                    g2d.fill(topLeftFour);
                    g2d.fill(bottomRightFour);
                    g2d.fill(verticalLeftCenterSix);
                    g2d.fill(verticalRightCenterSix);
                }
                if (holder.getNum2() == 1) {
                    g2d.fill(centerBottomDomino);
                }
                if (holder.getNum2() == 2) {
                    g2d.fill(topLeftVerticalDomino);
                    g2d.fill(bottomRightVerticalDomino);


                }
                if (holder.getNum2() == 3) {
                    g2d.fill(centerBottomDomino);
                    g2d.fill(topLeftVerticalDomino);
                    g2d.fill(bottomRightVerticalDomino);
                }
                if (holder.getNum2() == 4) {
                    g2d.fill(topLeftVerticalDomino);
                    g2d.fill(bottomRightVerticalDomino);
                    g2d.fill(topRightVerticalDomino);
                    g2d.fill(bottomLeftVerticalDomino);

                }
                if (holder.getNum2() == 5) {
                    g2d.fill(topLeftVerticalDomino);
                    g2d.fill(bottomRightVerticalDomino);
                    g2d.fill(topRightVerticalDomino);
                    g2d.fill(bottomLeftVerticalDomino);
                    g2d.fill(centerBottomDomino);
                }
                if (holder.getNum2() == 6) {
                    g2d.fill(topLeftVerticalDomino);
                    g2d.fill(bottomRightVerticalDomino);
                    g2d.fill(topRightVerticalDomino);
                    g2d.fill(bottomLeftVerticalDomino);
                    g2d.fill(verticalBottomCenterLeft);
                    g2d.fill(verticalBottomCenterRight);

                }
                g2d.drawLine(holder.getXCood(), (holder.getYCood() + holder.getSize()), (holder.getXCood() + holder.getSize()), (holder.getYCood() + holder.getSize()));
            }


    }
    public void errorClear(Domino d)
    {
        d.setNum1(0);
        d.setNum2(0);
        d.setXCoord(0);
        d.setYCoord(0);
        d.setSize(0);
        d.setOrientation("");
    }
    private class DrawHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //finds source of action and creates a domino object for the values entered by user
            if (e.getSource() == draw) {
                try {
                    System.out.println("You hit draw!");
                    s = Integer.parseInt(size.getText());
                    xpoint = Integer.parseInt(dominoCoordinate1.getText());
                    ypoint = Integer.parseInt(dominoCoordinate2.getText());
                    num1 = Integer.parseInt(dominoNumber1.getText());
                    num2 = Integer.parseInt(dominoNumber2.getText());
                    if (vertical.isSelected()) {
                        orientationHold = "V";
                    }
                    if (horizontal.isSelected()) {
                        orientationHold = "H";
                    }
                    holder.setNum1(num1);
                    holder.setNum2(num2);
                    holder.setXCoord(xpoint);
                    holder.setYCoord(ypoint);
                    holder.setSize(s);
                    holder.setOrientation(orientationHold);

                    System.out.println(holder.toString());



                    //general catch based on the size of the frame etc.
                    if (holder.getYCood() < 38 || holder.getYCood() > 360 || holder.getXCood() < 9 || holder.getXCood() > 490 )
                    {
                        JOptionPane.showMessageDialog(new JFrame(), "The domino's starting coordinate will be off the screen, try again!");
                        errorClear(holder);
                    }

                    //Vertical orientation catch
                    else if (holder.getOrientation() == "V") {
                        if (((holder.getSize() * 2) + holder.getYCood()) > 350) {
                            JOptionPane.showMessageDialog(new JFrame(), "The domino is too large to fit on the screen, try again!");
                            errorClear(holder);
                        }
                        if(((holder.getSize() *2 ) + holder.getXCood()) > 500)
                        {
                            JOptionPane.showMessageDialog(new JFrame(), "The domino is too large to fit on the screen, try again!");
                            errorClear(holder);
                        }
                    }

                    //Horizontal orientation catch
                    else if (holder.getOrientation() == "H") {
                        if (((holder.getSize() * 2) + holder.getXCood()) > 490) {
                            JOptionPane.showMessageDialog(new JFrame(), "The domino is too large to fit on the screen, try again!");
                            errorClear(holder);
                        }
                    }

                    repaint();

                }
                catch(NumberFormatException n)
                {
                    System.out.println("This is not a number");
                    System.out.println(n.getMessage());
                    JOptionPane.showMessageDialog(null, "One of the required text fields are empty. Make sure to fill all domino information out. Try again!");
                }
            }
            else if (e.getSource() == clear)
            {
                errorClear(holder);
                repaint();
                System.out.println("You hit clear!");
            }
            else if (e.getSource() == exit)
            {
                System.out.println("You hit exit");
                System.exit(0);
            }
        }
    }

}
