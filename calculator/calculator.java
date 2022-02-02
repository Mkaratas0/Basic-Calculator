
package calculator;

import java.awt.Container;

/**
 *
 * @author mstfk
 */
public class calculator extends javax.swing.JFrame implements Calculations {

    
    public calculator() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        percentageButton = new javax.swing.JButton();
        Sqrtbutton = new javax.swing.JButton();
        oneByxButton = new javax.swing.JButton();
        dotButton = new javax.swing.JButton();
        negatıveAndPozitifbutton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        xsquaredButton = new javax.swing.JButton();
        multiplicationButton = new javax.swing.JButton();
        CEbutton = new javax.swing.JButton();
        Cbutton = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        divisionButton = new javax.swing.JButton();
        SevenButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        equalsButton = new javax.swing.JButton();
        FourButton = new javax.swing.JButton();
        OneButton = new javax.swing.JButton();
        fivebutton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        ThreeButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        percentageButton.setBackground(new java.awt.Color(153, 255, 255));
        percentageButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        percentageButton.setText("%");
        percentageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentageButtonActionPerformed(evt);
            }
        });

        Sqrtbutton.setBackground(new java.awt.Color(153, 255, 255));
        Sqrtbutton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Sqrtbutton.setText("Sqrt");
        Sqrtbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SqrtbuttonActionPerformed(evt);
            }
        });

        oneByxButton.setBackground(new java.awt.Color(153, 255, 255));
        oneByxButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        oneByxButton.setText("1/x");
        oneByxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneByxButtonActionPerformed(evt);
            }
        });

        dotButton.setBackground(new java.awt.Color(153, 255, 255));
        dotButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dotButton.setText(".");
        dotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotButtonActionPerformed(evt);
            }
        });

        negatıveAndPozitifbutton.setBackground(new java.awt.Color(153, 255, 255));
        negatıveAndPozitifbutton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        negatıveAndPozitifbutton.setText("+-");
        negatıveAndPozitifbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negatıveAndPozitifbuttonActionPerformed(evt);
            }
        });

        zeroButton.setBackground(new java.awt.Color(153, 255, 255));
        zeroButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        zeroButton.setText("0");
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });

        xsquaredButton.setBackground(new java.awt.Color(153, 255, 255));
        xsquaredButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        xsquaredButton.setText("x2");
        xsquaredButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xsquaredButtonActionPerformed(evt);
            }
        });

        multiplicationButton.setBackground(new java.awt.Color(153, 255, 255));
        multiplicationButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        multiplicationButton.setText("*");
        multiplicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicationButtonActionPerformed(evt);
            }
        });

        CEbutton.setBackground(new java.awt.Color(153, 255, 255));
        CEbutton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CEbutton.setText("CE");
        CEbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEbuttonActionPerformed(evt);
            }
        });

        Cbutton.setBackground(new java.awt.Color(153, 255, 255));
        Cbutton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Cbutton.setText("C");
        Cbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbuttonActionPerformed(evt);
            }
        });

        backbutton.setBackground(new java.awt.Color(153, 255, 255));
        backbutton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backbutton.setText("<-");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        divisionButton.setBackground(new java.awt.Color(153, 255, 255));
        divisionButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        divisionButton.setText("/");
        divisionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionButtonActionPerformed(evt);
            }
        });

        SevenButton.setBackground(new java.awt.Color(153, 255, 255));
        SevenButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SevenButton.setText("7");
        SevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SevenButtonActionPerformed(evt);
            }
        });

        eightButton.setBackground(new java.awt.Color(153, 255, 255));
        eightButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        eightButton.setText("8");
        eightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightButtonActionPerformed(evt);
            }
        });

        nineButton.setBackground(new java.awt.Color(153, 255, 255));
        nineButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nineButton.setText("9");
        nineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineButtonActionPerformed(evt);
            }
        });

        equalsButton.setBackground(new java.awt.Color(153, 255, 255));
        equalsButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        equalsButton.setText("=");
        equalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsButtonActionPerformed(evt);
            }
        });

        FourButton.setBackground(new java.awt.Color(153, 255, 255));
        FourButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        FourButton.setText("4");
        FourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourButtonActionPerformed(evt);
            }
        });

        OneButton.setBackground(new java.awt.Color(153, 255, 255));
        OneButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        OneButton.setText("1");
        OneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneButtonActionPerformed(evt);
            }
        });

        fivebutton.setBackground(new java.awt.Color(153, 255, 255));
        fivebutton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fivebutton.setText("5");
        fivebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fivebuttonActionPerformed(evt);
            }
        });

        twoButton.setBackground(new java.awt.Color(153, 255, 255));
        twoButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        twoButton.setText("2");
        twoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtonActionPerformed(evt);
            }
        });

        sixButton.setBackground(new java.awt.Color(153, 255, 255));
        sixButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sixButton.setText("6");
        sixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixButtonActionPerformed(evt);
            }
        });

        ThreeButton.setBackground(new java.awt.Color(153, 255, 255));
        ThreeButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ThreeButton.setText("3");
        ThreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreeButtonActionPerformed(evt);
            }
        });

        minusButton.setBackground(new java.awt.Color(153, 255, 255));
        minusButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minusButton.setText("-");
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });

        plusButton.setBackground(new java.awt.Color(153, 255, 255));
        plusButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        plusButton.setText("+");
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 153, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CEbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SevenButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(OneButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(FourButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(percentageButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(5, 5, 5)
                                            .addComponent(Sqrtbutton))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Cbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fivebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(twoButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(negatıveAndPozitifbutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(sixButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(xsquaredButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nineButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ThreeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(minusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(plusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(divisionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(oneByxButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(multiplicationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(equalsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(percentageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneByxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sqrtbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xsquaredButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CEbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divisionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multiplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fivebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(negatıveAndPozitifbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equalsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void percentageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentageButtonActionPerformed
        // TODO add your handling code here:
        if(jLabel1.getText().length()>0 && jTextField1.getText().length()>0){
            toBeCalculatedValue =Double.parseDouble(( jTextField1.getText()));
            percentage(Double.parseDouble(jLabel1.getText().split(" ") [0]), toBeCalculatedValue );
        }
    }//GEN-LAST:event_percentageButtonActionPerformed
    private void oneByX(double a) {
     jTextField1.setText(Double.toString(1/a));
    }
    private void square(double a) {
        jTextField1.setText(Double.toString(a*=a));
    }
    private void sqrRoot(double a) {
        jTextField1.setText(Double.toString(Math.sqrt(a)));
    }
    private void percentage(double a, double b) {
    switch(sign){
        case"+":
            add(((a*b)/100),a);
            break;
            
            case"-":
            substract(((a*b)/100),a);
            break;
            
            case"*":
            multiply(((a*b)/100),a);
            break;
            
            case"/":
            divide(((a*b)/100),a);
            break;
    
   
    }
}
    private void SqrtbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SqrtbuttonActionPerformed
     toBeCalculatedValue= Double.parseDouble(jTextField1.getText());
    sqrRoot(toBeCalculatedValue);        
        
    }//GEN-LAST:event_SqrtbuttonActionPerformed

    private void oneByxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneByxButtonActionPerformed
if(jTextField1.getText().length()>0) {
            toBeCalculatedValue = Double.parseDouble(jTextField1.getText());
            oneByX(toBeCalculatedValue);        
    }//GEN-LAST:event_oneByxButtonActionPerformed
 
 }
    private void dotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotButtonActionPerformed
        // TODO add your handling code here:
        if(!isDecimal){
        jTextField1.setText(jTextField1.getText() + ".");
        isDecimal = true;
    }//GEN-LAST:event_dotButtonActionPerformed
    }
    private void negatıveAndPozitifbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negatıveAndPozitifbuttonActionPerformed
        
       String value= jTextField1.getText();
        
        if (!value.contains("-")){
          jTextField1.setText('-' + value);
        } else {
        
        }
        
    
            try{
          jTextField1.setText(value.split("-")[1]);
     }     catch(IndexOutOfBoundsException e) {
     }
     
                   
    }//GEN-LAST:event_negatıveAndPozitifbuttonActionPerformed

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroButtonActionPerformed
      
      jTextField1.setText(jTextField1.getText() + "0");
    }//GEN-LAST:event_zeroButtonActionPerformed

    private void xsquaredButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xsquaredButtonActionPerformed
        
        if(jTextField1.getText().length()>0) {
            toBeCalculatedValue = Double.parseDouble(jTextField1.getText());
            square(toBeCalculatedValue);
        }
    }//GEN-LAST:event_xsquaredButtonActionPerformed

    private void multiplicationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicationButtonActionPerformed
        
        sign = "*";
        if(jTextField1.getText().length()>0){
        storeToBeCalculatedValue(sign);
        }
    }//GEN-LAST:event_multiplicationButtonActionPerformed

    private void CEbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEbuttonActionPerformed
        
        jTextField1.setText("");
    }//GEN-LAST:event_CEbuttonActionPerformed

    private void CbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbuttonActionPerformed
       
        jTextField1.setText("");
        jLabel1.setText("");
        
    }//GEN-LAST:event_CbuttonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        
        
        String value = jTextField1.getText();
        int length =value.length();
        if(length > 0) {
            StringBuilder builder = new StringBuilder(value);
            builder.deleteCharAt(length-1);
            jTextField1.setText(builder.toString());
        }
        
    }//GEN-LAST:event_backbuttonActionPerformed

    private void divisionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionButtonActionPerformed
        
        sign = "/";
        if(jTextField1.getText().length()>0) {
            storeToBeCalculatedValue(sign);
        }
    }//GEN-LAST:event_divisionButtonActionPerformed

    private void SevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SevenButtonActionPerformed
        
        jTextField1.setText(jTextField1.getText() + "7");;
    }//GEN-LAST:event_SevenButtonActionPerformed

    private void eightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightButtonActionPerformed
        
        jTextField1.setText(jTextField1.getText() + "8");
    }//GEN-LAST:event_eightButtonActionPerformed

    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineButtonActionPerformed
        
        jTextField1.setText(jTextField1.getText() + "9");
    }//GEN-LAST:event_nineButtonActionPerformed

    private void equalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsButtonActionPerformed
        
        if(jTextField1.getText().length()>0) {
            double b = Double.parseDouble(jTextField1.getText());
        
        switch(sign) {
            case "+":
                
                add(toBeCalculatedValue,b);
                break;
                case "-":
                
                substract(toBeCalculatedValue,b);
                break;
                case "*":
                
                multiply(toBeCalculatedValue,b);
                break;
                case "/":
                
                divide(toBeCalculatedValue,b);
                break;
            }
        
        }
        
    }//GEN-LAST:event_equalsButtonActionPerformed

    private void FourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourButtonActionPerformed
        
        jTextField1.setText(jTextField1.getText() + "4");
    }//GEN-LAST:event_FourButtonActionPerformed

    private void OneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneButtonActionPerformed
        
        jTextField1.setText(jTextField1.getText() + "1");
        
    }//GEN-LAST:event_OneButtonActionPerformed

    private void fivebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fivebuttonActionPerformed
        
        jTextField1.setText(jTextField1.getText() + "5");
    }//GEN-LAST:event_fivebuttonActionPerformed

    private void twoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoButtonActionPerformed
        
        jTextField1.setText(jTextField1.getText() + "2");
    }//GEN-LAST:event_twoButtonActionPerformed

    private void sixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixButtonActionPerformed
        
        jTextField1.setText(jTextField1.getText() + "6");
    }//GEN-LAST:event_sixButtonActionPerformed

    private void ThreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreeButtonActionPerformed
        
        jTextField1.setText(jTextField1.getText() + "3");
    }//GEN-LAST:event_ThreeButtonActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        
        sign = "-";
        if(jTextField1.getText().length()>0){
        storeToBeCalculatedValue(sign);
        }
    }//GEN-LAST:event_minusButtonActionPerformed

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        
        sign = "+";
        if(jTextField1.getText().length()>0){
        storeToBeCalculatedValue(sign);
        }
    }//GEN-LAST:event_plusButtonActionPerformed

    @Override
    public void add(double a, double b) {
        setResult(a+b);
        
    }

    @Override
    public void substract(double a, double b) {
        setResult(a-b);
       
    }

    @Override
    public void divide(double a, double b) {
        setResult(a/b);
        
    }

    @Override
    public void multiply(double a, double b) {
        setResult(a*b);
       
    }


         
    private void setResult(double result) {
        
        jTextField1.setText(Double.toString(result));
        jLabel1.setText("");
    }
    
    private void storeToBeCalculatedValue(String sign) {
        String value = jTextField1.getText();
        toBeCalculatedValue = Double.parseDouble(value);
        jLabel1.setText(value +" " + sign);
        jTextField1.setText(" ");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }
    private String sign;
    private boolean isDecimal = false;
    private double toBeCalculatedValue;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CEbutton;
    private javax.swing.JButton Cbutton;
    private javax.swing.JButton FourButton;
    private javax.swing.JButton OneButton;
    private javax.swing.JButton SevenButton;
    private javax.swing.JButton Sqrtbutton;
    private javax.swing.JButton ThreeButton;
    private javax.swing.JButton backbutton;
    private javax.swing.JButton divisionButton;
    private javax.swing.JButton dotButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton equalsButton;
    private javax.swing.JButton fivebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton multiplicationButton;
    private javax.swing.JButton negatıveAndPozitifbutton;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oneByxButton;
    private javax.swing.JButton percentageButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton xsquaredButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
}
