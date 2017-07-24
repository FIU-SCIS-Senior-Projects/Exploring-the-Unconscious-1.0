
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ruben
 */
public class ExploringTheUnconscious extends javax.swing.JFrame {

    /**
     * Creates new form ExploringTheUnconscious
     */
    public ExploringTheUnconscious() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Question = new javax.swing.JTextField();
        Answer1 = new javax.swing.JTextField();
        Answer2 = new javax.swing.JTextField();
        Answer3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TestCompatibility = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Answer1Result = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Answer2Result = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Answer3Result = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Question.setToolTipText("");

        jLabel1.setText("Question");

        jLabel2.setText("Answer1");

        jLabel3.setText("Answer2");

        jLabel4.setText("Answer3");

        TestCompatibility.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TestCompatibility.setText("Test Compatibility");
        TestCompatibility.setToolTipText("Test the compatibility of your question & answers");
        TestCompatibility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestCompatibilityActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Exploring the Unconscious");

        jLabel6.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        jLabel6.setText("Results");

        jLabel7.setText("Answer1");

        jLabel8.setText("Answer2");

        jLabel9.setText("Answer3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Answer2Result)
                    .addComponent(Answer1Result)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TestCompatibility)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Question, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                .addComponent(Answer1)
                                .addComponent(Answer2)
                                .addComponent(Answer3))))
                    .addComponent(Answer3Result, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(Answer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(Answer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(Answer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TestCompatibility)
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Answer1Result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Answer2Result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Answer3Result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TestCompatibilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestCompatibilityActionPerformed
    String Question = "";
    String Answer1 = "";
    String Answer2 = "";
   
    int tempquest = 0;
    int tempquest2 = 0;
    int tempquest3 = 0;
    int tempquest4 = 0;
    int tempquest5 = 0;
    int tempquest6 = 0;
    int tempquest7 = 0;
    int tempquest8 = 0;
    int tempquest9 = 0;
    int tempA = 0;
    int tempA2 = 0;
    int tempA3 = 0;
    int tempA4 = 0;
    int tempA5 = 0;
    int tempA6 = 0;
    int tempA7 = 0;
    int tempA8 = 0;
    int tempA9 = 0;
    int tempB = 0;
    int tempB2 = 0;
    int tempB3 = 0;
    int tempB4 = 0;
    int tempB5 = 0;
    int tempB6 = 0;
    int tempB7 = 0;
    int tempB8 = 0;
    int tempB9 = 0;
    char[] chr1 = {'a', 'j', 's'};
    char[] chr2 = {'b', 'k', 't'};
    char[] chr3 = {'c', 'l', 'u'};
    char[] chr4 = {'d', 'm', 'v'};
    char[] chr5 = {'e', 'n', 'w'};
    char[] chr6 = {'f', 'o', 'x'};
    char[] chr7 = {'g', 'p', 'y'};
    char[] chr8 = {'h', 'q', 'z'};
    char[] chr9 = {'i', 'r'};
    int modQ = 0;
    int modA1 = 0;
    int modA2 = 0;
    int modQdigit1 = 0;
    int modQdigit2 = 0;
    int modresultQ = 0;
    int modresult = 0;
    int Qdigit3 = 0;
    int modAdigit2 = 0;
    int modAresult = 0;
    int Adigit3 = 0;
    int modBdigit2 = 0;
    int modBresult = 0;
    int Bdigit3 = 0;
    //Sum of question and 1st answer
    int SumA1 = 0;
    int SumA2 = 0;
    int SumA3 = 0;
    //Sum of question and 2nd answer
    int SumB1 = 0;
    int SumB2 = 0;
    int SumB3 = 0;
    //Sum of question and 3rd answer
    int SumC1 = 0;
    int SumC2 = 0;
    int SumC3 = 0;
    //1st Answer sum
    int modSum3 = 0;
    int modSum2 = 0;
    int modSum1 = 0;
    //2nd Answer sum
    int modS3 = 0;
    int modS2 = 0;
    int modS1 = 0;
    //3rd Answer sum
    int modCS3 = 0;
    int modCS2 = 0;
    int modCS1 = 0;
    //1st
    int modSumA1 = 0;
    int modSumA2 = 0;
    //2nd
    int modSumB1 = 0;
    int modSumB2 = 0;
    //3rd 
    int modSumC1 = 0;
    int modSumC2 = 0;
    //user question
    String YN = "";
    //if digit 1 for answers is > 9
    int modA1d1 = 0;
    int modA2d1 = 0;
    int modA2d3 = 0;
    ////////Answer3 variables///////////////
    String Answer3 = "";
    int Cdigit2 = 0;
    int modA3d1 = 0;
    int modCdigit2 = 0;
    int modCresult = 0;
    int Cdigit3 = 0;
    /////modding the 2nd digit if still too big/////
    int modmod = 0;
    int modAmod = 0;
    int modBmod = 0;
    int modCmod = 0;
    
    /////////////////////work///////////////////
    
    Question = this.Question.getText();
    Question =  Question.toLowerCase();
    if(Question.matches("[1-9][0-9]*")){
        JOptionPane.showMessageDialog(this,"You must write out numbers", "Error",JOptionPane.ERROR_MESSAGE);
        return;
    }
    Answer1 = this.Answer1.getText();
    Answer1 = Answer1.toLowerCase();
     if(Answer1.matches("[1-9][0-9]*")){
        JOptionPane.showMessageDialog(this,"You must write out numbers", "Error",JOptionPane.ERROR_MESSAGE);
        return;
    }
    Answer2 = this.Answer2.getText();
    Answer2 = Answer2.toLowerCase();
     if(Answer2.matches("[1-9][0-9]*")){
        JOptionPane.showMessageDialog(this,"You must write out numbers", "Error",JOptionPane.ERROR_MESSAGE);
        return;
    }
    Answer3 = this.Answer3.getText();
    Answer3 = Answer3.toLowerCase();
     if(Answer3.matches("[1-9][0-9]*")){
        JOptionPane.showMessageDialog(this,"You must write out numbers", "Error",JOptionPane.ERROR_MESSAGE);
        return;
    }
     
     int Qdigit1 = Question.replace("//s ", "").length();
     int A1d1 = Answer1.replace("//s ", "").length();
     int A2d1 = Answer2.replace("//s ", "").length();
     int A3d1 = Answer3.replace("//s ", "").length();
      /////////////////////////////////////////Calculating Questions 2nd digit/////////////////////////////////////////////////////////////////
     for (int i = 0; i < Qdigit1; i++){
        for (int a = 0; a < chr1.length; a++) {
        if (Question.charAt(i) == chr1[a])
     {
         tempquest++;
         break;
     }
    }
   }
     
     for (int i = 0; i < Qdigit1; i++){
        for (int b = 0; b < chr2.length; b++) {
        if (Question.charAt(i) == chr2[b])
     {
         tempquest2 +=2;
         break;
     }   
    }
   }
     
     for (int i = 0; i < Qdigit1; i++){
        for (int c = 0; c < chr3.length; c++) {
        if (Question.charAt(i) == chr3[c])
     {
         tempquest3 +=3;
        break;
     }   
    }
   }
     
     for (int i = 0; i < Qdigit1; i++){
        for (int d = 0; d < chr4.length; d++) {
        if (Question.charAt(i) == chr4[d])
     {
         tempquest4 +=4;
        break;
     }   
    }
   }
     
     for (int i = 0; i < Qdigit1; i++){
        for (int e = 0; e < chr5.length; e++) {
        if (Question.charAt(i) == chr5[e])
     {
         tempquest5 +=5;
        break;
     }   
    }
   }
     
      for (int i = 0; i < Qdigit1; i++){
        for (int f = 0; f < chr6.length; f++) {
        if (Question.charAt(i) == chr6[f])
     {
         tempquest6 +=6;
       break;
     }   
    }
   }
      
      for (int i = 0; i < Qdigit1; i++){
        for (int g = 0; g < chr7.length; g++) {
        if (Question.charAt(i) == chr7[g])
     {
         tempquest7 +=7;
        break;
     }   
    }
   }
      
       for (int i = 0; i < Qdigit1; i++){
        for (int h = 0; h < chr8.length; h++) {
        if (Question.charAt(i) == chr8[h])
     {
         tempquest8 +=8;
         break;
     }   
    }
   }
       
        for (int i = 0; i < Qdigit1; i++){
        for (int k = 0; k < chr9.length; k++) {
        if (Question.charAt(i) == chr9[k])
     {
         tempquest9 +=9;
         break;
     }   
    }
   }
        int Qdigit2 = tempquest + tempquest2 + tempquest3 + tempquest4 + tempquest5 + tempquest6 + tempquest7 + tempquest8 + tempquest9;
        ////////////////////////////////////Calculating 3rd digit for question///////////////////////////////////////////////////////////
     Qdigit1 = Question.replace(" ", "").length();
     //System.out.println(Qdigit1);
     if (Qdigit1 > 9); {
         modQdigit1 = Qdigit1 % 10;
         Qdigit1 = (Qdigit1/10) + modQdigit1;
         
     } 
     if (Qdigit2 > 9); {
         modQdigit2 = Qdigit2 % 10;
         modresult = (Qdigit2/10) + modQdigit2;

     } 
     if (modresult > 9);{
        modmod = modresult % 10;
        modresult = (modresult/10) + modmod;
    }
     
     if (Qdigit2 < 9){
     Qdigit3 = (Math.abs(Qdigit1 - Qdigit2));
    }
     else
     Qdigit3 = (Math.abs(Qdigit1 - modresult));
    
     ///////////////////////////////////////////////////////Calculating Answer 1's 2nd digit//////////////////////////////////////////////////
      for (int i = 0; i < A1d1; i++){
        for (int a = 0; a < chr1.length; a++) {
        if (Answer1.charAt(i) == chr1[a])
     {
         tempA++;
         break;
     }
    }
   }
     
     for (int i = 0; i < A1d1; i++){
        for (int b = 0; b < chr2.length; b++) {
        if (Answer1.charAt(i) == chr2[b])
     {
         tempA2 +=2;
         break;
     }   
    }
   }
     
     for (int i = 0; i < A1d1; i++){
        for (int c = 0; c < chr3.length; c++) {
        if (Answer1.charAt(i) == chr3[c])
     {
         tempA3 +=3;
         break;
     }   
    }
   }
     
     for (int i = 0; i < A1d1; i++){
        for (int d = 0; d < chr4.length; d++) {
        if (Answer1.charAt(i) == chr4[d])
     {
         tempA4 +=4;
         break;
     }   
    }
   }
     
     for (int i = 0; i < A1d1; i++){
        for (int e = 0; e < chr5.length; e++) {
        if (Answer1.charAt(i) == chr5[e])
     {
         tempA5 +=5;
         break;
     }   
    }
   }
     
      for (int i = 0; i < A1d1; i++){
        for (int f = 0; f < chr6.length; f++) {
        if (Answer1.charAt(i) == chr6[f])
     {
         tempA6 +=6;
         break;
     }   
    }
   }
      
      for (int i = 0; i < A1d1; i++){
        for (int g = 0; g < chr7.length; g++) {
        if (Answer1.charAt(i) == chr7[g])
     {
         tempA7 +=7;
         break;
     }   
    }
   }
      
       for (int i = 0; i < A1d1; i++){
        for (int h = 0; h < chr8.length; h++) {
        if (Answer1.charAt(i) == chr8[h])
     {
         tempA8 +=8;
         break;
     }   
    }
   }
       
        for (int i = 0; i < A1d1; i++){
        for (int k = 0; k < chr9.length; k++) {
        if (Answer1.charAt(i) == chr9[k])
     {
         tempA9 +=9;
         break;
     }   
    }
   }
         int Adigit2 = tempA + tempA2 + tempA3 + tempA4 + tempA5 + tempA6 + tempA7 + + tempA8 + tempA9;
         ///////////////////////////////////////////Calculating Answer 1's 3rd digit/////////////////////////////////////////////////////////////
     A1d1 = Answer1.replace(" ", "").length();
     if (A1d1 > 9){
         modA1d1 = A1d1 % 10;
         A1d1 = (A1d1/10) + modA1d1;
          
     }
     
     if (Adigit2 > 9){
         modAdigit2 = Adigit2 % 10;
         modAresult = (Adigit2/10) + modAdigit2;
         
     }
     if (modAresult > 9);{
        modAmod = modAresult % 10;
        modAresult = (modAresult/10) + modAmod;
    }
     if (Adigit2 < 9){
     Adigit3 = (Math.abs(A1d1 - Adigit2));
    }
     else
      Adigit3 = (Math.abs(A1d1 - modAresult));
    // System.out.println("Adigit 3 " + Adigit3);
     /////////////////////////////////////Calculating for Answer's 2 2nd digit A2d1//////////////////////////////////////////////////////////
     for (int i = 0; i < A2d1; i++){
        for (int a = 0; a < chr1.length; a++) {
        if (Answer2.charAt(i) == chr1[a])
     {
         tempB++;
         break;
     }
    }
   }
     
     for (int i = 0; i < A2d1; i++){
        for (int b = 0; b < chr2.length; b++) {
        if (Answer2.charAt(i) == chr2[b])
     {
         tempB2 +=2;
         break;
     }   
    }
   }
     
     for (int i = 0; i < A2d1; i++){
        for (int c = 0; c < chr3.length; c++) {
        if (Answer2.charAt(i) == chr3[c])
     {
         tempB3 +=3;
         break;
     }   
    }
   }
     
     for (int i = 0; i < A2d1; i++){
        for (int d = 0; d < chr4.length; d++) {
        if (Answer2.charAt(i) == chr4[d])
     {
         tempB4 +=4;
         break;
     }   
    }
   }
     
     for (int i = 0; i < A2d1; i++){
        for (int e = 0; e < chr5.length; e++) {
        if (Answer2.charAt(i) == chr5[e])
     {
         tempB5 +=5;
         break;
     }   
    }
   }
     
      for (int i = 0; i < A2d1; i++){
        for (int f = 0; f < chr6.length; f++) {
        if (Answer2.charAt(i) == chr6[f])
     {
         tempB6 +=6;
         break;
     }   
    }
   }
      
      for (int i = 0; i < A2d1; i++){
        for (int g = 0; g < chr7.length; g++) {
        if (Answer2.charAt(i) == chr7[g])
     {
         tempB7 +=7;
         break;
     }   
    }
   }
      
       for (int i = 0; i < A2d1; i++){
        for (int h = 0; h < chr8.length; h++) {
        if (Answer2.charAt(i) == chr8[h])
     {
         tempB8 +=8;
         break;
     }   
    }
   }
       
        for (int i = 0; i < A2d1; i++){
        for (int k = 0; k < chr9.length; k++) {
        if (Answer2.charAt(i) == chr9[k])
     {
         tempB9 +=9;
         break;
     }   
    }
   }
         int Bdigit2 = tempB + tempB2 + tempB3 + tempB4 + tempB5 + tempB6 + tempB7 + + tempB8 + tempB9;
         ///////////////////////////////////////////Calculating Answer 2's 3rd digit/////////////////////////////////////
         A2d1 = Answer2.replace(" ", "").length();
     //System.out.println(A2d1);
     if (A2d1 > 9){
         modA2d1 = A2d1 % 10;
         A2d1 = (A2d1/10) + modA2d1;
          
     }
     
     if (Bdigit2 > 9){
         modBdigit2 = Bdigit2 % 10;
         modBresult = (Bdigit2/10) + modBdigit2;
          
     }
     if (modBresult > 9);{
        modBmod = modBresult % 10;
        modBresult = (modBresult/10) + modBmod;
    }
     if (Bdigit2 < 9){
     Bdigit3 = (Math.abs(A2d1 - Bdigit2));
    }
     else
      Bdigit3 = (Math.abs(A2d1 - modBresult));
     //////////////////////////////////////////////Calculating 3rd answers 2nd digit////////////////////////////////////////////
     for (int i = 0; i < A3d1; i++){
        for (int a = 0; a < chr1.length; a++) {
        if (Answer3.charAt(i) == chr1[a])
     {
         Cdigit2++;
         break;
         
     }//System.out.println("Current value: " + Cdigit2);
    }
   }
     
     for (int i = 0; i < A3d1; i++){
        for (int b = 0; b < chr2.length; b++) {
        if (Answer3.charAt(i) == chr2[b])
     {
         Cdigit2 +=2;
         break;
     }// System.out.println("Current value: " + Cdigit2);  
    }
   }
     
     for (int i = 0; i < A3d1; i++){
        for (int c = 0; c < chr3.length; c++) {
        if (Answer3.charAt(i) == chr3[c])
     {
         Cdigit2 +=3;
         break;
     }// System.out.println("Current value: " + Cdigit2);  
    }
   }
     
     for (int i = 0; i < A3d1; i++){
        for (int d = 0; d < chr4.length; d++) {
        if (Answer3.charAt(i) == chr4[d])
     {
         Cdigit2 +=4;
         break;
     } // System.out.println("Current value: " + Cdigit2); 
    }
   }
     
     for (int i = 0; i < A3d1; i++){
        for (int e = 0; e < chr5.length; e++) {
        if (Answer3.charAt(i) == chr5[e])
     {
         Cdigit2 +=5;
         break;
     } //  System.out.println("Current value: " + Cdigit2);
    }
   }
     
      for (int i = 0; i < A3d1; i++){
        for (int f = 0; f < chr6.length; f++) {
        if (Answer3.charAt(i) == chr6[f])
     {
         Cdigit2 +=6;
         break;
     }  // System.out.println("Current value: " + Cdigit2);
    }
   }
      
      for (int i = 0; i < A3d1; i++){
        for (int g = 0; g < chr7.length; g++) {
        if (Answer3.charAt(i) == chr7[g])
     {
         Cdigit2 +=7;
         break;
     }//  System.out.println("Current value: " + Cdigit2); 
    }
   }
      
       for (int i = 0; i < A3d1; i++){
        for (int h = 0; h < chr8.length; h++) {
        if (Answer3.charAt(i) == chr8[h])
     {
         Cdigit2 +=8;
         break;
     } // System.out.println("Current value: " + Cdigit2); 
    }
   }
       
        for (int i = 0; i < A3d1; i++){
        for (int k = 0; k < chr9.length; k++) {
        if (Answer3.charAt(i) == chr9[k])
     {
         Cdigit2 +=9;
         break;
     } // System.out.println("Current value: " + Cdigit2); 
    }
   }
        
       // System.out.println("Final Cdigit:" + Cdigit2);
      ///////////////////////////////////////////Calculating Answer 2's 3rd digit/////////////////////////////////////
        A3d1 = Answer3.replace(" ", "").length();
        if (A3d1 > 9){
         modA3d1 = A3d1 % 10;
         A3d1 = (A3d1/10) + modA3d1;
          
     }
     
     if (Cdigit2 > 9){
         modCdigit2 = Cdigit2 % 10;
         modCresult = (Cdigit2/10) + modCdigit2;
          
     }
     if (modCresult > 9);{
        modCmod = modCresult % 10;
        modCresult = (modCresult/10) + modCmod;
    }
     if (Cdigit2 < 9){
     Cdigit3 = (Math.abs(A3d1 - Cdigit2));
    }
     else
      Cdigit3 = (Math.abs(A3d1 - modCresult));
     //////////////////////////////////////////////Collecting Sum of question and 1st answer/////////////////////////////////////////////////////////////
     SumA3 = Adigit3 + Qdigit3;
    // System.out.println("SumA3: " + SumA3);
    // System.out.println("SumAdigit3: " + Adigit3);
    // System.out.println("SumQdigit3: " + Qdigit3);
     if (SumA3 > 9){
         modSum3 = SumA3 % 10;
      //   System.out.println("modSum3: " + modSum3);
         modSumA2 = SumA3/10;
        }
     
     if (Adigit2 > 9 && Qdigit2 > 9){
       //   System.out.println("modAresult: " + modAresult);
       //   System.out.println("modresult: " + modresult);
       //   System.out.println("modSumA2: " + modSumA2);
       //   System.out.println("SumA3: " + SumA3);
         SumA2 = modAresult + modresult + modSumA2;
       //  System.out.println("sum1stA " + SumA2);
     }
     /*if (Adigit2 > 9 && Qdigit2 < 9){
         SumA2 = modAresult + Qdigit2 + modSumA2;
      //   System.out.println("explaination" + modAresult + Qdigit2 + modSumA2);
      //   System.out.println("SumA2 " + SumA2);
     }*/
     else{
        SumA2 = Adigit2 + Qdigit2 + modSumA2; 
      //  System.out.println("Adigit2 " + Adigit2);
      //  System.out.println("Qdigit2 " + Qdigit2);
      //  System.out.println("modSumA2" + modSumA2);
     }
     
      if (SumA2 > 9){
         modSum2 = SumA2 % 10;
      //   System.out.println("modSum2: " + modSum2);
         modSumA1 = SumA2/10;
      //   System.out.println("modSumA1: "+ modSumA1);
        }
     
     SumA1 = A1d1 + Qdigit1 + modSumA1;
    // System.out.println("SumA1: " + SumA1);
     if (SumA1 > 9){
         modSum1 = SumA1 % 10;
         SumA1 = (SumA1/10) + modSum1;
     //    System.out.println("True Sum Digit 1: "+ SumA1); 
     }
    // System.out.println("Sums " + SumA1 + SumA2 + SumA3);
     //System.out.println("Answer1" + A1d1 + Adigit2 + Adigit3);
    
     //Collecting Sum of question and 2nd answer
     SumB3 = Bdigit3 + Qdigit3;
    // System.out.println("SumB3: " + SumB3);
    // System.out.println("Bdigit3: "+ Bdigit3);
    // System.out.println("Qdigit3:" + Qdigit3);
     if (SumB3 > 9){
         modS3 = SumB3 % 10;
        // System.out.println("modSum: " + modS3);
         modSumB2 = SumB3/10;
        }
     
     if (Bdigit2 > 9 && Qdigit2 > 9){
        //  System.out.println("modBresult: " + modBresult);
        //  System.out.println("modresult: " + modresult);
         // System.out.println("modSumA2: " + modSumB2);
         // System.out.println("SumB3: " + SumB3);
         SumB2 = modBresult + modresult + modSumB2;
        // System.out.println("sum1stB " + SumB2);
     }
     /*if (Bdigit2 > 9 && Qdigit2 < 9){
         SumB2 = modBresult + Qdigit2 + modSumB2;
      //   System.out.println("explaination" + modAresult + Qdigit2 + modSumA2);
      //   System.out.println("SumA2 " + SumA2);
     }*/
     else{
        SumB2 = Bdigit2 + Qdigit2 + modSumB2; 
        //System.out.println("sum2ndB " + SumB2);
     }
     
      if (SumB2 > 9){
         modS2 = SumB2 % 10;
        // System.out.println("modSum: " + modS2);
         modSumB1 = SumB2/10;
        }
     
     SumB1 = A2d1 + Qdigit1 + modSumB1;
     if (SumB1 > 9){
         modS1 = SumB1 % 10;
         SumB1 = (SumB1/10) + modS1;
        // System.out.println("True Sum Digit 1: "+ SumB1); 
     }
     ///////////////////////////Sum of Question and 3rd Answer////////////////////////////////////////
      SumC3 = Cdigit3 + Qdigit3;
      
      if(SumC3 > 9){
         modCS3 = SumC3 % 10;
        // System.out.println("modSum: " + modCS3);
         modSumC2 = SumC3/10;
        }
      if (Cdigit2 > 9 && Qdigit2 > 9){
         // System.out.println("modBresult: " + modCresult);
         // System.out.println("modresult: " + modresult);
        //  System.out.println("modSumA2: " + modSumC2);
        //  System.out.println("SumB3: " + SumB3);
         SumC2 = modCresult + modresult + modSumC2;
        // System.out.println("sum1stB " + SumC2);
     }
      /*if (Cdigit2 > 9 && Qdigit2 < 9){
         SumC2 = modCresult + Qdigit2 + modSumC2;
      //   System.out.println("explaination" + modAresult + Qdigit2 + modSumA2);
      //   System.out.println("SumA2 " + SumA2);
     }*/
     else{
        SumC2 = Cdigit2 + Qdigit2 + modSumC2; 
       // System.out.println("sum2ndB " + SumC2);
     }
      if (SumC2 > 9){
         modCS2 = SumC2 % 10;
         //System.out.println("modSum: " + modCS2);
         modSumC1 = SumC2/10;
        }
      SumC1 = A3d1 + Qdigit1 + modSumC1;
     if (SumC1 > 9){
         modCS1 = SumC1 % 10;
         SumC1 = (SumC1/10) + modCS1;
         //System.out.println("True Sum Digit 1: "+ SumC1); 
     }
     if (Qdigit1 == SumA1 || Qdigit1 == modSum1 ||Qdigit1 == SumA2 || Qdigit1 == SumA3 || Qdigit2 == SumA1 || Qdigit2 == modSum1 || Qdigit2 == SumA2 ||Qdigit2 == SumA3 || Qdigit3 == SumA1 || Qdigit3 == modSum1 || Qdigit3 == SumA2 || Qdigit3 == SumA3 /*|| modresult ==SumA1 || modresult == modSum1 || modresult == SumA2 || modresult == SumA3*/){
        // System.out.println("Answer 1: Not Compatible");
         if(A1d1 == SumA1 || A1d1 == modSum1 || A1d1 == SumA2 ||A1d1 == SumA3 || Adigit2 == SumA1 || Adigit2 == modSum1 || Adigit2 == SumA2 ||Adigit2 == SumA3 || Adigit3 == SumA1 || Adigit3 == modSum1 || Adigit3 == SumA2 || Adigit3 == SumA3 /*|| modAresult == SumA1 || modAresult == modSum1 || modAresult == SumA2 || modAresult == SumA3*/){
             this.Answer1Result.setText("Compatible"); 
             if(A1d1 != SumA1 && A1d1 != modSum1 && A1d1 != SumA2 && A1d1 != SumA3 && Adigit2 != SumA1 && Adigit2 != modSum1 && Adigit2 != SumA2 && Adigit2 != SumA3 && Adigit3 != SumA1 && Adigit3 != modSum1 && Adigit3 != SumA2 && Adigit3 != SumA3 /*|| modAresult == SumA1 || modAresult == modSum1 || modAresult == SumA2 || modAresult == SumA3*/){
             this.Answer1Result.setText("Not Compatible"); 
         }
       }
     } 
     else
         this.Answer1Result.setText("Not Compatible");
     if (Qdigit1 == SumA1 || Qdigit1 == modSum1 ||Qdigit1 == SumA2 || Qdigit1 == SumA3 || Qdigit2 == SumA1 || Qdigit2 == modSum1 || Qdigit2 == SumA2 ||Qdigit2 == SumA3 || Qdigit3 == SumA1 || Qdigit3 == modSum1 || Qdigit3 == SumA2 || Qdigit3 == SumA3 /*|| modresult ==SumA1 || modresult == modSum1 || modresult == SumA2 || modresult == SumA3*/){
             if(A1d1 != SumA1 && A1d1 != modSum1 && A1d1 != SumA2 && A1d1 != SumA3 && Adigit2 != SumA1 && Adigit2 != modSum1 && Adigit2 != SumA2 && Adigit2 != SumA3 && Adigit3 != SumA1 && Adigit3 != modSum1 && Adigit3 != SumA2 && Adigit3 != SumA3 /*|| modAresult == SumA1 || modAresult == modSum1 || modAresult == SumA2 || modAresult == SumA3*/){
             this.Answer1Result.setText("Answer 1: Not Compatible"); 
         }
       }
     
     if (Qdigit1 == SumB1 || Qdigit1 == modS1 || Qdigit1 == SumB2 || Qdigit1 == SumB3 || Qdigit2 == SumB1 || Qdigit2 == modS1 || Qdigit2 == SumB2 || Qdigit2 == SumB3 || Qdigit3 == SumB1 || Qdigit3 == modS1 || Qdigit3 == SumB2 || Qdigit3 == SumB3){
         if(A2d1 == SumB1 || A2d1 == modS1 || A2d1 == SumB2 || A2d1 == SumB3 || Bdigit2 == SumB1 || Bdigit2 == modS1 || Bdigit2 == SumB2 || Bdigit2 == SumB3 || Bdigit3 == SumB1 || Bdigit3 == modS1 || Bdigit3 == SumB2 || Bdigit3 == SumB3){
             this.Answer2Result.setText("Compatible"); 
         }
     }
     else
         this.Answer2Result.setText("Not Compatible");
     
     if (Qdigit1 == SumB1 || Qdigit1 == modS1 || Qdigit1 == SumB2 || Qdigit1 == SumB3 || Qdigit2 == SumB1 || Qdigit2 == modS1 || Qdigit2 == SumB2 || Qdigit2 == SumB3 || Qdigit3 == SumB1 || Qdigit3 == modS1 || Qdigit3 == SumB2 || Qdigit3 == SumB3){
         if(A2d1 != SumB1 && A2d1 != modS1 && A2d1 != SumB2 && A2d1 != SumB3 && Bdigit2 != SumB1 && Bdigit2 != modS1 && Bdigit2 != SumB2 && Bdigit2 != SumB3 && Bdigit3 != SumB1 && Bdigit3 != modS1 && Bdigit3 != SumB2 && Bdigit3 != SumB3){
             this.Answer2Result.setText("Not Compatible"); 
         }
     }
     
     if (Qdigit1 == SumC1 || Qdigit1 == modCS1 || Qdigit1 == SumC2 || Qdigit1 == SumC3 || Qdigit2 == SumC1 || Qdigit2 == modCS1 || Qdigit2 == SumC2 || Qdigit2 == SumC3 || Qdigit3 == SumC1 || Qdigit3 == modCS1 || Qdigit3 == SumC2 || Qdigit3 == SumC3){
         if(A3d1 == SumC1 || A3d1 == modCS1 || A3d1 == SumC2 || A3d1 == SumC3 || Cdigit2 == SumC1 || Cdigit2 == modCS1 || Cdigit2 == SumC2 || Cdigit2 == SumC3 || Cdigit3 == SumC1 || Cdigit3 == modCS1 || Cdigit3 == SumC2 || Cdigit3 == SumC3){
             this.Answer3Result.setText("Compatible"); 
         }
     }
     else
         this.Answer3Result.setText("Not Compatible"); 
     
     if (Qdigit1 == SumC1 || Qdigit1 == modCS1 || Qdigit1 == SumC2 || Qdigit1 == SumC3 || Qdigit2 == SumC1 || Qdigit2 == modCS1 || Qdigit2 == SumC2 || Qdigit2 == SumC3 || Qdigit3 == SumC1 || Qdigit3 == modCS1 || Qdigit3 == SumC2 || Qdigit3 == SumC3){
         if(A3d1 != SumC1 && A3d1 != modCS1 && A3d1 != SumC2 && A3d1 != SumC3 && Cdigit2 != SumC1 && Cdigit2 != modCS1 && Cdigit2 != SumC2 && Cdigit2 != SumC3 && Cdigit3 != SumC1 && Cdigit3 != modCS1 && Cdigit3 != SumC2 && Cdigit3 != SumC3){
             this.Answer3Result.setText("Not Compatible"); 
         }
     }
    }//GEN-LAST:event_TestCompatibilityActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ExploringTheUnconscious.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExploringTheUnconscious.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExploringTheUnconscious.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExploringTheUnconscious.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExploringTheUnconscious().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Answer1;
    private javax.swing.JTextField Answer1Result;
    private javax.swing.JTextField Answer2;
    private javax.swing.JTextField Answer2Result;
    private javax.swing.JTextField Answer3;
    private javax.swing.JTextField Answer3Result;
    private javax.swing.JTextField Question;
    private javax.swing.JButton TestCompatibility;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
