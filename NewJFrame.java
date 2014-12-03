package app1;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author skulitom
 */
public class NewJFrame extends javax.swing.JFrame {
    
    int xx,yy,nx,ny, r1y,r1x; // co-ordinates 
    int count = 1;
    boolean radio1,radio2,radio3,radioDA;// radio button indetification
    boolean locked = true; //bolean which decides if the button begin was pressed
    int kradio1 = 0; //count for radio button indetification
    int kradio2 = 0;
    int kradio3 = 0;
    int kradio4 = 0;

    

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        
        setIcon();
        clearFile();
        initComponents();
       this.getContentPane().setBackground(new java.awt.Color(200, 200, 100));
    }
    public void clearFile(){
    try {
 
			String content = "";
 
			File file = new File("text.txt");
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
                        long length = file.length();
                        

		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        choice1 = new java.awt.Choice();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jRadioButton2.setText("jRadioButton2");

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Draw a Path");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        buttonGroup6.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        jRadioButton3.setText("Draw Path");
        jRadioButton3.setMargin(new java.awt.Insets(10, 2, 2, 2));
        jRadioButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jradio1(evt);
            }
        });

        buttonGroup6.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        jRadioButton4.setText("Draw Guidelines");
        jRadioButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButton4.setMargin(new java.awt.Insets(10, 2, 2, 2));
        jRadioButton4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jradio2(evt);
            }
        });
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        buttonGroup6.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        jRadioButton5.setText("Move view");
        jRadioButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButton5.setMargin(new java.awt.Insets(10, 2, 2, 2));
        jRadioButton5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jradio3(evt);
            }
        });

        jSlider1.setMajorTickSpacing(20);
        jSlider1.setMinorTickSpacing(5);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jLabel1.setText("Zoom:");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jButton1.setBackground(new java.awt.Color(240, 100, 100));
        jButton1.setText("Click To Begin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(100, 100, 100));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        buttonGroup6.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        jRadioButton6.setText("Draw Danger Area");
        jRadioButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButton6.setMargin(new java.awt.Insets(10, 2, 2, 2));
        jRadioButton6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jradio4(evt);
            }
        });
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(240, 240, 100));
        jButton2.setText("Refresh");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(100, 100, 240));
        jButton3.setText("Finish & upload");

        jLabel2.setForeground(new java.awt.Color(100, 100, 100));
        jLabel2.setText("By A.S");

        jButton4.setBackground(new java.awt.Color(100, 240, 100));
        jButton4.setText("Default settings");
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Zoom = 0.0");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jRadioButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jRadioButton3, jRadioButton4, jRadioButton5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(168, 168, 168)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>                        

    private void jradio1(java.awt.event.ItemEvent evt) {                         
        kradio1++;
        // an algorithm which decides if the radio button is on or off
        if (kradio1 % 2 == 0) {
            radio1 = false;
            count = 1; // removes old coordinates so they are not saved to a different function
        } else {
            radio1 = true;
            if(kradio1 > 1){
            count = 2;
            }
            
        }

    }                        

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
if (locked == true) {
          Graphics g = jPanel1.getGraphics();
    g.setFont(g.getFont().deriveFont(20f));
    g.drawString("Instructions: Please select the draw type on the right", 10, 30);
    g.drawString("and Click begin at the bottom right when ready.", 10, 60);
    g.dispose();
          
        }
    }                                    

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        if (locked == true) {
         
          
        } /////////////////////////////////////////////////
        /////////////////////////////////////////////////
        else if (radio1 == true) {
            Graphics2D gfx = (Graphics2D) jPanel1.getGraphics();
            gfx.setColor(Color.MAGENTA);

            final Point pos = evt.getPoint();
            final int x = pos.x;
            final int y = pos.y;
            
            if (count > 1) {
                gfx.drawLine(r1x, r1y, x, y);
            }
            r1x = x;// different int variables in order to create a continious line
            r1y = y;
            Print(r1x,r1y);
            count++;
        } /////////////////////////////////////////////////
        /////////////////////////////////////////////////
        else if (radio2 == true) {
            Graphics2D gfx = (Graphics2D) jPanel1.getGraphics();
            gfx.setColor(Color.BLUE);

            final Point pos = evt.getPoint();
            final int x = pos.x;
            final int y = pos.y;
            
            if (count > 1) {
                gfx.drawLine(nx, ny, x, y); // draws a line from old to new co-o
            }
            nx = x;
            ny = y;
            count++;
        } /////////////////////////////////////////////////
        /////////////////////////////////////////////////
        else if (radio3 == true) {

            Graphics2D gfx = (Graphics2D) jPanel1.getGraphics();
            gfx.setColor(Color.BLACK);

            final Point pos = evt.getPoint();
            final int x = pos.x;
            final int y = pos.y;
            gfx.fillOval(x, y, 5, 5);
            
        } /////////////////////////////////////////////////
        /////////////////////////////////////////////////
        else if (radioDA == true) {
            Graphics2D gfx = (Graphics2D) jPanel1.getGraphics();
            
            //{
            gfx.setColor(new Color(100, 100, 100));
            
            if (xx - nx <= 0 && yy - ny > 0) {

                gfx.fillRect(xx, ny, nx - xx, (yy - ny));

            } else if (yy - ny <= 0 && xx - nx > 0) {

                gfx.fillRect(nx, yy, (xx - nx), ny - yy);

            } else if (yy - ny <= 0 && xx - nx <= 0) {

                gfx.fillRect(xx, yy, nx - xx, ny - yy);

            } else {

                gfx.fillRect(nx, ny, (xx - nx), (yy - ny));

            }
        //} erases old rectangle
            
            gfx.setColor(new Color(160, 160, 60));
            

            final Point pos = evt.getPoint();
            final int x = pos.x;
            final int y = pos.y;
            if (count == 1) {
                nx = x;
                ny = y;
            }
            
            xx = x;
            yy = y;
            if (xx - nx <= 0 && yy - ny > 0) {

                gfx.fillRect(xx, ny, nx - xx, (yy - ny));
                

            } else if (yy - ny <= 0 && xx - nx > 0) {

                gfx.fillRect(nx, yy, (xx - nx), ny - yy);
                

            } else if (yy - ny <= 0 && xx - nx <= 0) {

                gfx.fillRect(xx, yy, nx - xx, ny - yy);
                

            } else {

                gfx.fillRect(nx, ny, (xx - nx), (yy - ny));
                

            }
            count++;
            
            
            
        } else {
        }


    }                                    
    public void Get_Rectco_o() {
        int hy, hx; /// holds x and y values
        
        if (xx - nx <= 0 && yy - ny > 0) {
            hy = yy;
            yy = ny;
            nx = nx - xx;
            ny = hy - ny;

        } else if (yy - ny <= 0 && xx - nx > 0) {
            hx = xx;
            xx = nx;
            nx = hx - nx;
            ny = ny - yy;

        } else if (yy - ny <= 0 && xx - nx <= 0) {
            nx = nx - xx;
            ny = ny - yy;

        } else {
            hx = xx;
            hy = yy;
            xx = nx;
            yy = ny;
            nx = hx - nx;
            ny = hy - ny;
           

        }
        
    }
    public void Print(int x, int y){
    try {
        int xx,yy;
                        
			String content = "";
                        if(x-10 < 0){
                        content =  "0" +"0"+ Integer.toString(x);
                        }
                        else if(y-10 < 0){
                        content = content +  "0" +"0"+ Integer.toString(y);
                        }
                        else if(x-100 < 0){
                        content =  "0" + Integer.toString(x);
                        }
                        else if(y-100 < 0){
                        content = content  +"0"+ Integer.toString(y);
                        }
                        else{
                        content =  Integer.toString(x);
                        content = content + Integer.toString(y);
                        }
 
			File file = new File("text.rtf");
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
                        
 
			Writer output;
                        output = new BufferedWriter(new FileWriter("text.rtf", true));
                        output.append(content);
                        output.close();
 
			
 
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        if (radio2 || radio3 || radioDA == true) {
            count = 1;
            xx = 0;
            yy = 0;
            nx = 0;
            ny = 0;
        }
        else if (radio1 == true){
        xx = 0;
        yy = 0;
        nx = 0;
        ny = 0;
        
        }
        if(radioDA == true){
        
        Graphics2D gfx = (Graphics2D) jPanel1.getGraphics();
            gfx.setColor(new Color(100, 100, 100));
            if (xx - nx <= 0 && yy - ny > 0) {

                gfx.fillRect(xx, ny, nx - xx, (yy - ny));

            } else if (yy - ny <= 0 && xx - nx > 0) {

                gfx.fillRect(nx, yy, (xx - nx), ny - yy);

            } else if (yy - ny <= 0 && xx - nx <= 0) {

                gfx.fillRect(xx, yy, nx - xx, ny - yy);

            } else {

                gfx.fillRect(nx, ny, (xx - nx), (yy - ny));

            }
        }

    }                                     

    private void jradio2(java.awt.event.ItemEvent evt) {                         
        // TODO add your handling code here:
        kradio2++; // defines the radiobutton used
        if (kradio2 % 2 == 0) {
            radio2 = false;
        } else {
            radio2 = true;
            
        }// erases past coordinates
    }                        

    private void jradio3(java.awt.event.ItemEvent evt) {                         
        // TODO add your handling code here:
        kradio3++;
        if (kradio3 % 2 == 0) {
            radio3 = false;
        } else {
            radio3 = true;
            

        }
    }                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        locked = false;
        jSlider1.setValue(50);
        Graphics2D gfx = (Graphics2D) jPanel1.getGraphics();
        gfx.setColor(new Color(100, 100, 100));
        gfx.fillRect(0, 0, 700, 500); // erases the screen from graphics
        jButton1.setText("Running...");
        
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        clearFile();
        jSlider1.setValue(50);
        Graphics2D gfx = (Graphics2D) jPanel1.getGraphics();
        gfx.setColor(new Color(100, 100, 100));
        gfx.fillRect(0, 0, 700, 500); // erases the screen from graphics
        //{
        count = 1;
        if(kradio1 % 2 == 0){
        kradio1 = 0;
        }
        else{
        kradio1 = 1;}
        //}enulls co-ordinates
    }                                        

    private void jradio4(java.awt.event.ItemEvent evt) {                         
        // TODO add your handling code here:
        kradio4++;
        if (kradio4 % 2 == 0) {
            radioDA = false;
        } else {
            radioDA = true;
            count = 1; // resets co-oedinates when reclicked
            
        }
    }                        

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        if(radio3 == true){
        setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
        }
        else if(radioDA == true){
        setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        }
    }                                    

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }                                   

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {                                      
        // TODO add your handling code here:
        double value = jSlider1.getValue();       
        Graphics2D gfx = (Graphics2D) jPanel1.getGraphics();
        value = (value - 50)/10;
        jLabel3.setText("Zoom = " + value);
        if(value > 0){
        value++;
        }
        else if(value < 0){
        value--;
        }
        gfx.scale(value, value);
    }                                     

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main (String args[]) {
        
        

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                 break;   
                }
                
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new NewJFrame().setVisible(true);

            }

        });
    }


    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup buttonGroup6;
    private java.awt.Choice choice1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration                   

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LOGO.jpg")));// selects an icon for the jframe
    
    }

}