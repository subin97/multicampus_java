package project01;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class FrameMain extends Frame implements ActionListener{ // Frame 상
 TextArea ta;
 Button[] btn = new Button[10];
 //int[] string = {"2단", "3단","4단","5단","6단","7단", "8단", "9단"};
 public FrameMain(String title) {
  super(title);
  setLayout(new FlowLayout());
  for(int i = 0; i<8;i++) {
   btn[i] = new Button(i+2+"단");
   btn[i].addActionListener(this);

   add(btn[i]);
  }
  setBounds(700, 700, 700, 400);
  setVisible(true);

  ta = new TextArea("구구단 프로그램\n", 10, 70, TextArea.SCROLLBARS_VERTICAL_ONLY);
  this.add(ta);
  this.setBackground(Color.blue);
  this.addWindowListener(new WindowAdapter() {  //닫기 이벤트 처리
   @Override
   public void windowClosing(WindowEvent e) {
    System.exit(0);
   }
  });

 }

 @Override
 public void actionPerformed(ActionEvent e) {
  // TODO Auto-generated method stub

  Button obj = (Button)e.getSource();

  for(int i= 0;i<8;i++) {
   if(obj == btn[i]) {
    ta.append(((i+2)+"단을 눌렀습니다."));
    ta.append("\n");
     for(int j=1;j<10;j++) {
      ta.append((i+2)+"x"+j+ "="+ ((i+2)*j));
      ta.append("\n");

     }
   }
  }

  }

 public static void main(String[] args) {
  new FrameMain("새 창 띄우기...");
 }

}
